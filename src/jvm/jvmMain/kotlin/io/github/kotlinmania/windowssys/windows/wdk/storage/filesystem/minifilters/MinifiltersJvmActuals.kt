@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DeviceObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.EcpList
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Eresource
import io.github.kotlinmania.windowssys.windows.wdk.foundation.FileObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileLock
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.IoPriorityInfo
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.OpenReparseListEntry
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PcheckForTraverseAccess
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfilterReportChange
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfsrtlExtraCreateParameterCleanupCallback
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PunlockRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoCsqIrpContext
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoDriverCreateContext
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.LockOperation
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WorkQueueType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterVolumeInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FltFilesystemType
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.InstanceInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

private object WindowsWdkStorageFilesystemMinifiltersJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWdkStorageFilesystemMinifiltersJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance: Long, targetinstance: Long, sourcedevicestacksizemodified: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance: Long, fileobject: Long, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance: Long, fileobject: Long, flags: Int, retnewcallbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter: Long, contexttype: Short, contextsize: Long, pooltype: Int, returnedcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, pooltag: Int, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter: Long, ecptype: Long, sizeofcontext: Int, flags: Int, cleanupcallback: Long, lookasidelist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter: Long, flags: Int, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(completelockcallbackdataroutine: Long, unlockroutine: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem(): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance: Long, pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo: Long, outputpriorityinfo: Long, thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter: Long, volume: Long, altitude: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor: Long, desiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance: Long, fileobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count: Int, objectarray: Long, waittype: Int, timeout: Long, waitblockarray: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj: Long, timeout: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance: Long, cbdq: Long, cbdqinsertio: Long, cbdqremoveio: Long, cbdqpeeknextio: Long, cbdqacquire: Long, cbdqrelease: Long, cbdqcompletecanceledio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq: Long, cbd: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl: Long, newsize: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock: Long, callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter: Long, clientport: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1: Long, instance2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata: Long, callbackstatus: Int, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter: Long, data: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter: Long, serverport: Long, objectattributes: Long, serverportcookie: Long, connectnotifycallback: Long, disconnectnotifycallback: Long, messagenotifycallback: Long, maxconnections: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter: Long, instance: Long, filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, flags: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, createoptions: Int, mailslotquota: Int, maximummessagesize: Int, readtimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter: Long, instance: Long, filehandle: Long, fileobject: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, createdisposition: Int, createoptions: Int, namedpipetype: Int, readmode: Int, completionmode: Int, maximuminstances: Int, inboundquota: Int, outboundquota: Int, defaulttimeout: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance: Long, fileobject: Long, sectioncontext: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, flags: Int, sectionhandle: Long, sectionobject: Long, sectionfilesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata: Long, mdladdresspointer: Long, buffer: Long, length: Long, desiredaccess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance: Long, fileobject: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance: Long, transaction: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter: Long, volume: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter: Long, volume: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance: Long, fileobject: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data: Long, fltobjects: Long, completioncontext: Long, flags: Int, safepostcallback: Long, retpostoperationstatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance: Long, transaction: Long, transactioncontext: Long, notificationmask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist: Long, filterlistsize: Int, numberfiltersreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume: Long, filter: Long, instancelist: Long, instancelistsize: Int, numberinstancesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter: Long, index: Int, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter: Long, volumelist: Long, volumelistsize: Int, numbervolumesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance: Long, fileobject: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance: Long, fileobject: Long, fileoffset: Long, mdlchain: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance: Long, fileobject: Long, fileoffset: Long, length: Int, lockkey: Int, mdlchain: Long, iostatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance: Long, fileobject: Long, flushtype: Int, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter: Long, ecplist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance: Long, buffer: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance: Long, fileobject: Long, fscontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects: Long, desiredcontexts: Short, contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects: Long, desiredcontexts: Short, contextssize: Long, contexts: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance: Long, fileobject: Long, rootdirectory: Long, filename: Long, filenamelength: Int, nameoptions: Int, retfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume: Long, diskdeviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject: Long, instance: Long, nameoptions: Int, filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject: Long, filesystemtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance: Long, lowerinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter: Long, ecplist: Long, currentecpcontext: Long, nextecptype: Long, nextecpcontext: Long, nextecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata: Long, sessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance: Long, fileobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume: Long, instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance: Long, transaction: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata: Long, filenameinformation: Long, rettunneledfilenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance: Long, upperinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter: Long, volume: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter: Long, deviceobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter: Long, fileobject: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter: Long, volumename: Long, retvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume: Long, volumeguidname: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume: Long, informationclass: Int, buffer: Long, buffersize: Int, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter: Long, volume: Long, instancename: Long, retinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume: Long, volumename: Long, buffersizeneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume: Long, volumeproperties: Long, volumepropertieslength: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter: Long, lookaside: Long, flags: Int, size: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter: Long, ecplist: Long, ecpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject: Long, instance: Long, isdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter: Long, ecpcontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance: Long, targetinstance: Long, redirectionallowed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data: Long, targetinstance: Long, redirectionallowedthisio: Long, redirectionallowedallio: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject: Long, issnapshotvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject: Long, iswritable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance: Long, volumehandle: Long, volumefileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock: Long, callbackdata: Long, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock: Long, callbackdata: Long, flags: Int, context: Long, waitcompletionroutine: Long, prepostcallbackdataroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock: Long, callbackdata: Long, opencount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock: Long, callbackdata: Long, opencount: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1: Long, fo2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename: Long, extension: Long, stream: Long, finalcomponent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter: Long, ecpcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock: Long, callbackdata: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata: Long, propagateid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata: Long, targetdata: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance: Long, fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, returnsingleentry: Boolean, filename: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, queryflags: Int, filename: Long, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance: Long, fileobject: Long, returnedeadata: Long, length: Int, returnsingleentry: Boolean, ealist: Long, ealistlength: Int, eaindex: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter: Long, instance: Long, objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance: Long, fileobject: Long, iostatusblock: Long, buffer: Long, length: Int, returnsingleentry: Boolean, sidlist: Long, sidlistlength: Int, startsid: Long, restartscan: Boolean, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long, length: Int, lengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance: Long, fileobject: Long, fsinformation: Long, length: Int, fsinformationclass: Int, lengthreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem: Long, data: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem: Long, fltobject: Long, workerroutine: Long, queuetype: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, bytesread: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver: Long, registration: Long, retfilter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance: Long, callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize: Long, contexts: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter: Long, ecplist: Long, ecptype: Long, ecpcontext: Long, ecpcontextsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter: Long, data: Long, openreparseentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter: Long, data: Long, infoclassflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data: Long, callbackroutine: Long, requestercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter: Long, data: Long, infoclass: Int, size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter: Long, data: Long, infoclass: Int, retinfosize: Long, retinfobuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data: Long, fileobject: Long, thread: Long, priorityinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance: Long, transaction: Long, transactioncontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter: Long, clientport: Long, senderbuffer: Long, senderbufferlength: Int, replybuffer: Long, replylength: Long, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata: Long, canceledcallback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance: Long, fileobject: Long, eabuffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter: Long, callbackdata: Long, ecplist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance: Long, fileobject: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance: Long, fileobject: Long, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance: Long, fileobject: Long, securityinformation: Int, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance: Long, fileobject: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance: Long, transaction: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume: Long, operation: Int, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance: Long, iosb: Long, fsinformation: Long, length: Int, fsinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject: Long, instance: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long, databuffer: Long, databufferlength: Short, existingfiletag: Int, existingguid: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter: Long)

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance: Long, fileobject: Long, filetag: Int, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata: Long, fltobjects: Long, operationstatus: Int, failurereason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance: Long, fileobject: Long, byteoffset: Long, length: Int, buffer: Long, flags: Int, byteswritten: Long, callbackroutine: Long, callbackcontext: Long, key: Long, mdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject: Long, childcallbackdata: Long): Int
}

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter, ecpcontext.rawAddress)
}

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr<ULong>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock.rawAddress)
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltAcquirePushLockShared(pushlock: MutPtr<ULong>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock.rawAddress)
}

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltAcquireResourceExclusive(resource: MutPtr<Eresource>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource.rawAddress)
}

