package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

public expect fun wFDCancelOpenSession(hsessionhandle: Handle): UInt

public expect fun wFDCloseHandle(hclienthandle: Handle): UInt

public expect fun wFDCloseSession(hsessionhandle: Handle): UInt

public expect fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt

public expect fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: COpaquePointer?, phsessionhandle: COpaquePointer?, pguidsessioninterface: COpaquePointer?): UInt

public expect fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: COpaquePointer?, pvcontext: COpaquePointer?, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: COpaquePointer?): UInt

public expect fun wFDUpdateDeviceVisibility(pdeviceaddress: COpaquePointer?): UInt

public expect fun wlanAllocateMemory(dwmemorysize: UInt): COpaquePointer?

public expect fun wlanCloseHandle(hclienthandle: Handle, preserved: COpaquePointer?): UInt

public expect fun wlanConnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pconnectionparameters: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?): UInt

public expect fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdeviceserviceguid: COpaquePointer?, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt

public expect fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanEnumInterfaces(hclienthandle: Handle, preserved: COpaquePointer?, ppinterfacelist: COpaquePointer?): UInt

public expect fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: COpaquePointer?, strformat: Pcwstr, preserved: COpaquePointer?, pppsdiedatalist: COpaquePointer?): UInt

public expect fun wlanFreeMemory(pmemory: COpaquePointer?)

public expect fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt

public expect fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, preserved: COpaquePointer?, ppavailablenetworklist: COpaquePointer?): UInt

public expect fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: COpaquePointer?, ppnetworklist: COpaquePointer?): UInt

public expect fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppcapability: COpaquePointer?): UInt

public expect fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: COpaquePointer?, ppwlanbsslist: COpaquePointer?): UInt

public expect fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pstrprofilexml: COpaquePointer?, pdwflags: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt

public expect fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?): UInt

public expect fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, preserved: COpaquePointer?, ppprofilelist: COpaquePointer?): UInt

public expect fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: COpaquePointer?, pstrcurrentsddl: COpaquePointer?, pdwgrantedaccess: COpaquePointer?): UInt

public expect fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, ppdevsvcguidlist: COpaquePointer?): UInt

public expect fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: COpaquePointer?, ppvdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: COpaquePointer?, ppuckeydata: COpaquePointer?, pbispassphrase: COpaquePointer?, pbpersistent: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: COpaquePointer?, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: COpaquePointer?, bispassphrase: Bool, bpersistent: Bool, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: COpaquePointer?, pvreserved: COpaquePointer?): UInt

public expect fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: COpaquePointer?, dwoutbuffersize: UInt, poutbuffer: COpaquePointer?, pdwbytesreturned: COpaquePointer?): UInt

public expect fun wlanOpenHandle(dwclientversion: UInt, preserved: COpaquePointer?, pdwnegotiatedversion: COpaquePointer?, phclienthandle: COpaquePointer?): UInt

public expect fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt

public expect fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, preserved: COpaquePointer?, pdwdatasize: COpaquePointer?, ppdata: COpaquePointer?, pwlanopcodevaluetype: COpaquePointer?): UInt

public expect fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: COpaquePointer?): UInt

public expect fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: COpaquePointer?): UInt

public expect fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: COpaquePointer?, preserved: COpaquePointer?, pdwprevnotifsource: COpaquePointer?): UInt

public expect fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: COpaquePointer?): UInt

public expect fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: COpaquePointer?): UInt

public expect fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: COpaquePointer?): UInt

public expect fun wlanScan(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, pdot11ssid: COpaquePointer?, piedata: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: COpaquePointer?, pdwreasoncode: COpaquePointer?): UInt

public expect fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwdatasize: UInt, pdata: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: COpaquePointer?): UInt

public expect fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, dwitems: UInt, strprofilenames: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: COpaquePointer?, strprofilename: Pcwstr, dwposition: UInt, preserved: COpaquePointer?): UInt

public expect fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: COpaquePointer?, preserved: COpaquePointer?): UInt

public expect fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt

public expect fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: COpaquePointer?, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: COpaquePointer?, pwlanreasoncode: COpaquePointer?): UInt
