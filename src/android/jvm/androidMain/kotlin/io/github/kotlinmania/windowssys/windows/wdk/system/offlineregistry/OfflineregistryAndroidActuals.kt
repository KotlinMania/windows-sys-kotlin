@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWdkSystemOfflineregistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORCloseHive(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORCloseKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORCreateHive(horkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORCreateKey(keyhandle: Long, lpsubkey: Long, lpclass: Long, dwoptions: Int, psecuritydescriptor: Long, phkresult: Long, pdwdisposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORDeleteKey(handle: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORDeleteValue(handle: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryOREnumKey(handle: Long, dwindex: Int, lpname: Long, lpcname: Long, lpclass: Long, lpcclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryOREnumValue(handle: Long, dwindex: Int, lpvaluename: Long, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORGetValue(handle: Long, lpsubkey: Long, lpvalue: Long, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(handle: Long, pdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORMergeHives(hivehandles: Long, hivecount: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryOROpenHive(filepath: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(filehandle: Long, horkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryOROpenKey(handle: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(handle: Long, lpclass: Long, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORRenameKey(handle: Long, lpnewname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORSaveHive(horkey: Long, hivepath: Long, osmajorversion: Int, osminorversion: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(handle: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORSetValue(handle: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(handle: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORShutdown(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemOfflineregistryORStart(): Int
}

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORCloseHive(handle.rawAddress).toUInt()

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORCloseKey(keyhandle.rawAddress).toUInt()

public actual fun oRCreateHive(horkey: MutPtr<Orhkey>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORCreateHive(horkey.rawAddress).toUInt()

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr<Orhkey>, pdwdisposition: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORCreateKey(keyhandle.rawAddress, lpsubkey.rawAddress, lpclass.rawAddress, dwoptions.toInt(), psecuritydescriptor.rawAddress, phkresult.rawAddress, pdwdisposition.rawAddress).toUInt()

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORDeleteKey(handle.rawAddress, lpsubkey.rawAddress).toUInt()

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORDeleteValue(handle.rawAddress, lpvaluename.rawAddress).toUInt()

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr<UInt>, lpclass: Pwstr, lpcclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryOREnumKey(handle.rawAddress, dwindex.toInt(), lpname.rawAddress, lpcname.rawAddress, lpclass.rawAddress, lpcclass.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryOREnumValue(handle.rawAddress, dwindex.toInt(), lpvaluename.rawAddress, lpcvaluename.rawAddress, lptype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(handle.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress).toUInt()

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORGetValue(handle.rawAddress, lpsubkey.rawAddress, lpvalue.rawAddress, pdwtype.rawAddress, pvdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun oRGetVersion(pdwmajorversion: MutPtr<UInt>, pdwminorversion: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORGetVersion(pdwmajorversion.rawAddress, pdwminorversion.rawAddress).toUInt()

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr<UInt>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(handle.rawAddress, pdwflags.rawAddress).toUInt()

public actual fun oRMergeHives(hivehandles: ConstPtr<Orhkey>, hivecount: UInt, phkresult: MutPtr<Orhkey>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORMergeHives(hivehandles.rawAddress, hivecount.toInt(), phkresult.rawAddress).toUInt()

public actual fun oROpenHive(filepath: Pcwstr, horkey: MutPtr<Orhkey>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryOROpenHive(filepath.rawAddress, horkey.rawAddress).toUInt()

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr<Orhkey>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(filehandle.rawAddress, horkey.rawAddress).toUInt()

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr<Orhkey>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryOROpenKey(handle.rawAddress, lpsubkey.rawAddress, phkresult.rawAddress).toUInt()

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcmaxsubkeylen: MutPtr<UInt>, lpcmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcmaxvaluenamelen: MutPtr<UInt>, lpcmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(handle.rawAddress, lpclass.rawAddress, lpcclass.rawAddress, lpcsubkeys.rawAddress, lpcmaxsubkeylen.rawAddress, lpcmaxclasslen.rawAddress, lpcvalues.rawAddress, lpcmaxvaluenamelen.rawAddress, lpcmaxvaluelen.rawAddress, lpcbsecuritydescriptor.rawAddress, lpftlastwritetime.rawAddress).toUInt()

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORRenameKey(handle.rawAddress, lpnewname.rawAddress).toUInt()

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORSaveHive(horkey.rawAddress, hivepath.rawAddress, osmajorversion.toInt(), osminorversion.toInt()).toUInt()

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(handle.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress).toUInt()

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORSetValue(handle.rawAddress, lpvaluename.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(handle.rawAddress, dwflags.toInt()).toUInt()

public actual fun oRShutdown(): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORShutdown().toUInt()

public actual fun oRStart(): Win32Error =
    WindowsWdkSystemOfflineregistryJniBridge.windowssysWindowsWdkSystemOfflineregistryORStart().toUInt()