public actual fun fltAcquireResourceShared(resource: MutPtr<Eresource>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource.rawAddress)
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter, data.rawAddress, openreparseentry.rawAddress)

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance, targetinstance, sourcedevicestacksizemodified.rawAddress)

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr<FileObject>, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance, fileobject.rawAddress, retnewcallbackdata.rawAddress)

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flags: UInt, retnewcallbackdata: MutPtr<MutPtr<FltCallbackData>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance, fileobject.rawAddress, flags.toInt(), retnewcallbackdata.rawAddress)

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter, contexttype.toShort(), contextsize.toLong(), pooltype, returnedcontext.rawAddress)

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem()

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter, ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, pooltag.toInt(), ecpcontext.rawAddress)

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr<Guid>, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr<CVoid>, ecpcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter, ecptype.rawAddress, sizeofcontext.toInt(), flags.toInt(), 0L, lookasidelist.rawAddress, ecpcontext.rawAddress)

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter, flags.toInt(), ecplist.rawAddress)

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr<FileLock> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(0L, 0L))

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem()

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance, pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr<IoPriorityInfo>, outputpriorityinfo: MutPtr<IoPriorityInfo>, thread: Pethread): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo.rawAddress, outputpriorityinfo.rawAddress, thread)

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter, volume, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr<UnicodeString>, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter, volume, altitude.rawAddress, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, desiredaccess: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor.rawAddress, desiredaccess.toInt())

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr<FileObject>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance, fileobject.rawAddress)
}

