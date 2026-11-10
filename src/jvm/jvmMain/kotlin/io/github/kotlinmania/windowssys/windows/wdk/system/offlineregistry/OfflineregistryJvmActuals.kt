@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWdkSystemOfflineregistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRCloseHive(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRCloseKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRCreateHive(horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRCreateKey(keyhandle: Long, lpsubkey: Long, lpclass: Long, dwoptions: Int, psecuritydescriptor: Long, phkresult: Long, pdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRDeleteKey(handle: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRDeleteValue(handle: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oREnumKey(handle: Long, dwindex: Int, lpname: Long, lpcname: Long, lpclass: Long, lpcclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oREnumValue(handle: Long, dwindex: Int, lpvaluename: Long, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRGetValue(handle: Long, lpsubkey: Long, lpvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRGetVersion(pdwmajorversion: Long, pdwminorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRMergeHives(hivehandles: Long, hivecount: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oROpenHive(filepath: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle(filehandle: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oROpenKey(handle: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey(handle: Long, lpclass: Long, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRRenameKey(handle: Long, lpnewname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRSaveHive(horkey: Long, hivepath: Long, osmajorversion: Int, osminorversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRSetValue(handle: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags(handle: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_oRStart(): Int
}

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRCloseHive((handle?.value ?: 0L)).toUInt()

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRCloseKey((keyhandle?.value ?: 0L)).toUInt()

public actual fun oRCreateHive(horkey: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRCreateHive((horkey?.value ?: 0L)).toUInt()

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: COpaquePointer?, pdwdisposition: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRCreateKey((keyhandle?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpclass?.value ?: 0L), dwoptions.toInt(), (psecuritydescriptor?.value ?: 0L), (phkresult?.value ?: 0L), (pdwdisposition?.value ?: 0L)).toUInt()

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRDeleteKey((handle?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRDeleteValue((handle?.value ?: 0L), (lpvaluename?.value ?: 0L)).toUInt()

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: COpaquePointer?, lpclass: Pwstr, lpcclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oREnumKey((handle?.value ?: 0L), dwindex.toInt(), (lpname?.value ?: 0L), (lpcname?.value ?: 0L), (lpclass?.value ?: 0L), (lpcclass?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oREnumValue((handle?.value ?: 0L), dwindex.toInt(), (lpvaluename?.value ?: 0L), (lpcvaluename?.value ?: 0L), (lptype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity((handle?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRGetValue((handle?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvalue?.value ?: 0L), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun oRGetVersion(pdwmajorversion: COpaquePointer?, pdwminorversion: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRGetVersion((pdwmajorversion?.value ?: 0L), (pdwminorversion?.value ?: 0L)).toUInt()

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags((handle?.value ?: 0L), (pdwflags?.value ?: 0L)).toUInt()

public actual fun oRMergeHives(hivehandles: COpaquePointer?, hivecount: UInt, phkresult: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRMergeHives((hivehandles?.value ?: 0L), hivecount.toInt(), (phkresult?.value ?: 0L)).toUInt()

public actual fun oROpenHive(filepath: Pcwstr, horkey: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oROpenHive((filepath?.value ?: 0L), (horkey?.value ?: 0L)).toUInt()

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle((filehandle?.value ?: 0L), (horkey?.value ?: 0L)).toUInt()

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oROpenKey((handle?.value ?: 0L), (lpsubkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcmaxsubkeylen: COpaquePointer?, lpcmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcmaxvaluenamelen: COpaquePointer?, lpcmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey((handle?.value ?: 0L), (lpclass?.value ?: 0L), (lpcclass?.value ?: 0L), (lpcsubkeys?.value ?: 0L), (lpcmaxsubkeylen?.value ?: 0L), (lpcmaxclasslen?.value ?: 0L), (lpcvalues?.value ?: 0L), (lpcmaxvaluenamelen?.value ?: 0L), (lpcmaxvaluelen?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRRenameKey((handle?.value ?: 0L), (lpnewname?.value ?: 0L)).toUInt()

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRSaveHive((horkey?.value ?: 0L), (hivepath?.value ?: 0L), osmajorversion.toInt(), osminorversion.toInt()).toUInt()

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity((handle?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRSetValue((handle?.value ?: 0L), (lpvaluename?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags((handle?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun oRShutdown(): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRShutdown().toUInt()

public actual fun oRStart(): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_oRStart().toUInt()
