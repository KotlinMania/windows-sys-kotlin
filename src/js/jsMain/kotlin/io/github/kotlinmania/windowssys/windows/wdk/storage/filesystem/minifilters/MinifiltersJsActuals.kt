@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PnotifySync
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FsInformationClass
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PcheckForTraverseAccess
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfilterReportChange
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PfsrtlExtraCreateParameterCleanupCallback
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.PunlockRoutine
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.WorkQueueType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.FilterVolumeInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.InstanceInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType

private val windowsWdkStorageFilesystemMinifiltersNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun fltAcknowledgeEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcknowledgeEcp(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusive(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusive(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockShared(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockShared(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquirePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceExclusive(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceExclusive(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAcquireResourceShared(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAcquireResourceShared(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltAddOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAddOpenReparseEntry(filter.toString(), data.rawAddress.toString(), openreparseentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAdjustDeviceStackSizeForIoRedirection(sourceinstance: PfltInstance, targetinstance: PfltInstance, sourcedevicestacksizemodified: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAdjustDeviceStackSizeForIoRedirection(sourceinstance.toString(), targetinstance.toString(), sourcedevicestacksizemodified.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackData(instance: PfltInstance, fileobject: ConstPtr, retnewcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackData(instance.toString(), fileobject.rawAddress.toString(), retnewcallbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateCallbackDataEx(instance: PfltInstance, fileobject: ConstPtr, flags: UInt, retnewcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateCallbackDataEx(instance.toString(), fileobject.rawAddress.toString(), flags.toInt(), retnewcallbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateContext(filter: PfltFilter, contexttype: UShort, contextsize: ULong, pooltype: PoolType, returnedcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateContext(filter.toString(), contexttype.toInt(), contextsize.toString(), pooltype, returnedcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateDeferredIoWorkItem(): PfltDeferredIoWorkitem =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateDeferredIoWorkItem() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameter(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, pooltag: UInt, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameter(filter.toString(), ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), pooltag.toInt(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterFromLookasideList(filter: PfltFilter, ecptype: ConstPtr, sizeofcontext: UInt, flags: UInt, cleanupcallback: PfsrtlExtraCreateParameterCleanupCallback, lookasidelist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterFromLookasideList(filter.toString(), ecptype.rawAddress.toString(), sizeofcontext.toInt(), flags.toInt(), 0L.toString(), lookasidelist.rawAddress.toString(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateExtraCreateParameterList(filter: PfltFilter, flags: UInt, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateExtraCreateParameterList(filter.toString(), flags.toInt(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateFileLock(completelockcallbackdataroutine: PfltCompleteLockCallbackDataRoutine, unlockroutine: PunlockRoutine): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateFileLock(0L.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocateGenericWorkItem(): PfltGenericWorkitem =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocateGenericWorkItem() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAllocatePoolAlignedWithTag(instance: PfltInstance, pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAllocatePoolAlignedWithTag(instance.toString(), pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltApplyPriorityInfoThread(inputpriorityinfo: ConstPtr, outputpriorityinfo: MutPtr, thread: Pethread): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltApplyPriorityInfoThread(inputpriorityinfo.rawAddress.toString(), outputpriorityinfo.rawAddress.toString(), thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolume(filter.toString(), volume.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltAttachVolumeAtAltitude(filter: PfltFilter, volume: PfltVolume, altitude: ConstPtr, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltAttachVolumeAtAltitude(filter.toString(), volume.toString(), altitude.rawAddress.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltBuildDefaultSecurityDescriptor(securitydescriptor: MutPtr, desiredaccess: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltBuildDefaultSecurityDescriptor(securitydescriptor.rawAddress.toString(), desiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancelFileOpen(instance: PfltInstance, fileobject: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelFileOpen(instance.toString(), fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCancelIo(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancelIo(callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForMultipleObjects(count: UInt, objectarray: ConstPtr, waittype: WaitType, timeout: ConstPtr, waitblockarray: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForMultipleObjects(count.toInt(), objectarray.rawAddress.toString(), waittype, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCancellableWaitForSingleObject(obj: ConstPtr, timeout: ConstPtr, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCancellableWaitForSingleObject(obj.rawAddress.toString(), timeout.rawAddress.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqDisable(cbdq: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqDisable(cbdq.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqEnable(cbdq: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqEnable(cbdq.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCbdqInitialize(instance: PfltInstance, cbdq: MutPtr, cbdqinsertio: PfltCallbackDataQueueInsertIo, cbdqremoveio: PfltCallbackDataQueueRemoveIo, cbdqpeeknextio: PfltCallbackDataQueuePeekNextIo, cbdqacquire: PfltCallbackDataQueueAcquire, cbdqrelease: PfltCallbackDataQueueRelease, cbdqcompletecanceledio: PfltCallbackDataQueueCompleteCanceledIo): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInitialize(instance.toString(), cbdq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqInsertIo(cbdq: MutPtr, cbd: ConstPtr, context: ConstPtr, insertcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqInsertIo(cbdq.rawAddress.toString(), cbd.rawAddress.toString(), context.rawAddress.toString(), insertcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveIo(cbdq: MutPtr, context: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveIo(cbdq.rawAddress.toString(), context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCbdqRemoveNextIo(cbdq: MutPtr, peekcontext: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCbdqRemoveNextIo(cbdq.rawAddress.toString(), peekcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckAndGrowNameControl(namectrl: MutPtr, newsize: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckAndGrowNameControl(namectrl.rawAddress.toString(), newsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForReadAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForReadAccess(filelock.rawAddress.toString(), callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckLockForWriteAccess(filelock: ConstPtr, callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckLockForWriteAccess(filelock.rawAddress.toString(), callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplock(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplock(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCheckOplockEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCheckOplockEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClearCallbackDataDirty(data: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCallbackDataDirty(data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltClearCancelCompletion(callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltClearCancelCompletion(callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltClose(filehandle: Handle): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltClose(filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCloseClientPort(filter: PfltFilter, clientport: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseClientPort(filter.toString(), clientport.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseCommunicationPort(serverport: PfltPort) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseCommunicationPort(serverport.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCloseSectionForDataScan(sectioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCloseSectionForDataScan(sectioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCommitFinalizeComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCommitFinalizeComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompareInstanceAltitudes(instance1: PfltInstance, instance2: PfltInstance): Int =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompareInstanceAltitudes(instance1.toString(), instance2.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCompletePendedPostOperation(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPostOperation(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCompletePendedPreOperation(callbackdata: ConstPtr, callbackstatus: FltPreopCallbackStatus, context: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCompletePendedPreOperation(callbackdata.rawAddress.toString(), callbackstatus, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltCopyOpenReparseList(filter: PfltFilter, data: ConstPtr, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCopyOpenReparseList(filter.toString(), data.rawAddress.toString(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateCommunicationPort(filter: PfltFilter, serverport: MutPtr, objectattributes: ConstPtr, serverportcookie: ConstPtr, connectnotifycallback: PfltConnectNotify, disconnectnotifycallback: PfltDisconnectNotify, messagenotifycallback: PfltMessageNotify, maxconnections: Int): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateCommunicationPort(filter.toString(), serverport.rawAddress.toString(), objectattributes.rawAddress.toString(), serverportcookie.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), maxconnections) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateFileEx2(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, flags: UInt, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateFileEx2(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), flags.toInt(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateMailslotFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, createoptions: UInt, mailslotquota: UInt, maximummessagesize: UInt, readtimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateMailslotFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), createoptions.toInt(), mailslotquota.toInt(), maximummessagesize.toInt(), readtimeout.rawAddress.toString(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateNamedPipeFile(filter: PfltFilter, instance: PfltInstance, filehandle: MutPtr, fileobject: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, namedpipetype: UInt, readmode: UInt, completionmode: UInt, maximuminstances: UInt, inboundquota: UInt, outboundquota: UInt, defaulttimeout: ConstPtr, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateNamedPipeFile(filter.toString(), instance.toString(), filehandle.rawAddress.toString(), fileobject.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), namedpipetype.toInt(), readmode.toInt(), completionmode.toInt(), maximuminstances.toInt(), inboundquota.toInt(), outboundquota.toInt(), defaulttimeout.rawAddress.toString(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSectionForDataScan(instance: PfltInstance, fileobject: ConstPtr, sectioncontext: PfltContext, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, flags: UInt, sectionhandle: MutPtr, sectionobject: MutPtr, sectionfilesize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSectionForDataScan(instance.toString(), fileobject.rawAddress.toString(), sectioncontext.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), flags.toInt(), sectionhandle.rawAddress.toString(), sectionobject.rawAddress.toString(), sectionfilesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCreateSystemVolumeInformationFolder(instance: PfltInstance): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCreateSystemVolumeInformationFolder(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentBatchOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentBatchOplock(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplock(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplock(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltCurrentOplockH(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltCurrentOplockH(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDecodeParameters(callbackdata: ConstPtr, mdladdresspointer: MutPtr, buffer: MutPtr, length: MutPtr, desiredaccess: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDecodeParameters(callbackdata.rawAddress.toString(), mdladdresspointer.rawAddress.toString(), buffer.rawAddress.toString(), length.rawAddress.toString(), desiredaccess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteExtraCreateParameterLookasideList(filter.toString(), lookaside.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteFileContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteFileContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteInstanceContext(instance: PfltInstance, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteInstanceContext(instance.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeletePushLock(pushlock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeletePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltDeleteStreamContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteTransactionContext(instance: PfltInstance, transaction: ConstPtr, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteTransactionContext(instance.toString(), transaction.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeleteVolumeContext(filter: PfltFilter, volume: PfltVolume, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeleteVolumeContext(filter.toString(), volume.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDetachVolume(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDetachVolume(filter.toString(), volume.toString(), instancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDeviceIoControlFile(instance: PfltInstance, fileobject: ConstPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDeviceIoControlFile(instance.toString(), fileobject.rawAddress.toString(), iocontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltDoCompletionProcessingWhenSafe(data: ConstPtr, fltobjects: ConstPtr, completioncontext: ConstPtr, flags: UInt, safepostcallback: PfltPostOperationCallback, retpostoperationstatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltDoCompletionProcessingWhenSafe(data.rawAddress.toString(), fltobjects.rawAddress.toString(), completioncontext.rawAddress.toString(), flags.toInt(), 0L.toString(), retpostoperationstatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnlistInTransaction(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext, notificationmask: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnlistInTransaction(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString(), notificationmask.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilterInformation(index: UInt, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilterInformation(index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateFilters(filterlist: MutPtr, filterlistsize: UInt, numberfiltersreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateFilters(filterlist.rawAddress.toString(), filterlistsize.toInt(), numberfiltersreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByDeviceObject(deviceobject: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByDeviceObject(deviceobject.rawAddress.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByFilter(filter: PfltFilter, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByFilter(filter.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolume(volume: PfltVolume, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolume(volume.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstanceInformationByVolumeName(volumename: ConstPtr, index: UInt, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstanceInformationByVolumeName(volumename.rawAddress.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateInstances(volume: PfltVolume, filter: PfltFilter, instancelist: MutPtr, instancelistsize: UInt, numberinstancesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateInstances(volume.toString(), filter.toString(), instancelist.rawAddress.toString(), instancelistsize.toInt(), numberinstancesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumeInformation(filter: PfltFilter, index: UInt, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumeInformation(filter.toString(), index.toInt(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltEnumerateVolumes(filter: PfltFilter, volumelist: MutPtr, volumelistsize: UInt, numbervolumesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltEnumerateVolumes(filter.toString(), volumelist.rawAddress.toString(), volumelistsize.toInt(), numbervolumesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlRead(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlRead(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlReadComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, mdlchain: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlReadComplete(initiatinginstance.toString(), fileobject.rawAddress.toString(), mdlchain.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoMdlWriteComplete(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, mdlchain: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoMdlWriteComplete(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), mdlchain.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFastIoPrepareMdlWrite(initiatinginstance: PfltInstance, fileobject: ConstPtr, fileoffset: ConstPtr, length: UInt, lockkey: UInt, mdlchain: MutPtr, iostatus: MutPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFastIoPrepareMdlWrite(initiatinginstance.toString(), fileobject.rawAddress.toString(), fileoffset.rawAddress.toString(), length.toInt(), lockkey.toInt(), mdlchain.rawAddress.toString(), iostatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFindExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFindExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers(instance.toString(), fileobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFlushBuffers2(instance: PfltInstance, fileobject: ConstPtr, flushtype: UInt, callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFlushBuffers2(instance.toString(), fileobject.rawAddress.toString(), flushtype.toInt(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltFreeCallbackData(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeCallbackData(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeDeferredIoWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameter(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameter(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeExtraCreateParameterList(filter: PfltFilter, ecplist: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeExtraCreateParameterList(filter.toString(), ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeFileLock(filelock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeGenericWorkItem(fltworkitem: PfltGenericWorkitem) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeGenericWorkItem(fltworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeOpenReparseList(filter: PfltFilter, ecplist: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeOpenReparseList(filter.toString(), ecplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreePoolAlignedWithTag(instance: PfltInstance, buffer: ConstPtr, tag: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreePoolAlignedWithTag(instance.toString(), buffer.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFreeSecurityDescriptor(securitydescriptor: PsecurityDescriptor) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFreeSecurityDescriptor(securitydescriptor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltFsControlFile(instance: PfltInstance, fileobject: ConstPtr, fscontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltFsControlFile(instance.toString(), fileobject.rawAddress.toString(), fscontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetActivityIdCallbackData(callbackdata: ConstPtr, guid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetActivityIdCallbackData(callbackdata.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetBottomInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetBottomInstance(volume.toString(), instance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetContexts(fltobjects: ConstPtr, desiredcontexts: UShort, contexts: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContexts(fltobjects.rawAddress.toString(), desiredcontexts.toInt(), contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltGetContextsEx(fltobjects: ConstPtr, desiredcontexts: UShort, contextssize: ULong, contexts: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetContextsEx(fltobjects.rawAddress.toString(), desiredcontexts.toInt(), contextssize.toString(), contexts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDestinationFileNameInformation(instance: PfltInstance, fileobject: ConstPtr, rootdirectory: Handle, filename: Pcwstr, filenamelength: UInt, nameoptions: UInt, retfilenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDestinationFileNameInformation(instance.toString(), fileobject.rawAddress.toString(), rootdirectory.rawAddress.toString(), filename.rawAddress.toString(), filenamelength.toInt(), nameoptions.toInt(), retfilenameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDeviceObject(volume: PfltVolume, deviceobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDeviceObject(volume.toString(), deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetDiskDeviceObject(volume: PfltVolume, diskdeviceobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetDiskDeviceObject(volume.toString(), diskdeviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetEcpListFromCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetEcpListFromCallbackData(filter.toString(), callbackdata.rawAddress.toString(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformation(callbackdata: ConstPtr, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformation(callbackdata.rawAddress.toString(), nameoptions.toInt(), filenameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileNameInformationUnsafe(fileobject: ConstPtr, instance: PfltInstance, nameoptions: UInt, filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileNameInformationUnsafe(fileobject.rawAddress.toString(), instance.toString(), nameoptions.toInt(), filenameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFileSystemType(fltobject: ConstPtr, filesystemtype: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFileSystemType(fltobject.rawAddress.toString(), filesystemtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromInstance(instance: PfltInstance, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromInstance(instance.toString(), retfilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterFromName(filtername: ConstPtr, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterFromName(filtername.rawAddress.toString(), retfilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFilterInformation(filter: PfltFilter, informationclass: FilterInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFilterInformation(filter.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetFsZeroingOffset(data: ConstPtr, zeroingoffset: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetFsZeroingOffset(data.rawAddress.toString(), zeroingoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceContext(instance: PfltInstance, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceContext(instance.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetInstanceInformation(instance: PfltInstance, informationclass: InstanceInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetInstanceInformation(instance.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoAttributionHandleFromCallbackData(data: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoAttributionHandleFromCallbackData(data.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHint(data: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHint(data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromCallbackData(data: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromCallbackData(data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromFileObject(fileobject: ConstPtr): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromFileObject(fileobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIoPriorityHintFromThread(thread: Pethread): IoPriorityHint =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIoPriorityHintFromThread(thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetIrpName(irpmajorcode: UByte): Pstr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetIrpName(irpmajorcode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetLowerInstance(currentinstance: PfltInstance, lowerinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetLowerInstance(currentinstance.toString(), lowerinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNewSystemBufferAddress(callbackdata: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNewSystemBufferAddress(callbackdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetNextExtraCreateParameter(filter: PfltFilter, ecplist: ConstPtr, currentecpcontext: ConstPtr, nextecptype: MutPtr, nextecpcontext: MutPtr, nextecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetNextExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), currentecpcontext.rawAddress.toString(), nextecptype.rawAddress.toString(), nextecpcontext.rawAddress.toString(), nextecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcess(callbackdata: ConstPtr): Peprocess =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcess(callbackdata.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessId(callbackdata: ConstPtr): UInt =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessId(callbackdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorProcessIdEx(callbackdata: ConstPtr): Handle =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorProcessIdEx(callbackdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRequestorSessionId(callbackdata: ConstPtr, sessionid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRequestorSessionId(callbackdata.rawAddress.toString(), sessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetRoutineAddress(fltmgrroutinename: Pcstr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetRoutineAddress(fltmgrroutinename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSectionContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSectionContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetSwappedBufferMdlAddress(callbackdata: ConstPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetSwappedBufferMdlAddress(callbackdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTopInstance(volume: PfltVolume, instance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTopInstance(volume.toString(), instance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTransactionContext(instance: PfltInstance, transaction: ConstPtr, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTransactionContext(instance.toString(), transaction.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetTunneledName(callbackdata: ConstPtr, filenameinformation: ConstPtr, rettunneledfilenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetTunneledName(callbackdata.rawAddress.toString(), filenameinformation.rawAddress.toString(), rettunneledfilenameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetUpperInstance(currentinstance: PfltInstance, upperinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetUpperInstance(currentinstance.toString(), upperinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeContext(filter: PfltFilter, volume: PfltVolume, context: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeContext(filter.toString(), volume.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromDeviceObject(filter: PfltFilter, deviceobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromDeviceObject(filter.toString(), deviceobject.rawAddress.toString(), retvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromFileObject(filter: PfltFilter, fileobject: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromFileObject(filter.toString(), fileobject.rawAddress.toString(), retvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromInstance(instance: PfltInstance, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromInstance(instance.toString(), retvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeFromName(filter: PfltFilter, volumename: ConstPtr, retvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeFromName(filter.toString(), volumename.rawAddress.toString(), retvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeGuidName(volume: PfltVolume, volumeguidname: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeGuidName(volume.toString(), volumeguidname.rawAddress.toString(), buffersizeneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInformation(volume: PfltVolume, informationclass: FilterVolumeInformationClass, buffer: MutPtr, buffersize: UInt, bytesreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInformation(volume.toString(), informationclass, buffer.rawAddress.toString(), buffersize.toInt(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeInstanceFromName(filter: PfltFilter, volume: PfltVolume, instancename: ConstPtr, retinstance: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeInstanceFromName(filter.toString(), volume.toString(), instancename.rawAddress.toString(), retinstance.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeName(volume: PfltVolume, volumename: MutPtr, buffersizeneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeName(volume.toString(), volumename.rawAddress.toString(), buffersizeneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltGetVolumeProperties(volume: PfltVolume, volumeproperties: MutPtr, volumepropertieslength: UInt, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltGetVolumeProperties(volume.toString(), volumeproperties.rawAddress.toString(), volumepropertieslength.toInt(), lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltInitExtraCreateParameterLookasideList(filter: PfltFilter, lookaside: MutPtr, flags: UInt, size: ULong, tag: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitExtraCreateParameterLookasideList(filter.toString(), lookaside.rawAddress.toString(), flags.toInt(), size.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeFileLock(filelock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializeOplock(oplock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInitializePushLock(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltInitializePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltInsertExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecpcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltInsertExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIs32bitProcess(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIs32bitProcess(callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsCallbackDataDirty(data: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsCallbackDataDirty(data.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsDirectory(fileobject: ConstPtr, instance: PfltInstance, isdirectory: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsDirectory(fileobject.rawAddress.toString(), instance.toString(), isdirectory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpAcknowledged(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpAcknowledged(filter.toString(), ecpcontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsEcpFromUserMode(filter: PfltFilter, ecpcontext: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsEcpFromUserMode(filter.toString(), ecpcontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsFltMgrVolumeDeviceObject(deviceobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsFltMgrVolumeDeviceObject(deviceobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoCanceled(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoCanceled(callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowed(sourceinstance: PfltInstance, targetinstance: PfltInstance, redirectionallowed: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowed(sourceinstance.toString(), targetinstance.toString(), redirectionallowed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsIoRedirectionAllowedForOperation(data: ConstPtr, targetinstance: PfltInstance, redirectionallowedthisio: MutPtr, redirectionallowedallio: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsIoRedirectionAllowedForOperation(data.rawAddress.toString(), targetinstance.toString(), redirectionallowedthisio.rawAddress.toString(), redirectionallowedallio.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsOperationSynchronous(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsOperationSynchronous(callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeSnapshot(fltobject: ConstPtr, issnapshotvolume: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeSnapshot(fltobject.rawAddress.toString(), issnapshotvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltIsVolumeWritable(fltobject: ConstPtr, iswritable: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltIsVolumeWritable(fltobject.rawAddress.toString(), iswritable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLoadFilter(filtername: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltLoadFilter(filtername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltLockUserBuffer(callbackdata: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltLockUserBuffer(callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltNotifyFilterChangeDirectory(notifysync: PnotifySync, notifylist: MutPtr, fscontext: ConstPtr, fulldirectoryname: ConstPtr, watchtree: Boolean, ignorebuffer: Boolean, completionfilter: UInt, notifycallbackdata: ConstPtr, traversecallback: PcheckForTraverseAccess, subjectcontext: ConstPtr, filtercallback: PfilterReportChange): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltObjectDereference(fltobject: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectDereference(fltobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltObjectReference(fltobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltObjectReference(fltobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOpenVolume(instance: PfltInstance, volumehandle: MutPtr, volumefileobject: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOpenVolume(instance.toString(), volumehandle.rawAddress.toString(), volumefileobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakH(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakH(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNone(oplock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNone(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockBreakToNoneEx(oplock: ConstPtr, callbackdata: ConstPtr, flags: UInt, context: ConstPtr, waitcompletionroutine: PfltoplockWaitCompleteRoutine, prepostcallbackdataroutine: PfltoplockPrepostCallbackdataRoutine): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockBreakToNoneEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), flags.toInt(), context.rawAddress.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrl(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrl(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), opencount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockFsctrlEx(oplock: ConstPtr, callbackdata: ConstPtr, opencount: UInt, flags: UInt): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockFsctrlEx(oplock.rawAddress.toString(), callbackdata.rawAddress.toString(), opencount.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsFastIoPossible(oplock: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsFastIoPossible(oplock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockIsSharedRequest(callbackdata: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockIsSharedRequest(callbackdata.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltOplockKeysEqual(fo1: ConstPtr, fo2: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltOplockKeysEqual(fo1.rawAddress.toString(), fo2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileName(filename: ConstPtr, extension: MutPtr, stream: MutPtr, finalcomponent: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileName(filename.rawAddress.toString(), extension.rawAddress.toString(), stream.rawAddress.toString(), finalcomponent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltParseFileNameInformation(filenameinformation: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltParseFileNameInformation(filenameinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformAsynchronousIo(callbackdata: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformAsynchronousIo(callbackdata.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPerformSynchronousIo(callbackdata: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPerformSynchronousIo(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltPrePrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrePrepareComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPrepareToReuseEcp(filter: PfltFilter, ecpcontext: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPrepareToReuseEcp(filter.toString(), ecpcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltProcessFileLock(filelock: ConstPtr, callbackdata: ConstPtr, context: ConstPtr): FltPreopCallbackStatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltProcessFileLock(filelock.rawAddress.toString(), callbackdata.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateActivityIdToThread(callbackdata: ConstPtr, propagateid: MutPtr, originalid: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateActivityIdToThread(callbackdata.rawAddress.toString(), propagateid.rawAddress.toString(), originalid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPropagateIrpExtension(sourcedata: ConstPtr, targetdata: MutPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPropagateIrpExtension(sourcedata.rawAddress.toString(), targetdata.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltPurgeFileNameInformationCache(instance: PfltInstance, fileobject: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltPurgeFileNameInformationCache(instance.toString(), fileobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, returnsingleentry: Boolean, filename: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, returnsingleentry, filename.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryDirectoryFileEx(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, queryflags: UInt, filename: ConstPtr, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryDirectoryFileEx(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, queryflags.toInt(), filename.rawAddress.toString(), lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryEaFile(instance: PfltInstance, fileobject: ConstPtr, returnedeadata: MutPtr, length: UInt, returnsingleentry: Boolean, ealist: ConstPtr, ealistlength: UInt, eaindex: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryEaFile(instance.toString(), fileobject.rawAddress.toString(), returnedeadata.rawAddress.toString(), length.toInt(), returnsingleentry, ealist.rawAddress.toString(), ealistlength.toInt(), eaindex.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationByName(filter: PfltFilter, instance: PfltInstance, objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, drivercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationByName(filter.toString(), instance.toString(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryInformationFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, returnsingleentry: Boolean, sidlist: ConstPtr, sidlistlength: UInt, startsid: ConstPtr, restartscan: Boolean, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryQuotaInformationFile(instance.toString(), fileobject.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), returnsingleentry, sidlist.rawAddress.toString(), sidlistlength.toInt(), startsid.rawAddress.toString(), restartscan, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQuerySecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor, length: UInt, lengthneeded: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQuerySecurityObject(instance.toString(), fileobject.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString(), length.toInt(), lengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformation(instance.toString(), iosb.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueryVolumeInformationFile(instance: PfltInstance, fileobject: ConstPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass, lengthreturned: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueryVolumeInformationFile(instance.toString(), fileobject.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass, lengthreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueDeferredIoWorkItem(fltworkitem: PfltDeferredIoWorkitem, data: ConstPtr, workerroutine: PfltDeferredIoWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueDeferredIoWorkItem(fltworkitem.toString(), data.rawAddress.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltQueueGenericWorkItem(fltworkitem: PfltGenericWorkitem, fltobject: ConstPtr, workerroutine: PfltGenericWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltQueueGenericWorkItem(fltworkitem.toString(), fltobject.rawAddress.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), bytesread.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReadFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: MutPtr, flags: UInt, bytesread: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReadFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), bytesread.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), key.rawAddress.toString(), mdl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReferenceContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReferenceFileNameInformation(filenameinformation: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReferenceFileNameInformation(filenameinformation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRegisterFilter(driver: ConstPtr, registration: ConstPtr, retfilter: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterFilter(driver.rawAddress.toString(), registration.rawAddress.toString(), retfilter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRegisterForDataScan(instance: PfltInstance): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRegisterForDataScan(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReissueSynchronousIo(initiatinginstance: PfltInstance, callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReissueSynchronousIo(initiatinginstance.toString(), callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContext(context: PfltContext) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContext(context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContexts(contexts: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContexts(contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseContextsEx(contextssize: ULong, contexts: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseContextsEx(contextssize.toString(), contexts.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseFileNameInformation(filenameinformation: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseFileNameInformation(filenameinformation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLock(pushlock: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleasePushLockEx(pushlock: MutPtr, flags: UInt) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleasePushLockEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltReleaseResource(resource: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReleaseResource(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRemoveExtraCreateParameter(filter: PfltFilter, ecplist: MutPtr, ecptype: ConstPtr, ecpcontext: MutPtr, ecpcontextsize: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveExtraCreateParameter(filter.toString(), ecplist.rawAddress.toString(), ecptype.rawAddress.toString(), ecpcontext.rawAddress.toString(), ecpcontextsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRemoveOpenReparseEntry(filter: PfltFilter, data: ConstPtr, openreparseentry: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRemoveOpenReparseEntry(filter.toString(), data.rawAddress.toString(), openreparseentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRequestFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclassflags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestFileInfoOnCreateCompletion(filter.toString(), data.rawAddress.toString(), infoclassflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRequestOperationStatusCallback(data: ConstPtr, callbackroutine: PfltGetOperationStatusCallback, requestercontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRequestOperationStatusCallback(data.rawAddress.toString(), 0L.toString(), requestercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetainSwappedBufferMdlAddress(callbackdata: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetainSwappedBufferMdlAddress(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRetrieveFileInfoOnCreateCompletion(filter: PfltFilter, data: ConstPtr, infoclass: UInt, size: MutPtr): MutPtr =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) MutPtr((windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletion(filter.toString(), data.rawAddress.toString(), infoclass.toInt(), size.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveFileInfoOnCreateCompletionEx(filter: PfltFilter, data: ConstPtr, infoclass: UInt, retinfosize: MutPtr, retinfobuffer: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveFileInfoOnCreateCompletionEx(filter.toString(), data.rawAddress.toString(), infoclass.toInt(), retinfosize.rawAddress.toString(), retinfobuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRetrieveIoPriorityInfo(data: ConstPtr, fileobject: ConstPtr, thread: Pethread, priorityinfo: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRetrieveIoPriorityInfo(data.rawAddress.toString(), fileobject.rawAddress.toString(), thread.toString(), priorityinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltReuseCallbackData(callbackdata: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltReuseCallbackData(callbackdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltRollbackComplete(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackComplete(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltRollbackEnlistment(instance: PfltInstance, transaction: ConstPtr, transactioncontext: PfltContext): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltRollbackEnlistment(instance.toString(), transaction.rawAddress.toString(), transactioncontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSendMessage(filter: PfltFilter, clientport: ConstPtr, senderbuffer: ConstPtr, senderbufferlength: UInt, replybuffer: MutPtr, replylength: MutPtr, timeout: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSendMessage(filter.toString(), clientport.rawAddress.toString(), senderbuffer.rawAddress.toString(), senderbufferlength.toInt(), replybuffer.rawAddress.toString(), replylength.rawAddress.toString(), timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetActivityIdCallbackData(callbackdata: MutPtr, guid: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetActivityIdCallbackData(callbackdata.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetCallbackDataDirty(data: MutPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCallbackDataDirty(data.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltSetCancelCompletion(callbackdata: ConstPtr, canceledcallback: PfltCompleteCanceledCallback): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetCancelCompletion(callbackdata.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEaFile(instance: PfltInstance, fileobject: ConstPtr, eabuffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEaFile(instance.toString(), fileobject.rawAddress.toString(), eabuffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetEcpListIntoCallbackData(filter: PfltFilter, callbackdata: ConstPtr, ecplist: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetEcpListIntoCallbackData(filter.toString(), callbackdata.rawAddress.toString(), ecplist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFileContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFileContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffset(data: ConstPtr, zeroingoffset: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffset(data.rawAddress.toString(), zeroingoffset.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetFsZeroingOffsetRequired(data: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetFsZeroingOffsetRequired(data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInformationFile(instance: PfltInstance, fileobject: ConstPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInformationFile(instance.toString(), fileobject.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetInstanceContext(instance: PfltInstance, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetInstanceContext(instance.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoCallbackData(data: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoCallbackData(data.rawAddress.toString(), priorityhint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoFileObject(fileobject: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoFileObject(fileobject.rawAddress.toString(), priorityhint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetIoPriorityHintIntoThread(thread: Pethread, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetIoPriorityHintIntoThread(thread.toString(), priorityhint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetQuotaInformationFile(instance: PfltInstance, fileobject: ConstPtr, buffer: ConstPtr, length: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetQuotaInformationFile(instance.toString(), fileobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetSecurityObject(instance: PfltInstance, fileobject: ConstPtr, securityinformation: UInt, securitydescriptor: PsecurityDescriptor): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetSecurityObject(instance.toString(), fileobject.rawAddress.toString(), securityinformation.toInt(), securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetStreamHandleContext(instance: PfltInstance, fileobject: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetStreamHandleContext(instance.toString(), fileobject.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetTransactionContext(instance: PfltInstance, transaction: ConstPtr, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetTransactionContext(instance.toString(), transaction.rawAddress.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeContext(volume: PfltVolume, operation: FltSetContextOperation, newcontext: PfltContext, oldcontext: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeContext(volume.toString(), operation, newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSetVolumeInformation(instance: PfltInstance, iosb: MutPtr, fsinformation: MutPtr, length: UInt, fsinformationclass: FsInformationClass): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSetVolumeInformation(instance.toString(), iosb.rawAddress.toString(), fsinformation.rawAddress.toString(), length.toInt(), fsinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltStartFiltering(filter: PfltFilter): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltStartFiltering(filter.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContexts(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsFileContextsEx(fileobject: ConstPtr, instance: PfltInstance): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsFileContextsEx(fileobject.rawAddress.toString(), instance.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamContexts(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltSupportsStreamHandleContexts(fileobject: ConstPtr): Boolean =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltSupportsStreamHandleContexts(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString(), databuffer.rawAddress.toString(), databufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltTagFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr, databuffer: ConstPtr, databufferlength: UShort, existingfiletag: UInt, existingguid: ConstPtr, flags: UInt): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltTagFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString(), databuffer.rawAddress.toString(), databufferlength.toInt(), existingfiletag.toInt(), existingguid.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUninitializeFileLock(filelock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeFileLock(filelock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUninitializeOplock(oplock: ConstPtr) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltUninitializeOplock(oplock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUnloadFilter(filtername: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnloadFilter(filtername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltUnregisterFilter(filter: PfltFilter) {
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) {
        windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltUnregisterFilter(filter.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fltUntagFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, filetag: UInt, guid: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltUntagFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), filetag.toInt(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltVetoBypassIo(callbackdata: ConstPtr, fltobjects: ConstPtr, operationstatus: Ntstatus, failurereason: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltVetoBypassIo(callbackdata.rawAddress.toString(), fltobjects.rawAddress.toString(), operationstatus, failurereason.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFile(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFile(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), byteswritten.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltWriteFileEx(initiatinginstance: PfltInstance, fileobject: ConstPtr, byteoffset: ConstPtr, length: UInt, buffer: ConstPtr, flags: UInt, byteswritten: MutPtr, callbackroutine: PfltCompletedAsyncIoCallback, callbackcontext: ConstPtr, key: ConstPtr, mdl: ConstPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltWriteFileEx(initiatinginstance.toString(), fileobject.rawAddress.toString(), byteoffset.rawAddress.toString(), length.toInt(), buffer.rawAddress.toString(), flags.toInt(), byteswritten.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), key.rawAddress.toString(), mdl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fltpTraceRedirectedFileIo(originatingfileobject: ConstPtr, childcallbackdata: MutPtr): Ntstatus =
    if (windowsWdkStorageFilesystemMinifiltersNapiAddon != null) (windowsWdkStorageFilesystemMinifiltersNapiAddon.windowssysWindowsWdkStorageFilesystemMinifiltersFltpTraceRedirectedFileIo(originatingfileobject.rawAddress.toString(), childcallbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