public actual fun fltCancelIo(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata.rawAddress)

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, timeout: ConstPtr<Long>, waitblockarray: ConstPtr<KwaitBlock>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress, waittype, timeout.rawAddress, waitblockarray.rawAddress, callbackdata.rawAddress)

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr<CVoid>, timeout: ConstPtr<Long>, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj.rawAddress, timeout.rawAddress, callbackdata.rawAddress)

public actual fun fltCbdqDisable(cbdq: MutPtr<FltCallbackDataQueue>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq.rawAddress)
}

public actual fun fltCbdqEnable(cbdq: MutPtr<FltCallbackDataQueue>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq.rawAddress)
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr<FltCallbackDataQueue>, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance, cbdq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun fltCbdqInsertIo(cbdq: MutPtr<FltCallbackDataQueue>, cbd: ConstPtr<FltCallbackData>, context: ConstPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq.rawAddress, cbd.rawAddress, context.rawAddress, insertcontext.rawAddress)

public actual fun fltCbdqRemoveIo(cbdq: MutPtr<FltCallbackDataQueue>, context: ConstPtr<IoCsqIrpContext>): MutPtr<FltCallbackData> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq.rawAddress, context.rawAddress))

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr<FltCallbackDataQueue>, peekcontext: ConstPtr<CVoid>): MutPtr<FltCallbackData> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq.rawAddress, peekcontext.rawAddress))

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr<FltNameControl>, newsize: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl.rawAddress, newsize.toShort())

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock.rawAddress, callbackdata.rawAddress)

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock.rawAddress, callbackdata.rawAddress)

public actual fun fltCheckOplock(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock.rawAddress, callbackdata.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fltCheckOplockEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltClearCallbackDataDirty(data: MutPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data.rawAddress)
}

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata.rawAddress)

public actual fun fltClose(filehandle: Handle): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle.rawAddress)

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr<PfltPort>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter, clientport.rawAddress)
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport)
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext.rawAddress)

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1, instance2)

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata.rawAddress)
}

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr<FltCallbackData>, callbackstatus: FltPreopCallbackStatus, context: ConstPtr<CVoid>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata.rawAddress, callbackstatus, context.rawAddress)
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr<FltCallbackData>, ecplist: MutPtr<EcpList>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter, data.rawAddress, ecplist.rawAddress)

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr<PfltPort>, objectattributes: ConstPtr<ObjectAttributes>, serverportcookie: ConstPtr<CVoid>, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter, serverport.rawAddress, objectattributes.rawAddress, serverportcookie.rawAddress, 0L, 0L, 0L, maxconnections)

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter, instance, filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt())

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, flags: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), flags.toInt(), drivercontext.rawAddress)

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout.rawAddress, drivercontext.rawAddress)

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr<Handle>, fileobject: MutPtr<MutPtr<FileObject>>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr<Long>, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter, instance, filehandle.rawAddress, fileobject.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout.rawAddress, drivercontext.rawAddress)

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr<FileObject>, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr<Handle>, sectionobject: MutPtr<MutPtr<CVoid>>, sectionfilesize: MutPtr<Long>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance, fileobject.rawAddress, sectioncontext.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle.rawAddress, sectionobject.rawAddress, sectionfilesize.rawAddress)

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance)

