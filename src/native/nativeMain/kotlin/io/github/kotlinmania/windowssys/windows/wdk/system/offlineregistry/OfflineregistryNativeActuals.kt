@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORCloseHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORCloseKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORCreateHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORCreateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORDeleteKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORDeleteValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryOREnumKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryOREnumValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORGetValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORGetVersion
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORMergeHives
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryOROpenHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryOROpenKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORRenameKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORSaveHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORSetValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORShutdown
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssysWindowsWdkSystemOfflineregistryORStart
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORCloseHive(handle.rawAddress.toCPointer<ByteVar>())

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORCloseKey(keyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun oRCreateHive(horkey: MutPtr<Orhkey>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORCreateHive(horkey.rawAddress.toCPointer<ByteVar>())

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr<Orhkey>, pdwdisposition: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORCreateKey(keyhandle.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), pdwdisposition.rawAddress.toCPointer<ByteVar>())

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORDeleteKey(handle.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORDeleteValue(handle.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>())

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr<UInt>, lpclass: Pwstr, lpcclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryOREnumKey(handle.rawAddress.toCPointer<ByteVar>(), dwindex, lpname.rawAddress.toCPointer<ByteVar>(), lpcname.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcclass.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryOREnumValue(handle.rawAddress.toCPointer<ByteVar>(), dwindex, lpvaluename.rawAddress.toCPointer<ByteVar>(), lpcvaluename.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(handle.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORGetValue(handle.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvalue.rawAddress.toCPointer<ByteVar>(), pdwtype.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), pcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun oRGetVersion(pdwmajorversion: MutPtr<UInt>, pdwminorversion: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORGetVersion(pdwmajorversion.rawAddress.toCPointer<ByteVar>(), pdwminorversion.rawAddress.toCPointer<ByteVar>())

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr<UInt>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(handle.rawAddress.toCPointer<ByteVar>(), pdwflags.rawAddress.toCPointer<ByteVar>())

public actual fun oRMergeHives(hivehandles: ConstPtr<Orhkey>, hivecount: UInt, phkresult: MutPtr<Orhkey>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORMergeHives(hivehandles.rawAddress.toCPointer<ByteVar>(), hivecount, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun oROpenHive(filepath: Pcwstr, horkey: MutPtr<Orhkey>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryOROpenHive(filepath.rawAddress.toCPointer<ByteVar>(), horkey.rawAddress.toCPointer<ByteVar>())

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr<Orhkey>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(filehandle.rawAddress.toCPointer<ByteVar>(), horkey.rawAddress.toCPointer<ByteVar>())

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr<Orhkey>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryOROpenKey(handle.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcmaxsubkeylen: MutPtr<UInt>, lpcmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcmaxvaluenamelen: MutPtr<UInt>, lpcmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(handle.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcclass.rawAddress.toCPointer<ByteVar>(), lpcsubkeys.rawAddress.toCPointer<ByteVar>(), lpcmaxsubkeylen.rawAddress.toCPointer<ByteVar>(), lpcmaxclasslen.rawAddress.toCPointer<ByteVar>(), lpcvalues.rawAddress.toCPointer<ByteVar>(), lpcmaxvaluenamelen.rawAddress.toCPointer<ByteVar>(), lpcmaxvaluelen.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORRenameKey(handle.rawAddress.toCPointer<ByteVar>(), lpnewname.rawAddress.toCPointer<ByteVar>())

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORSaveHive(horkey.rawAddress.toCPointer<ByteVar>(), hivepath.rawAddress.toCPointer<ByteVar>(), osmajorversion, osminorversion)

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(handle.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORSetValue(handle.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(handle.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun oRShutdown(): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORShutdown()

public actual fun oRStart(): Win32Error =
    windowssysWindowsWdkSystemOfflineregistryORStart()
