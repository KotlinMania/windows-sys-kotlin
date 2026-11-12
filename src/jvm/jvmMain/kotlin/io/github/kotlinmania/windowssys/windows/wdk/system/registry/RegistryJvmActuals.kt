@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWdkSystemRegistryJniBridge {
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
        val stream = WindowsWdkSystemRegistryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(masterkeyhandle: Long, count: Int, subordinateobjects: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryNtSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(masterkeyhandle: Long, count: Int, subordinateobjects: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemRegistryZwSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int
}

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(transactionhandle.rawAddress, flags.toInt())

public actual fun ntCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtCreateKey(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, titleindex.toInt(), cls.rawAddress, createoptions.toInt(), disposition.rawAddress)

public actual fun ntCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, titleindex.toInt(), cls.rawAddress, createoptions.toInt(), transactionhandle.rawAddress, disposition.rawAddress)

public actual fun ntCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, createoptions.toInt())

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtDeleteKey(keyhandle.rawAddress)

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtDeleteValueKey(keyhandle.rawAddress, valuename.rawAddress)

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtEnumerateKey(keyhandle.rawAddress, index.toInt(), keyinformationclass, keyinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(keyhandle.rawAddress, index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtFlushKey(keyhandle.rawAddress)

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(masterkeyhandle.rawAddress, count.toInt(), subordinateobjects.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, completionfilter.toInt(), watchtree, buffer.rawAddress, buffersize.toInt(), asynchronous)

public actual fun ntOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtOpenKey(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtOpenKeyEx(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, openoptions.toInt())

public actual fun ntOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, transactionhandle.rawAddress)

public actual fun ntOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, openoptions.toInt(), transactionhandle.rawAddress)

public actual fun ntOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtQueryKey(keyhandle.rawAddress, keyinformationclass, keyinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(keyhandle.rawAddress, valueentries.rawAddress, entrycount.toInt(), valuebuffer.rawAddress, bufferlength.rawAddress, requiredbufferlength.rawAddress)

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtQueryValueKey(keyhandle.rawAddress, valuename.rawAddress, keyvalueinformationclass, keyvalueinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun ntRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtRenameKey(keyhandle.rawAddress, newname.rawAddress)

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtRestoreKey(keyhandle.rawAddress, filehandle.rawAddress, flags.toInt())

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(transactionhandle.rawAddress, flags.toInt())

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtSaveKey(keyhandle.rawAddress, filehandle.rawAddress)

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtSaveKeyEx(keyhandle.rawAddress, filehandle.rawAddress, format.toInt())

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtSetInformationKey(keyhandle.rawAddress, keysetinformationclass, keysetinformation.rawAddress, keysetinformationlength.toInt())

public actual fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryNtSetValueKey(keyhandle.rawAddress, valuename.rawAddress, titleindex.toInt(), type.toInt(), data.rawAddress, datasize.toInt())

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(transactionhandle.rawAddress, flags.toInt())

public actual fun zwCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwCreateKey(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, titleindex.toInt(), cls.rawAddress, createoptions.toInt(), disposition.rawAddress)

public actual fun zwCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, titleindex.toInt(), cls.rawAddress, createoptions.toInt(), transactionhandle.rawAddress, disposition.rawAddress)

public actual fun zwCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, createoptions.toInt())

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwDeleteKey(keyhandle.rawAddress)

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwDeleteValueKey(keyhandle.rawAddress, valuename.rawAddress)

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwEnumerateKey(keyhandle.rawAddress, index.toInt(), keyinformationclass, keyinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(keyhandle.rawAddress, index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwFlushKey(keyhandle.rawAddress)

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(masterkeyhandle.rawAddress, count.toInt(), subordinateobjects.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, completionfilter.toInt(), watchtree, buffer.rawAddress, buffersize.toInt(), asynchronous)

public actual fun zwOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwOpenKey(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwOpenKeyEx(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, openoptions.toInt())

public actual fun zwOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, transactionhandle.rawAddress)

public actual fun zwOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(keyhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, openoptions.toInt(), transactionhandle.rawAddress)

public actual fun zwOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwQueryKey(keyhandle.rawAddress, keyinformationclass, keyinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(keyhandle.rawAddress, valueentries.rawAddress, entrycount.toInt(), valuebuffer.rawAddress, bufferlength.rawAddress, requiredbufferlength.rawAddress)

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwQueryValueKey(keyhandle.rawAddress, valuename.rawAddress, keyvalueinformationclass, keyvalueinformation.rawAddress, length.toInt(), resultlength.rawAddress)

public actual fun zwRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwRenameKey(keyhandle.rawAddress, newname.rawAddress)

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwRestoreKey(keyhandle.rawAddress, filehandle.rawAddress, flags.toInt())

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(transactionhandle.rawAddress, flags.toInt())

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwSaveKey(keyhandle.rawAddress, filehandle.rawAddress)

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwSaveKeyEx(keyhandle.rawAddress, filehandle.rawAddress, format.toInt())

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwSetInformationKey(keyhandle.rawAddress, keysetinformationclass, keysetinformation.rawAddress, keysetinformationlength.toInt())

public actual fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssysWindowsWdkSystemRegistryZwSetValueKey(keyhandle.rawAddress, valuename.rawAddress, titleindex.toInt(), type.toInt(), data.rawAddress, datasize.toInt())