public actual fun fltCurrentBatchOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock.rawAddress)

public actual fun fltCurrentOplock(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock.rawAddress)

public actual fun fltCurrentOplockH(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock.rawAddress)

public actual fun fltDecodeParameters(callbackdata: ConstPtr<FltCallbackData>, mdladdresspointer: MutPtr<MutPtr<MutPtr<Mdl>>>, buffer: MutPtr<MutPtr<MutPtr<CVoid>>>, length: MutPtr<MutPtr<UInt>>, desiredaccess: MutPtr<LockOperation>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata.rawAddress, mdladdresspointer.rawAddress, buffer.rawAddress, length.rawAddress, desiredaccess.rawAddress)

public actual fun fltDeleteContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context.rawAddress)
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter, lookaside.rawAddress, flags.toInt())
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance, oldcontext.rawAddress)

public actual fun fltDeletePushLock(pushlock: ConstPtr<ULong>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock.rawAddress)
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance, fileobject.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance, transaction.rawAddress, oldcontext.rawAddress)

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter, volume, oldcontext.rawAddress)

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter, volume, instancename.rawAddress)

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance, fileobject.rawAddress, iocontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), lengthreturned.rawAddress)

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, completioncontext: ConstPtr<CVoid>, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr<FltPostopCallbackStatus>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data.rawAddress, fltobjects.rawAddress, completioncontext.rawAddress, flags.toInt(), 0L, retpostoperationstatus.rawAddress)

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance, transaction.rawAddress, transactioncontext.rawAddress, notificationmask.toInt())

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateFilters(filterlist: MutPtr<PfltFilter>, filterlistsize: UInt, numberfiltersreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist.rawAddress, filterlistsize.toInt(), numberfiltersreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr<DeviceObject>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject.rawAddress, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr<UnicodeString>, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename.rawAddress, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr<PfltInstance>, instancelistsize: UInt, numberinstancesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume, filter, instancelist.rawAddress, instancelistsize.toInt(), numberinstancesreturned.rawAddress)

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter, index.toInt(), informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr<PfltVolume>, volumelistsize: UInt, numbervolumesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter, volumelist.rawAddress, volumelistsize.toInt(), numbervolumesreturned.rawAddress)

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance, fileobject.rawAddress, mdlchain.rawAddress)

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, mdlchain.rawAddress)

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance, fileobject.rawAddress, fileoffset.rawAddress, length.toInt(), lockkey.toInt(), mdlchain.rawAddress, iostatus.rawAddress)

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter, ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance, fileobject.rawAddress)

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr<FileObject>, flushtype: UInt, callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance, fileobject.rawAddress, flushtype.toInt(), callbackdata.rawAddress)

public actual fun fltFreeCallbackData(callbackdata: ConstPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata.rawAddress)
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem)
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter, ecpcontext.rawAddress)
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr<EcpList>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter, ecplist.rawAddress)
}

public actual fun fltFreeFileLock(filelock: ConstPtr<FileLock>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock.rawAddress)
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem)
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr<EcpList>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter, ecplist.rawAddress)
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr<CVoid>, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance, buffer.rawAddress, tag.toInt())
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor.rawAddress)
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fscontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance, fileobject.rawAddress, fscontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), lengthreturned.rawAddress)

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr<FltCallbackData>, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata.rawAddress, guid.rawAddress)

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume, instance.rawAddress)

