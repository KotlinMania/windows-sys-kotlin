@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWdkSystemOfflineregistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORCloseHive(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORCloseKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORCreateHive(horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORCreateKey(keyhandle: Long, lpsubkey: Long, lpclass: Long, dwoptions: Int, psecuritydescriptor: Long, phkresult: Long, pdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(handle: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(handle: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_OREnumKey(handle: Long, dwindex: Int, lpname: Long, lpcname: Long, lpclass: Long, lpcclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_OREnumValue(handle: Long, dwindex: Int, lpvaluename: Long, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORGetValue(handle: Long, lpsubkey: Long, lpvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORMergeHives(hivehandles: Long, hivecount: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_OROpenHive(filepath: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(filehandle: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_OROpenKey(handle: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(handle: Long, lpclass: Long, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORRenameKey(handle: Long, lpnewname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORSaveHive(horkey: Long, hivepath: Long, osmajorversion: Int, osminorversion: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORSetValue(handle: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(handle: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORShutdown(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_offlineregistry_ORStart(): Int
}

public actual fun ORCloseHive(handle: ORHKEY): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORCloseHive(handle).toUInt()

public actual fun ORCloseKey(keyhandle: ORHKEY): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORCloseKey(keyhandle).toUInt()

public actual fun ORCreateHive(horkey: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORCreateHive(horkey).toUInt()

public actual fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORCreateKey(keyhandle, lpsubkey, lpclass, dwoptions.toInt(), psecuritydescriptor, phkresult, pdwdisposition).toUInt()

public actual fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(handle, lpsubkey).toUInt()

public actual fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(handle, lpvaluename).toUInt()

public actual fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_OREnumKey(handle, dwindex.toInt(), lpname, lpcname, lpclass, lpcclass, lpftlastwritetime).toUInt()

public actual fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_OREnumValue(handle, dwindex.toInt(), lpvaluename, lpcvaluename, lptype, lpdata, lpcbdata).toUInt()

public actual fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(handle, securityinformation.toInt(), psecuritydescriptor, lpcbsecuritydescriptor).toUInt()

public actual fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORGetValue(handle, lpsubkey, lpvalue, pdwtype, pvdata, pcbdata).toUInt()

public actual fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORGetVersion(pdwmajorversion, pdwminorversion).toUInt()

public actual fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(handle, pdwflags).toUInt()

public actual fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORMergeHives(hivehandles, hivecount.toInt(), phkresult).toUInt()

public actual fun OROpenHive(filepath: PCWSTR, horkey: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_OROpenHive(filepath, horkey).toUInt()

public actual fun OROpenHiveByHandle(filehandle: HANDLE, horkey: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(filehandle, horkey).toUInt()

public actual fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_OROpenKey(handle, lpsubkey, phkresult).toUInt()

public actual fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(handle, lpclass, lpcclass, lpcsubkeys, lpcmaxsubkeylen, lpcmaxclasslen, lpcvalues, lpcmaxvaluenamelen, lpcmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime).toUInt()

public actual fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORRenameKey(handle, lpnewname).toUInt()

public actual fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORSaveHive(horkey, hivepath, osmajorversion.toInt(), osminorversion.toInt()).toUInt()

public actual fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(handle, securityinformation.toInt(), psecuritydescriptor).toUInt()

public actual fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORSetValue(handle, lpvaluename, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(handle, dwflags.toInt()).toUInt()

public actual fun ORShutdown(): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORShutdown().toUInt()

public actual fun ORStart(): WIN32_ERROR =
    WindowsWdkSystemOfflineregistryJniBridge.windowssys_windows_wdk_system_offlineregistry_ORStart().toUInt()
