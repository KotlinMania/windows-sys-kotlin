package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

public expect fun wFDCancelOpenSession(hsessionhandle: Handle): UInt

public expect fun wFDCloseHandle(hclienthandle: Handle): UInt

public expect fun wFDCloseSession(hsessionhandle: Handle): UInt

public expect fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt

public expect fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr<ConstPtr<UByte>>, phsessionhandle: MutPtr<Handle>, pguidsessioninterface: MutPtr<Guid>): UInt

public expect fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr<ConstPtr<UByte>>, pvcontext: ConstPtr<CVoid>, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr<Handle>): UInt

public expect fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr<ConstPtr<UByte>>): UInt

public expect fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr<CVoid>

public expect fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParameters>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParametersV2>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdeviceserviceguid: ConstPtr<Guid>, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt

public expect fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr<CVoid>, ppinterfacelist: MutPtr<MutPtr<WlanInterfaceInfoList>>): UInt

public expect fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr<UByte>, strformat: Pcwstr, preserved: ConstPtr<CVoid>, pppsdiedatalist: MutPtr<MutPtr<WlanRawDataList>>): UInt

public expect fun wlanFreeMemory(pmemory: ConstPtr<CVoid>)

public expect fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkList>>): UInt

public expect fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkListV2>>): UInt

public expect fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr<CVoid>, ppnetworklist: MutPtr<MutPtr<Dot11NetworkList>>): UInt

public expect fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppcapability: MutPtr<MutPtr<WlanInterfaceCapability>>): UInt

public expect fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr<CVoid>, ppwlanbsslist: MutPtr<MutPtr<WlanBssList>>): UInt

public expect fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pstrprofilexml: MutPtr<Pwstr>, pdwflags: MutPtr<UInt>, pdwgrantedaccess: MutPtr<UInt>): UInt

public expect fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt

public expect fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WlanProfileInfoList>>): UInt

public expect fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr<WlanOpcodeValueType>, pstrcurrentsddl: MutPtr<Pwstr>, pdwgrantedaccess: MutPtr<UInt>): UInt

public expect fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, ppdevsvcguidlist: MutPtr<MutPtr<WlanDeviceServiceGuidList>>): UInt

public expect fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr<UInt>, ppvdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr<UInt>, ppuckeydata: MutPtr<MutPtr<UByte>>, pbispassphrase: MutPtr<Bool>, pbpersistent: MutPtr<Bool>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr<MutPtr<WlanHostedNetworkStatus>>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr<CVoid>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr<UByte>, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt

public expect fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt

public expect fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr<CVoid>, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt

public expect fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt

public expect fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt

public expect fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr<WlanDeviceServiceGuidList>): UInt

public expect fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>, pdwprevnotifsource: MutPtr<UInt>): UInt

public expect fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, piedata: ConstPtr<WlanRawData>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr<Dot11NetworkList>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr<CVoid>, pdwreasoncode: MutPtr<UInt>): UInt

public expect fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwitems: UInt, strprofilenames: ConstPtr<Pcwstr>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr<WlanRawDataList>, preserved: ConstPtr<CVoid>): UInt

public expect fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt

public expect fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr<Guid>, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr<CVoid>, pwlanreasoncode: MutPtr<UInt>): UInt