public actual fun fltGetContexts(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contexts: MutPtr<FltRelatedContexts>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects.rawAddress, desiredcontexts.toShort(), contexts.rawAddress)
}

public actual fun fltGetContextsEx(fltobjects: ConstPtr<FltRelatedObjects>, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr<FltRelatedContextsEx>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects.rawAddress, desiredcontexts.toShort(), contextssize.toLong(), contexts.rawAddress)

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr<FileObject>, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance, fileobject.rawAddress, rootdirectory.rawAddress, filename.rawAddress, filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation.rawAddress)

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume, deviceobject.rawAddress)

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume, diskdeviceobject.rawAddress)

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: MutPtr<MutPtr<EcpList>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter, callbackdata.rawAddress, ecplist.rawAddress)

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr<FltCallbackData>, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata.rawAddress, nameoptions.toInt(), filenameinformation.rawAddress)

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr<FileObject>, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject.rawAddress, instance, nameoptions.toInt(), filenameinformation.rawAddress)

public actual fun fltGetFileSystemType(fltobject: ConstPtr<CVoid>, filesystemtype: MutPtr<FltFilesystemType>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject.rawAddress, filesystemtype.rawAddress)

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr<PfltFilter>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance, retfilter.rawAddress)

public actual fun fltGetFilterFromName(filtername: ConstPtr<UnicodeString>, retfilter: MutPtr<PfltFilter>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername.rawAddress, retfilter.rawAddress)

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data.rawAddress, zeroingoffset.rawAddress)

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance, context.rawAddress)

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr<FltCallbackData>): MutPtr<CVoid> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data.rawAddress))

public actual fun fltGetIoPriorityHint(data: ConstPtr<FltCallbackData>): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data.rawAddress)

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr<FltCallbackData>): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data.rawAddress)

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr<FileObject>): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject.rawAddress)

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread)

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode.toByte()))

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance, lowerinstance.rawAddress)

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<CVoid> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata.rawAddress))

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr<EcpList>, currentecpcontext: ConstPtr<CVoid>, nextecptype: MutPtr<Guid>, nextecpcontext: MutPtr<MutPtr<CVoid>>, nextecpcontextsize: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter, ecplist.rawAddress, currentecpcontext.rawAddress, nextecptype.rawAddress, nextecpcontext.rawAddress, nextecpcontextsize.rawAddress)

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr<FltCallbackData>): Peprocess =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata.rawAddress)

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr<FltCallbackData>): UInt =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata.rawAddress).toUInt()

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr<FltCallbackData>): Handle =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata.rawAddress))

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr<FltCallbackData>, sessionid: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata.rawAddress, sessionid.rawAddress)

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr<CVoid> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename.rawAddress))

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance, fileobject.rawAddress, context.rawAddress)

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>): MutPtr<Mdl> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata.rawAddress))

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume, instance.rawAddress)

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance, transaction.rawAddress, context.rawAddress)

public actual fun fltGetTunneledName(callbackdata: ConstPtr<FltCallbackData>, filenameinformation: ConstPtr<FltFileNameInformation>, rettunneledfilenameinformation: MutPtr<MutPtr<FltFileNameInformation>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata.rawAddress, filenameinformation.rawAddress, rettunneledfilenameinformation.rawAddress)

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance, upperinstance.rawAddress)

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter, volume, context.rawAddress)

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr<DeviceObject>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter, deviceobject.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr<FileObject>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter, fileobject.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr<PfltVolume>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance, retvolume.rawAddress)

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr<UnicodeString>, retvolume: MutPtr<PfltVolume>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter, volumename.rawAddress, retvolume.rawAddress)

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume, volumeguidname.rawAddress, buffersizeneeded.rawAddress)

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr<CVoid>, buffersize: UInt, bytesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume, informationclass, buffer.rawAddress, buffersize.toInt(), bytesreturned.rawAddress)

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr<UnicodeString>, retinstance: MutPtr<PfltInstance>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter, volume, instancename.rawAddress, retinstance.rawAddress)

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr<UnicodeString>, buffersizeneeded: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume, volumename.rawAddress, buffersizeneeded.rawAddress)

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr<FltVolumeProperties>, volumepropertieslength: UInt, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume, volumeproperties.rawAddress, volumepropertieslength.toInt(), lengthreturned.rawAddress)

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr<CVoid>, flags: UInt, size: ULong, tag: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter, lookaside.rawAddress, flags.toInt(), size.toLong(), tag.toInt())
}

