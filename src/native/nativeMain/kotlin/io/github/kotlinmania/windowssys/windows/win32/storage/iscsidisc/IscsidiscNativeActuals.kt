@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddISNSServerA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddISNSServerW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddRadiusServerA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscAddRadiusServerW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportISNSServerListA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportISNSServerListW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSendScsiInquiry
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.cinterop.windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addISNSServerA(address: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddISNSServerA(address.rawAddress.toCPointer<ByteVar>())

public actual fun addISNSServerW(address: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddISNSServerW(address.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiConnectionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionA(uniquesessionid.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetportal.rawAddress.toCPointer<ByteVar>(), securityflags, loginoptions.rawAddress.toCPointer<ByteVar>(), keysize, key.rawAddress.toCPointer<ByteVar>(), connectionid.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiConnectionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, reserved: MutPtr<CVoid>, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiConnectionW(uniquesessionid.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetportal.rawAddress.toCPointer<ByteVar>(), securityflags, loginoptions.rawAddress.toCPointer<ByteVar>(), keysize, key.rawAddress.toCPointer<ByteVar>(), connectionid.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortala>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalA(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, loginoptions.rawAddress.toCPointer<ByteVar>(), securityflags, portal.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, loginoptions: MutPtr<IscsiLoginOptions>, securityflags: ULong, portal: MutPtr<IscsiTargetPortalw>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiSendTargetPortalW(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, loginoptions.rawAddress.toCPointer<ByteVar>(), securityflags, portal.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiStaticTargetA(targetname: Pcstr, targetalias: Pcstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupa>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetA(targetname.rawAddress.toCPointer<ByteVar>(), targetalias.rawAddress.toCPointer<ByteVar>(), targetflags, persist, mappings.rawAddress.toCPointer<ByteVar>(), loginoptions.rawAddress.toCPointer<ByteVar>(), portalgroup.rawAddress.toCPointer<ByteVar>())

public actual fun addIScsiStaticTargetW(targetname: Pcwstr, targetalias: Pcwstr, targetflags: UInt, persist: Boolean, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, portalgroup: MutPtr<IscsiTargetPortalGroupw>): UInt =
    windowssysWindowsWin32StorageIscsidiscAddIScsiStaticTargetW(targetname.rawAddress.toCPointer<ByteVar>(), targetalias.rawAddress.toCPointer<ByteVar>(), targetflags, persist, mappings.rawAddress.toCPointer<ByteVar>(), loginoptions.rawAddress.toCPointer<ByteVar>(), portalgroup.rawAddress.toCPointer<ByteVar>())

public actual fun addPersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceA(devicepath.rawAddress.toCPointer<ByteVar>())

public actual fun addPersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddPersistentIScsiDeviceW(devicepath.rawAddress.toCPointer<ByteVar>())

public actual fun addRadiusServerA(address: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddRadiusServerA(address.rawAddress.toCPointer<ByteVar>())

public actual fun addRadiusServerW(address: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscAddRadiusServerW(address.rawAddress.toCPointer<ByteVar>())

public actual fun clearPersistentIScsiDevices(): UInt =
    windowssysWindowsWin32StorageIscsidiscClearPersistentIScsiDevices()

public actual fun getDevicesForIScsiSessionA(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessiona>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionA(uniquesessionid.rawAddress.toCPointer<ByteVar>(), devicecount.rawAddress.toCPointer<ByteVar>(), devices.rawAddress.toCPointer<ByteVar>())

public actual fun getDevicesForIScsiSessionW(uniquesessionid: MutPtr<IscsiUniqueSessionId>, devicecount: MutPtr<UInt>, devices: MutPtr<IscsiDeviceOnSessionw>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetDevicesForIScsiSessionW(uniquesessionid.rawAddress.toCPointer<ByteVar>(), devicecount.rawAddress.toCPointer<ByteVar>(), devices.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoA(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, reserved.rawAddress.toCPointer<ByteVar>(), authinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, reserved: MutPtr<UInt>, authinfo: MutPtr<IkeAuthenticationInformation>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiIKEInfoW(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, reserved.rawAddress.toCPointer<ByteVar>(), authinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiInitiatorNodeNameA(initiatornodename: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiInitiatorNodeNameW(initiatornodename: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiSessionListA(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoa>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListA(buffersize.rawAddress.toCPointer<ByteVar>(), sessioncount.rawAddress.toCPointer<ByteVar>(), sessioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiSessionListEx(buffersize: MutPtr<UInt>, sessioncountptr: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfoEx>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListEx(buffersize.rawAddress.toCPointer<ByteVar>(), sessioncountptr.rawAddress.toCPointer<ByteVar>(), sessioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiSessionListW(buffersize: MutPtr<UInt>, sessioncount: MutPtr<UInt>, sessioninfo: MutPtr<IscsiSessionInfow>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiSessionListW(buffersize.rawAddress.toCPointer<ByteVar>(), sessioncount.rawAddress.toCPointer<ByteVar>(), sessioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiTargetInformationA(targetname: Pcstr, discoverymechanism: Pcstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationA(targetname.rawAddress.toCPointer<ByteVar>(), discoverymechanism.rawAddress.toCPointer<ByteVar>(), infoclass, buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiTargetInformationW(targetname: Pcwstr, discoverymechanism: Pcwstr, infoclass: TargetInformationClass, buffersize: MutPtr<UInt>, buffer: MutPtr<CVoid>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiTargetInformationW(targetname.rawAddress.toCPointer<ByteVar>(), discoverymechanism.rawAddress.toCPointer<ByteVar>(), infoclass, buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun getIScsiVersionInformation(versioninfo: MutPtr<IscsiVersionInfo>): UInt =
    windowssysWindowsWin32StorageIscsidiscGetIScsiVersionInformation(versioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun loginIScsiTargetA(targetname: Pcstr, isinformationalsession: Boolean, initiatorinstance: Pcstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortala>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappinga>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetA(targetname.rawAddress.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetportal.rawAddress.toCPointer<ByteVar>(), securityflags, mappings.rawAddress.toCPointer<ByteVar>(), loginoptions.rawAddress.toCPointer<ByteVar>(), keysize, key.rawAddress.toCPointer<ByteVar>(), ispersistent, uniquesessionid.rawAddress.toCPointer<ByteVar>(), uniqueconnectionid.rawAddress.toCPointer<ByteVar>())

public actual fun loginIScsiTargetW(targetname: Pcwstr, isinformationalsession: Boolean, initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetportal: MutPtr<IscsiTargetPortalw>, securityflags: ULong, mappings: MutPtr<IscsiTargetMappingw>, loginoptions: MutPtr<IscsiLoginOptions>, keysize: UInt, key: Pcstr, ispersistent: Boolean, uniquesessionid: MutPtr<IscsiUniqueSessionId>, uniqueconnectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscLoginIScsiTargetW(targetname.rawAddress.toCPointer<ByteVar>(), isinformationalsession, initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetportal.rawAddress.toCPointer<ByteVar>(), securityflags, mappings.rawAddress.toCPointer<ByteVar>(), loginoptions.rawAddress.toCPointer<ByteVar>(), keysize, key.rawAddress.toCPointer<ByteVar>(), ispersistent, uniquesessionid.rawAddress.toCPointer<ByteVar>(), uniqueconnectionid.rawAddress.toCPointer<ByteVar>())

public actual fun logoutIScsiTarget(uniquesessionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscLogoutIScsiTarget(uniquesessionid.rawAddress.toCPointer<ByteVar>())

public actual fun refreshISNSServerA(address: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRefreshISNSServerA(address.rawAddress.toCPointer<ByteVar>())

public actual fun refreshISNSServerW(address: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRefreshISNSServerW(address.rawAddress.toCPointer<ByteVar>())

public actual fun refreshIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalA(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, portal.rawAddress.toCPointer<ByteVar>())

public actual fun refreshIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    windowssysWindowsWin32StorageIscsidiscRefreshIScsiSendTargetPortalW(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, portal.rawAddress.toCPointer<ByteVar>())

public actual fun removeISNSServerA(address: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveISNSServerA(address.rawAddress.toCPointer<ByteVar>())

public actual fun removeISNSServerW(address: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveISNSServerW(address.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiConnection(uniquesessionid: MutPtr<IscsiUniqueSessionId>, connectionid: MutPtr<IscsiUniqueSessionId>): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiConnection(uniquesessionid.rawAddress.toCPointer<ByteVar>(), connectionid.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiPersistentTargetA(initiatorinstance: Pcstr, initiatorportnumber: UInt, targetname: Pcstr, portal: MutPtr<IscsiTargetPortala>): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetA(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetname.rawAddress.toCPointer<ByteVar>(), portal.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiPersistentTargetW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, targetname: Pcwstr, portal: MutPtr<IscsiTargetPortalw>): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiPersistentTargetW(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, targetname.rawAddress.toCPointer<ByteVar>(), portal.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiSendTargetPortalA(initiatorinstance: Pcstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortala>): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalA(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, portal.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiSendTargetPortalW(initiatorinstance: Pcwstr, initiatorportnumber: UInt, portal: MutPtr<IscsiTargetPortalw>): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiSendTargetPortalW(initiatorinstance.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, portal.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiStaticTargetA(targetname: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetA(targetname.rawAddress.toCPointer<ByteVar>())

public actual fun removeIScsiStaticTargetW(targetname: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveIScsiStaticTargetW(targetname.rawAddress.toCPointer<ByteVar>())

public actual fun removePersistentIScsiDeviceA(devicepath: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceA(devicepath.rawAddress.toCPointer<ByteVar>())

public actual fun removePersistentIScsiDeviceW(devicepath: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemovePersistentIScsiDeviceW(devicepath.rawAddress.toCPointer<ByteVar>())

public actual fun removeRadiusServerA(address: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerA(address.rawAddress.toCPointer<ByteVar>())

public actual fun removeRadiusServerW(address: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscRemoveRadiusServerW(address.rawAddress.toCPointer<ByteVar>())

public actual fun reportActiveIScsiTargetMappingsA(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappinga>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsA(buffersize.rawAddress.toCPointer<ByteVar>(), mappingcount.rawAddress.toCPointer<ByteVar>(), mappings.rawAddress.toCPointer<ByteVar>())

public actual fun reportActiveIScsiTargetMappingsW(buffersize: MutPtr<UInt>, mappingcount: MutPtr<UInt>, mappings: MutPtr<IscsiTargetMappingw>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportActiveIScsiTargetMappingsW(buffersize.rawAddress.toCPointer<ByteVar>(), mappingcount.rawAddress.toCPointer<ByteVar>(), mappings.rawAddress.toCPointer<ByteVar>())

public actual fun reportISNSServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportISNSServerListA(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportISNSServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportISNSServerListW(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiInitiatorListA(buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListA(buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiInitiatorListW(buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiInitiatorListW(buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiPersistentLoginsA(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfoa>, buffersizeinbytes: MutPtr<UInt>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsA(count.rawAddress.toCPointer<ByteVar>(), persistentlogininfo.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiPersistentLoginsW(count: MutPtr<UInt>, persistentlogininfo: MutPtr<PersistentIscsiLoginInfow>, buffersizeinbytes: MutPtr<UInt>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiPersistentLoginsW(count.rawAddress.toCPointer<ByteVar>(), persistentlogininfo.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsA(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoa>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsA(portalcount.rawAddress.toCPointer<ByteVar>(), portalinfo.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsExA(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExa>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExA(portalcount.rawAddress.toCPointer<ByteVar>(), portalinfosize.rawAddress.toCPointer<ByteVar>(), portalinfo.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsExW(portalcount: MutPtr<UInt>, portalinfosize: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfoExw>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsExW(portalcount.rawAddress.toCPointer<ByteVar>(), portalinfosize.rawAddress.toCPointer<ByteVar>(), portalinfo.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiSendTargetPortalsW(portalcount: MutPtr<UInt>, portalinfo: MutPtr<IscsiTargetPortalInfow>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiSendTargetPortalsW(portalcount.rawAddress.toCPointer<ByteVar>(), portalinfo.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiTargetPortalsA(initiatorname: Pcstr, targetname: Pcstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortala>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsA(initiatorname.rawAddress.toCPointer<ByteVar>(), targetname.rawAddress.toCPointer<ByteVar>(), targetportaltag.rawAddress.toCPointer<ByteVar>(), elementcount.rawAddress.toCPointer<ByteVar>(), portals.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiTargetPortalsW(initiatorname: Pcwstr, targetname: Pcwstr, targetportaltag: MutPtr<UShort>, elementcount: MutPtr<UInt>, portals: MutPtr<IscsiTargetPortalw>): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiTargetPortalsW(initiatorname.rawAddress.toCPointer<ByteVar>(), targetname.rawAddress.toCPointer<ByteVar>(), targetportaltag.rawAddress.toCPointer<ByteVar>(), elementcount.rawAddress.toCPointer<ByteVar>(), portals.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiTargetsA(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsA(forceupdate, buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportIScsiTargetsW(forceupdate: Boolean, buffersize: MutPtr<UInt>, buffer: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportIScsiTargetsW(forceupdate, buffersize.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportPersistentIScsiDevicesA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesA(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportPersistentIScsiDevicesW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportPersistentIScsiDevicesW(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportRadiusServerListA(buffersizeinchar: MutPtr<UInt>, buffer: Pstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportRadiusServerListA(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun reportRadiusServerListW(buffersizeinchar: MutPtr<UInt>, buffer: Pwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscReportRadiusServerListW(buffersizeinchar.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>())

public actual fun sendScsiInquiry(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, evpdcmddt: UByte, pagecode: UByte, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32StorageIscsidiscSendScsiInquiry(uniquesessionid.rawAddress.toCPointer<ByteVar>(), lun, evpdcmddt, pagecode, scsistatus.rawAddress.toCPointer<ByteVar>(), responsesize.rawAddress.toCPointer<ByteVar>(), responsebuffer.rawAddress.toCPointer<ByteVar>(), sensesize.rawAddress.toCPointer<ByteVar>(), sensebuffer.rawAddress.toCPointer<ByteVar>())

public actual fun sendScsiReadCapacity(uniquesessionid: MutPtr<IscsiUniqueSessionId>, lun: ULong, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32StorageIscsidiscSendScsiReadCapacity(uniquesessionid.rawAddress.toCPointer<ByteVar>(), lun, scsistatus.rawAddress.toCPointer<ByteVar>(), responsesize.rawAddress.toCPointer<ByteVar>(), responsebuffer.rawAddress.toCPointer<ByteVar>(), sensesize.rawAddress.toCPointer<ByteVar>(), sensebuffer.rawAddress.toCPointer<ByteVar>())

public actual fun sendScsiReportLuns(uniquesessionid: MutPtr<IscsiUniqueSessionId>, scsistatus: MutPtr<UByte>, responsesize: MutPtr<UInt>, responsebuffer: MutPtr<UByte>, sensesize: MutPtr<UInt>, sensebuffer: MutPtr<UByte>): UInt =
    windowssysWindowsWin32StorageIscsidiscSendScsiReportLuns(uniquesessionid.rawAddress.toCPointer<ByteVar>(), scsistatus.rawAddress.toCPointer<ByteVar>(), responsesize.rawAddress.toCPointer<ByteVar>(), responsebuffer.rawAddress.toCPointer<ByteVar>(), sensesize.rawAddress.toCPointer<ByteVar>(), sensebuffer.rawAddress.toCPointer<ByteVar>())

public actual fun setIScsiGroupPresharedKey(keylength: UInt, key: MutPtr<UByte>, persist: Boolean): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiGroupPresharedKey(keylength, key.rawAddress.toCPointer<ByteVar>(), persist)

public actual fun setIScsiIKEInfoA(initiatorname: Pcstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoA(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, authinfo.rawAddress.toCPointer<ByteVar>(), persist)

public actual fun setIScsiIKEInfoW(initiatorname: Pcwstr, initiatorportnumber: UInt, authinfo: MutPtr<IkeAuthenticationInformation>, persist: Boolean): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiIKEInfoW(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, authinfo.rawAddress.toCPointer<ByteVar>(), persist)

public actual fun setIScsiInitiatorCHAPSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorCHAPSharedSecret(sharedsecretlength, sharedsecret.rawAddress.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorNodeNameA(initiatornodename: Pcstr): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameA(initiatornodename.rawAddress.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorNodeNameW(initiatornodename: Pcwstr): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorNodeNameW(initiatornodename.rawAddress.toCPointer<ByteVar>())

public actual fun setIScsiInitiatorRADIUSSharedSecret(sharedsecretlength: UInt, sharedsecret: MutPtr<UByte>): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiInitiatorRADIUSSharedSecret(sharedsecretlength, sharedsecret.rawAddress.toCPointer<ByteVar>())

public actual fun setIScsiTunnelModeOuterAddressA(initiatorname: Pcstr, initiatorportnumber: UInt, destinationaddress: Pcstr, outermodeaddress: Pcstr, persist: Boolean): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressA(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress.rawAddress.toCPointer<ByteVar>(), outermodeaddress.rawAddress.toCPointer<ByteVar>(), persist)

public actual fun setIScsiTunnelModeOuterAddressW(initiatorname: Pcwstr, initiatorportnumber: UInt, destinationaddress: Pcwstr, outermodeaddress: Pcwstr, persist: Boolean): UInt =
    windowssysWindowsWin32StorageIscsidiscSetIScsiTunnelModeOuterAddressW(initiatorname.rawAddress.toCPointer<ByteVar>(), initiatorportnumber, destinationaddress.rawAddress.toCPointer<ByteVar>(), outermodeaddress.rawAddress.toCPointer<ByteVar>(), persist)

public actual fun setupPersistentIScsiDevices(): UInt =
    windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiDevices()

public actual fun setupPersistentIScsiVolumes(): UInt =
    windowssysWindowsWin32StorageIscsidiscSetupPersistentIScsiVolumes()
