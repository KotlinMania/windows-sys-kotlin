#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(void* hsessionhandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(void* hclienthandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(void* hsessionhandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(uint32_t dwclientversion, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(void* hclienthandle, void* plegacymacaddress, void* phsessionhandle, void* pguidsessioninterface);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(void* hclienthandle, void* pdeviceaddress, void* pvcontext, void* pfncallback, void* phsessionhandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(void* pdeviceaddress);
void* windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(uint32_t dwmemorysize);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(void* hclienthandle, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanConnect(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(void* hclienthandle, void* pinterfaceguid, void* pdeviceserviceguid, uint32_t dwopcode, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(void* hclienthandle, void* pinterfaceguid, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(void* hclienthandle, void* preserved, void* ppinterfacelist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(void* hclienthandle, uint32_t dwiedatasize, void* prawiedata, void* strformat, void* preserved, void* pppsdiedatalist);
void windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(void* pmemory);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* preserved, void* ppnetworklist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppcapability);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, int32_t dot11bsstype, int32_t bsecurityenabled, void* preserved, void* ppwlanbsslist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pstrprofilexml, void* pdwflags, void* pdwgrantedaccess);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pdwdatasize, void* ppdata);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppprofilelist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(void* hclienthandle, int32_t securableobject, void* pvaluetype, void* pstrcurrentsddl, void* pdwgrantedaccess);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(void* hclienthandle, void* pinterfaceguid, void* ppdevsvcguidlist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(void* hclienthandle, int32_t opcode, void* pdwdatasize, void* ppvdata, void* pwlanopcodevaluetype, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(void* hclienthandle, void* pdwkeylength, void* ppuckeydata, void* pbispassphrase, void* pbpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(void* hclienthandle, void* ppwlanhostednetworkstatus, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pvdata, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(void* hclienthandle, uint32_t dwkeylength, void* puckeydata, int32_t bispassphrase, int32_t bpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(void* hclienthandle, void* pinterfaceguid, int32_t type, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(uint32_t dwclientversion, void* preserved, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(void* hclienthandle, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(uint32_t dwreasoncode, uint32_t dwbuffersize, void* pstringbuffer, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(void* hclienthandle, void* pdevsvcguidlist);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(void* hclienthandle, uint32_t dwnotifsource, int32_t bignoreduplicate, void* funccallback, void* pcallbackcontext, void* preserved, void* pdwprevnotifsource);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(void* hclienthandle, int32_t bregister, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(void* hclienthandle, void* pinterfaceguid, void* stroldprofilename, void* strnewprofilename, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* stralluserprofilesecurity, uint32_t dwflags, int32_t boverwrite, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanScan(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, void* piedata, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* pnetworklist, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* strprofilexml, void* stralluserprofilesecurity, int32_t boverwrite, void* preserved, void* pdwreasoncode);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwflags, void* streapxmluserdata, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(void* hclienthandle, void* pinterfaceguid, uint32_t dwitems, void* strprofilenames, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwposition, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(void* hclienthandle, void* strformat, void* ppsdiedatalist, void* preserved);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(void* hclienthandle, int32_t securableobject, void* strmodifiedsddl);
uint32_t windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(uint32_t dwclientversion, void* wstrprofilename, void* pinterfaceguid, void* hwnd, int32_t wlstartpage, void* preserved, void* pwlanreasoncode);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H */