public actual fun fltInitializeFileLock(filelock: MutPtr<FileLock>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock.rawAddress)
}

public actual fun fltInitializeOplock(oplock: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock.rawAddress)
}

public actual fun fltInitializePushLock(pushlock: MutPtr<ULong>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock.rawAddress)
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecpcontext: MutPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter, ecplist.rawAddress, ecpcontext.rawAddress)

public actual fun fltIs32bitProcess(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata.rawAddress)

public actual fun fltIsCallbackDataDirty(data: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data.rawAddress)

public actual fun fltIsDirectory(fileobject: ConstPtr<FileObject>, instance: PfltInstance, isdirectory: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject.rawAddress, instance, isdirectory.rawAddress)

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter, ecpcontext.rawAddress)

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter, ecpcontext.rawAddress)

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr<DeviceObject>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject.rawAddress)

public actual fun fltIsIoCanceled(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata.rawAddress)

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance, targetinstance, redirectionallowed.rawAddress)

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr<FltCallbackData>, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr<Boolean>, redirectionallowedallio: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data.rawAddress, targetinstance, redirectionallowedthisio.rawAddress, redirectionallowedallio.rawAddress)

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata.rawAddress)

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr<CVoid>, issnapshotvolume: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject.rawAddress, issnapshotvolume.rawAddress)

public actual fun fltIsVolumeWritable(fltobject: ConstPtr<CVoid>, iswritable: MutPtr<Boolean>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject.rawAddress, iswritable.rawAddress)

public actual fun fltLoadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername.rawAddress)

public actual fun fltLockUserBuffer(callbackdata: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata.rawAddress)

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr<ListEntry>, fscontext: ConstPtr<CVoid>, fulldirectoryname: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr<FltCallbackData>, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr<SecuritySubjectContext>, filtercallback: PfilterReportChange) {
}

public actual fun fltObjectDereference(fltobject: MutPtr<CVoid>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject.rawAddress)
}

public actual fun fltObjectReference(fltobject: MutPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject.rawAddress)

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr<Handle>, volumefileobject: MutPtr<MutPtr<FileObject>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance, volumehandle.rawAddress, volumefileobject.rawAddress)

public actual fun fltOplockBreakH(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltOplockBreakToNone(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock.rawAddress, callbackdata.rawAddress, context.rawAddress, 0L, 0L)

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, flags: UInt, context: ConstPtr<CVoid>, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock.rawAddress, callbackdata.rawAddress, flags.toInt(), context.rawAddress, 0L, 0L)

public actual fun fltOplockFsctrl(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock.rawAddress, callbackdata.rawAddress, opencount.toInt())

public actual fun fltOplockFsctrlEx(oplock: ConstPtr<ConstPtr<CVoid>>, callbackdata: ConstPtr<FltCallbackData>, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock.rawAddress, callbackdata.rawAddress, opencount.toInt(), flags.toInt())

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr<ConstPtr<CVoid>>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock.rawAddress)

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr<FltCallbackData>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata.rawAddress)

public actual fun fltOplockKeysEqual(fo1: ConstPtr<FileObject>, fo2: ConstPtr<FileObject>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1.rawAddress, fo2.rawAddress)

public actual fun fltParseFileName(filename: ConstPtr<UnicodeString>, extension: MutPtr<UnicodeString>, stream: MutPtr<UnicodeString>, finalcomponent: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename.rawAddress, extension.rawAddress, stream.rawAddress, finalcomponent.rawAddress)

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr<FltFileNameInformation>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation.rawAddress)

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr<FltCallbackData>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata.rawAddress)
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr<CVoid>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter, ecpcontext.rawAddress)
}

