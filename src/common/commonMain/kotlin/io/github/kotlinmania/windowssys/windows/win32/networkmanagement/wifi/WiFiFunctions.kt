package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

public expect fun wFDCancelOpenSession(hsessionhandle: Handle): UInt

public expect fun wFDCloseHandle(hclienthandle: Handle): UInt

public expect fun wFDCloseSession(hsessionhandle: Handle): UInt

public expect fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt

public expect fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr, phsessionhandle: MutPtr, pguidsessioninterface: MutPtr): UInt

public expect fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr, pvcontext: ConstPtr, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr): UInt

public expect fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr): UInt

public expect fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr

public expect fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr): UInt

public expect fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr): UInt

public expect fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdeviceserviceguid: ConstPtr, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt

public expect fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr, ppinterfacelist: MutPtr): UInt

public expect fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr, strformat: Pcwstr, preserved: ConstPtr, pppsdiedatalist: MutPtr): UInt

public expect fun wlanFreeMemory(pmemory: ConstPtr)

public expect fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt

public expect fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt

public expect fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr, ppnetworklist: MutPtr): UInt

public expect fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppcapability: MutPtr): UInt

public expect fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr, ppwlanbsslist: MutPtr): UInt

public expect fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pstrprofilexml: MutPtr, pdwflags: MutPtr, pdwgrantedaccess: MutPtr): UInt

public expect fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt

public expect fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppprofilelist: MutPtr): UInt

public expect fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr, pstrcurrentsddl: MutPtr, pdwgrantedaccess: MutPtr): UInt

public expect fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr, ppdevsvcguidlist: MutPtr): UInt

public expect fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr, ppvdata: MutPtr, pwlanopcodevaluetype: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr, ppuckeydata: MutPtr, pbispassphrase: MutPtr, pbpersistent: MutPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt

public expect fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt

public expect fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt

public expect fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt

public expect fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt

public expect fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr): UInt

public expect fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr): UInt

public expect fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr, preserved: ConstPtr, pdwprevnotifsource: MutPtr): UInt

public expect fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr): UInt

public expect fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr): UInt

public expect fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr): UInt

public expect fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, piedata: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr, pdwreasoncode: MutPtr): UInt

public expect fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr): UInt

public expect fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwitems: UInt, strprofilenames: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr): UInt

public expect fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr, preserved: ConstPtr): UInt

public expect fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt

public expect fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr, pwlanreasoncode: MutPtr): UInt
