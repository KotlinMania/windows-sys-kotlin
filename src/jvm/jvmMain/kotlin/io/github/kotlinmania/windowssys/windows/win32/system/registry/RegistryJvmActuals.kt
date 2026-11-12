@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32SystemRegistryJniBridge {
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
        val stream = WindowsWin32SystemRegistryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(hkeyprimary: Long, pwszprimarysubkey: Long, hkeyfallback: Long, pwszfallbacksubkey: Long, pwszvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, cbdatain: Int, pcbdataout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegConnectRegistryA(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegConnectRegistryW(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCopyTreeA(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCopyTreeW(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyExA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyExW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegCreateKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteKeyW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteTreeA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteTreeW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteValueA(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDeleteValueW(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumKeyA(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumKeyExA(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumKeyExW(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumKeyW(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumValueA(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegEnumValueW(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegFlushKey(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegGetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegGetValueA(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegGetValueW(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadKeyA(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadKeyW(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(hkey: Long, bwatchsubtree: Int, dwnotifyfilter: Int, hevent: Long, fasynchronous: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyExA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyExW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(htoken: Long, dwoptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegOverridePredefKey(hkey: Long, hnewhkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(hkey: Long, valList: Long, numVals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(hkey: Long, valList: Long, numVals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(hbase: Long, bisreflectiondisabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryValueA(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryValueExA(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryValueExW(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegQueryValueW(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegRenameKey(hkey: Long, lpsubkeyname: Long, lpnewkeyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegReplaceKeyA(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegReplaceKeyW(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegRestoreKeyA(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegRestoreKeyW(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSaveKeyA(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSaveKeyExA(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSaveKeyExW(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSaveKeyW(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetValueA(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetValueExA(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetValueExW(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegSetValueW(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(hkey: Long, lpsubkey: Long): Int
}

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr, pvdata: MutPtr, cbdatain: UInt, pcbdataout: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(hkeyprimary.rawAddress, pwszprimarysubkey.rawAddress, hkeyfallback.rawAddress, pwszfallbacksubkey.rawAddress, pwszvalue.rawAddress, dwflags.toInt(), pdwtype.rawAddress, pvdata.rawAddress, cbdatain.toInt(), pcbdataout.rawAddress).toUInt()

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCloseKey(hkey.rawAddress).toUInt()

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegConnectRegistryA(lpmachinename.rawAddress, hkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(lpmachinename.rawAddress, hkey.rawAddress, flags.toInt(), phkresult.rawAddress)

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(lpmachinename.rawAddress, hkey.rawAddress, flags.toInt(), phkresult.rawAddress)

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegConnectRegistryW(lpmachinename.rawAddress, hkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCopyTreeA(hkeysrc.rawAddress, lpsubkey.rawAddress, hkeydest.rawAddress).toUInt()

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCopyTreeW(hkeysrc.rawAddress, lpsubkey.rawAddress, hkeydest.rawAddress).toUInt()

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyA(hkey.rawAddress, lpsubkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyExA(hkey.rawAddress, lpsubkey.rawAddress, reserved.toInt(), lpclass.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress).toUInt()

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyExW(hkey.rawAddress, lpsubkey.rawAddress, reserved.toInt(), lpclass.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress).toUInt()

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(hkey.rawAddress, lpsubkey.rawAddress, reserved.toInt(), lpclass.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress, htransaction.rawAddress, pextendedparemeter.rawAddress).toUInt()

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(hkey.rawAddress, lpsubkey.rawAddress, reserved.toInt(), lpclass.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress, htransaction.rawAddress, pextendedparemeter.rawAddress).toUInt()

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegCreateKeyW(hkey.rawAddress, lpsubkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyA(hkey.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(hkey.rawAddress, lpsubkey.rawAddress, samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(hkey.rawAddress, lpsubkey.rawAddress, samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(hkey.rawAddress, lpsubkey.rawAddress, samdesired.toInt(), reserved.toInt(), htransaction.rawAddress, pextendedparameter.rawAddress).toUInt()

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(hkey.rawAddress, lpsubkey.rawAddress, samdesired.toInt(), reserved.toInt(), htransaction.rawAddress, pextendedparameter.rawAddress).toUInt()

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(hkey.rawAddress, lpsubkey.rawAddress, lpvaluename.rawAddress).toUInt()

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(hkey.rawAddress, lpsubkey.rawAddress, lpvaluename.rawAddress).toUInt()

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteKeyW(hkey.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteTreeA(hkey.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteTreeW(hkey.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteValueA(hkey.rawAddress, lpvaluename.rawAddress).toUInt()

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDeleteValueW(hkey.rawAddress, lpvaluename.rawAddress).toUInt()

public actual fun regDisablePredefinedCache(): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache().toUInt()

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx().toUInt()

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(hbase.rawAddress).toUInt()

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(hbase.rawAddress).toUInt()

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumKeyA(hkey.rawAddress, dwindex.toInt(), lpname.rawAddress, cchname.toInt()).toUInt()

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumKeyExA(hkey.rawAddress, dwindex.toInt(), lpname.rawAddress, lpcchname.rawAddress, lpreserved.rawAddress, lpclass.rawAddress, lpcchclass.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pwstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumKeyExW(hkey.rawAddress, dwindex.toInt(), lpname.rawAddress, lpcchname.rawAddress, lpreserved.rawAddress, lpclass.rawAddress, lpcchclass.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumKeyW(hkey.rawAddress, dwindex.toInt(), lpname.rawAddress, cchname.toInt()).toUInt()

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumValueA(hkey.rawAddress, dwindex.toInt(), lpvaluename.rawAddress, lpcchvaluename.rawAddress, lpreserved.rawAddress, lptype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegEnumValueW(hkey.rawAddress, dwindex.toInt(), lpvaluename.rawAddress, lpcchvaluename.rawAddress, lpreserved.rawAddress, lptype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegFlushKey(hkey.rawAddress).toUInt()

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegGetKeySecurity(hkey.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress).toUInt()

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegGetValueA(hkey.rawAddress, lpsubkey.rawAddress, lpvalue.rawAddress, dwflags.toInt(), pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegGetValueW(hkey.rawAddress, lpsubkey.rawAddress, lpvalue.rawAddress, dwflags.toInt(), pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(lpfile.rawAddress, phkresult.rawAddress, samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(lpfile.rawAddress, phkresult.rawAddress, samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadKeyA(hkey.rawAddress, lpsubkey.rawAddress, lpfile.rawAddress).toUInt()

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadKeyW(hkey.rawAddress, lpsubkey.rawAddress, lpfile.rawAddress).toUInt()

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(hkey.rawAddress, pszvalue.rawAddress, pszoutbuf.rawAddress, cboutbuf.toInt(), pcbdata.rawAddress, flags.toInt(), pszdirectory.rawAddress).toUInt()

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(hkey.rawAddress, pszvalue.rawAddress, pszoutbuf.rawAddress, cboutbuf.toInt(), pcbdata.rawAddress, flags.toInt(), pszdirectory.rawAddress).toUInt()

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(hkey.rawAddress, bwatchsubtree, dwnotifyfilter.toInt(), hevent.rawAddress, fasynchronous).toUInt()

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(samdesired.toInt(), phkresult.rawAddress).toUInt()

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyA(hkey.rawAddress, lpsubkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyExA(hkey.rawAddress, lpsubkey.rawAddress, uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress).toUInt()

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyExW(hkey.rawAddress, lpsubkey.rawAddress, uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress).toUInt()

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(hkey.rawAddress, lpsubkey.rawAddress, uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress, htransaction.rawAddress, pextendedparemeter.rawAddress).toUInt()

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(hkey.rawAddress, lpsubkey.rawAddress, uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress, htransaction.rawAddress, pextendedparemeter.rawAddress).toUInt()

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenKeyW(hkey.rawAddress, lpsubkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(htoken.rawAddress, dwoptions.toInt(), samdesired.toInt(), phkresult.rawAddress).toUInt()

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegOverridePredefKey(hkey.rawAddress, hnewhkey.rawAddress).toUInt()

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(hkey.rawAddress, lpclass.rawAddress, lpcchclass.rawAddress, lpreserved.rawAddress, lpcsubkeys.rawAddress, lpcbmaxsubkeylen.rawAddress, lpcbmaxclasslen.rawAddress, lpcvalues.rawAddress, lpcbmaxvaluenamelen.rawAddress, lpcbmaxvaluelen.rawAddress, lpcbsecuritydescriptor.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(hkey.rawAddress, lpclass.rawAddress, lpcchclass.rawAddress, lpreserved.rawAddress, lpcsubkeys.rawAddress, lpcbmaxsubkeylen.rawAddress, lpcbmaxclasslen.rawAddress, lpcvalues.rawAddress, lpcbmaxvaluenamelen.rawAddress, lpcbmaxvaluelen.rawAddress, lpcbsecuritydescriptor.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(hkey.rawAddress, valList.rawAddress, numVals.toInt(), lpvaluebuf.rawAddress, ldwtotsize.rawAddress).toUInt()

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(hkey.rawAddress, valList.rawAddress, numVals.toInt(), lpvaluebuf.rawAddress, ldwtotsize.rawAddress).toUInt()

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(hbase.rawAddress, bisreflectiondisabled.rawAddress).toUInt()

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryValueA(hkey.rawAddress, lpsubkey.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryValueExA(hkey.rawAddress, lpvaluename.rawAddress, lpreserved.rawAddress, lptype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryValueExW(hkey.rawAddress, lpvaluename.rawAddress, lpreserved.rawAddress, lptype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegQueryValueW(hkey.rawAddress, lpsubkey.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegRenameKey(hkey.rawAddress, lpsubkeyname.rawAddress, lpnewkeyname.rawAddress).toUInt()

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegReplaceKeyA(hkey.rawAddress, lpsubkey.rawAddress, lpnewfile.rawAddress, lpoldfile.rawAddress).toUInt()

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegReplaceKeyW(hkey.rawAddress, lpsubkey.rawAddress, lpnewfile.rawAddress, lpoldfile.rawAddress).toUInt()

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegRestoreKeyA(hkey.rawAddress, lpfile.rawAddress, dwflags.toInt()).toUInt()

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegRestoreKeyW(hkey.rawAddress, lpfile.rawAddress, dwflags.toInt()).toUInt()

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSaveKeyA(hkey.rawAddress, lpfile.rawAddress, lpsecurityattributes.rawAddress).toUInt()

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSaveKeyExA(hkey.rawAddress, lpfile.rawAddress, lpsecurityattributes.rawAddress, flags.toInt()).toUInt()

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSaveKeyExW(hkey.rawAddress, lpfile.rawAddress, lpsecurityattributes.rawAddress, flags.toInt()).toUInt()

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSaveKeyW(hkey.rawAddress, lpfile.rawAddress, lpsecurityattributes.rawAddress).toUInt()

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetKeySecurity(hkey.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress).toUInt()

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetKeyValueA(hkey.rawAddress, lpsubkey.rawAddress, lpvaluename.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetKeyValueW(hkey.rawAddress, lpsubkey.rawAddress, lpvaluename.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetValueA(hkey.rawAddress, lpsubkey.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetValueExA(hkey.rawAddress, lpvaluename.rawAddress, reserved.toInt(), dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetValueExW(hkey.rawAddress, lpvaluename.rawAddress, reserved.toInt(), dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegSetValueW(hkey.rawAddress, lpsubkey.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(hkey.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(hkey.rawAddress, lpsubkey.rawAddress).toUInt()