public actual fun fltProcessFileLock(filelock: ConstPtr<FileLock>, callbackdata: ConstPtr<FltCallbackData>, context: ConstPtr<CVoid>): FltPreopCallbackStatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock.rawAddress, callbackdata.rawAddress, context.rawAddress)

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr<FltCallbackData>, propagateid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata.rawAddress, propagateid.rawAddress, originalid.rawAddress)

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr<FltCallbackData>, targetdata: MutPtr<FltCallbackData>, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata.rawAddress, targetdata.rawAddress, flags.toInt())

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance, fileobject.rawAddress)

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr<UnicodeString>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr<UnicodeString>, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress, lengthreturned.rawAddress)

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, returnedeadata: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr<CVoid>, ealistlength: UInt, eaindex: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance, fileobject.rawAddress, returnedeadata.rawAddress, length.toInt(), returnsingleentry, ealist.rawAddress, ealistlength.toInt(), eaindex.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter, instance, objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, drivercontext.rawAddress)

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, lengthreturned.rawAddress)

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr<CVoid>, sidlistlength: UInt, startsid: ConstPtr<UInt>, restartscan: Boolean, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance, fileobject.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), returnsingleentry, sidlist.rawAddress, sidlistlength.toInt(), startsid.rawAddress, restartscan, lengthreturned.rawAddress)

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance, fileobject.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress, length.toInt(), lengthneeded.rawAddress)

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance, iosb.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance, fileobject.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass, lengthreturned.rawAddress)

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr<FltCallbackData>, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem, data.rawAddress, 0L, queuetype, context.rawAddress)

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr<CVoid>, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem, fltobject.rawAddress, 0L, queuetype, context.rawAddress)

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), bytesread.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: MutPtr<CVoid>, flags: UInt, bytesread: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), bytesread.rawAddress, 0L, callbackcontext.rawAddress, key.rawAddress, mdl.rawAddress)

public actual fun fltReferenceContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context.rawAddress)
}

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation.rawAddress)
}

public actual fun fltRegisterFilter(driver: ConstPtr<DriverObject>, registration: ConstPtr<FltRegistration>, retfilter: MutPtr<PfltFilter>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver.rawAddress, registration.rawAddress, retfilter.rawAddress)

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance)

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance, callbackdata.rawAddress)
}

public actual fun fltReleaseContext(context: PfltContext) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context.rawAddress)
}

public actual fun fltReleaseContexts(contexts: ConstPtr<FltRelatedContexts>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts.rawAddress)
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr<FltRelatedContextsEx>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize.toLong(), contexts.rawAddress)
}

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr<FltFileNameInformation>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation.rawAddress)
}

public actual fun fltReleasePushLock(pushlock: MutPtr<ULong>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock.rawAddress)
}

public actual fun fltReleasePushLockEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock.rawAddress, flags.toInt())
}

public actual fun fltReleaseResource(resource: MutPtr<Eresource>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource.rawAddress)
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr<EcpList>, ecptype: ConstPtr<Guid>, ecpcontext: MutPtr<MutPtr<CVoid>>, ecpcontextsize: MutPtr<UInt>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter, ecplist.rawAddress, ecptype.rawAddress, ecpcontext.rawAddress, ecpcontextsize.rawAddress)

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr<FltCallbackData>, openreparseentry: ConstPtr<OpenReparseListEntry>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter, data.rawAddress, openreparseentry.rawAddress)
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclassflags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter, data.rawAddress, infoclassflags.toInt())

public actual fun fltRequestOperationStatusCallback(data: ConstPtr<FltCallbackData>, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data.rawAddress, 0L, requestercontext.rawAddress)

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata.rawAddress)
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, size: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter, data.rawAddress, infoclass.toInt(), size.rawAddress))

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr<FltCallbackData>, infoclass: UInt, retinfosize: MutPtr<UInt>, retinfobuffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter, data.rawAddress, infoclass.toInt(), retinfosize.rawAddress, retinfobuffer.rawAddress)

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr<FltCallbackData>, fileobject: ConstPtr<FileObject>, thread: Pethread, priorityinfo: MutPtr<IoPriorityInfo>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data.rawAddress, fileobject.rawAddress, thread, priorityinfo.rawAddress)

public actual fun fltReuseCallbackData(callbackdata: MutPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata.rawAddress)
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, transactioncontext: PfltContext): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance, transaction.rawAddress, transactioncontext.rawAddress)

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr<PfltPort>, senderbuffer: ConstPtr<CVoid>, senderbufferlength: UInt, replybuffer: MutPtr<CVoid>, replylength: MutPtr<UInt>, timeout: ConstPtr<Long>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter, clientport.rawAddress, senderbuffer.rawAddress, senderbufferlength.toInt(), replybuffer.rawAddress, replylength.rawAddress, timeout.rawAddress)

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr<FltCallbackData>, guid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata.rawAddress, guid.rawAddress)

public actual fun fltSetCallbackDataDirty(data: MutPtr<FltCallbackData>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data.rawAddress)
}

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr<FltCallbackData>, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata.rawAddress, 0L)

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, eabuffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance, fileobject.rawAddress, eabuffer.rawAddress, length.toInt())

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr<FltCallbackData>, ecplist: ConstPtr<EcpList>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter, callbackdata.rawAddress, ecplist.rawAddress)

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetFsZeroingOffset(data: ConstPtr<FltCallbackData>, zeroingoffset: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data.rawAddress, zeroingoffset.toInt())

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data.rawAddress)

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance, fileobject.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr<FltCallbackData>, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data.rawAddress, priorityhint)

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr<FileObject>, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject.rawAddress, priorityhint)

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread, priorityhint)

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr<FileObject>, buffer: ConstPtr<CVoid>, length: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance, fileobject.rawAddress, buffer.rawAddress, length.toInt())

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr<FileObject>, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance, fileobject.rawAddress, securityinformation.toInt(), securitydescriptor.rawAddress)

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr<FileObject>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance, fileobject.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr<Ktransaction>, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance, transaction.rawAddress, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr<PfltContext>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume, operation, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr<IoStatusBlock>, fsinformation: MutPtr<CVoid>, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance, iosb.rawAddress, fsinformation.rawAddress, length.toInt(), fsinformationclass)

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter)

public actual fun fltSupportsFileContexts(fileobject: ConstPtr<FileObject>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject.rawAddress)

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr<FileObject>, instance: PfltInstance): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject.rawAddress, instance)

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr<FileObject>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject.rawAddress)

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr<FileObject>): Boolean =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject.rawAddress)

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress, databuffer.rawAddress, databufferlength.toShort())

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>, databuffer: ConstPtr<CVoid>, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr<Guid>, flags: UInt): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress, databuffer.rawAddress, databufferlength.toShort(), existingfiletag.toInt(), existingguid.rawAddress, flags.toInt())

public actual fun fltUninitializeFileLock(filelock: ConstPtr<FileLock>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock.rawAddress)
}

public actual fun fltUninitializeOplock(oplock: ConstPtr<ConstPtr<CVoid>>) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock.rawAddress)
}

public actual fun fltUnloadFilter(filtername: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername.rawAddress)

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter)
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, filetag: UInt, guid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance, fileobject.rawAddress, filetag.toInt(), guid.rawAddress)

public actual fun fltVetoBypassIo(callbackdata: ConstPtr<FltCallbackData>, fltobjects: ConstPtr<FltRelatedObjects>, operationstatus: Ntstatus, failurereason: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata.rawAddress, fltobjects.rawAddress, operationstatus, failurereason.rawAddress)

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), byteswritten.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr<FileObject>, byteoffset: ConstPtr<Long>, length: UInt, buffer: ConstPtr<CVoid>, flags: UInt, byteswritten: MutPtr<UInt>, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr<CVoid>, key: ConstPtr<UInt>, mdl: ConstPtr<Mdl>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance, fileobject.rawAddress, byteoffset.rawAddress, length.toInt(), buffer.rawAddress, flags.toInt(), byteswritten.rawAddress, 0L, callbackcontext.rawAddress, key.rawAddress, mdl.rawAddress)

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr<FileObject>, childcallbackdata: MutPtr<FltCallbackData>): Ntstatus =
    WindowsWdkStorageFilesystemMinifiltersJniBridge.windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject.rawAddress, childcallbackdata.rawAddress)
