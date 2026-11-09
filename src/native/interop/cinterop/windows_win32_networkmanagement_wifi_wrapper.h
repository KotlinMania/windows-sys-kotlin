#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCancelOpenSession(void* hsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCloseHandle(void* hclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDCloseSession(void* hsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDOpenHandle(uint32_t dwclientversion, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDOpenLegacySession(void* hclienthandle, void* plegacymacaddress, void* phsessionhandle, void* pguidsessioninterface);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDStartOpenSession(void* hclienthandle, void* pdeviceaddress, void* pvcontext, void* pfncallback, void* phsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WFDUpdateDeviceVisibility(void* pdeviceaddress);
void* windowssys_windows_win32_networkmanagement_wifi_WlanAllocateMemory(uint32_t dwmemorysize);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanCloseHandle(void* hclienthandle, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanConnect(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanConnect2(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDeleteProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDeviceServiceCommand(void* hclienthandle, void* pinterfaceguid, void* pdeviceserviceguid, uint32_t dwopcode, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanDisconnect(void* hclienthandle, void* pinterfaceguid, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanEnumInterfaces(void* hclienthandle, void* preserved, void* ppinterfacelist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanExtractPsdIEDataList(void* hclienthandle, uint32_t dwiedatasize, void* prawiedata, void* strformat, void* preserved, void* pppsdiedatalist);
void windowssys_windows_win32_networkmanagement_wifi_WlanFreeMemory(void* pmemory);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetAvailableNetworkList2(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* preserved, void* ppnetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetInterfaceCapability(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppcapability);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetNetworkBssList(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, int32_t dot11bsstype, int32_t bsecurityenabled, void* preserved, void* ppwlanbsslist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pstrprofilexml, void* pdwflags, void* pdwgrantedaccess);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pdwdatasize, void* ppdata);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetProfileList(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppprofilelist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetSecuritySettings(void* hclienthandle, int32_t securableobject, void* pvaluetype, void* pstrcurrentsddl, void* pdwgrantedaccess);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanGetSupportedDeviceServices(void* hclienthandle, void* pinterfaceguid, void* ppdevsvcguidlist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStart(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkForceStop(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkInitSettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryProperty(void* hclienthandle, int32_t opcode, void* pdwdatasize, void* ppvdata, void* pwlanopcodevaluetype, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQuerySecondaryKey(void* hclienthandle, void* pdwkeylength, void* ppuckeydata, void* pbispassphrase, void* pbpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkQueryStatus(void* hclienthandle, void* ppwlanhostednetworkstatus, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkRefreshSecuritySettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetProperty(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pvdata, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkSetSecondaryKey(void* hclienthandle, uint32_t dwkeylength, void* puckeydata, int32_t bispassphrase, int32_t bpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStartUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanHostedNetworkStopUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanIhvControl(void* hclienthandle, void* pinterfaceguid, int32_t type, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanOpenHandle(uint32_t dwclientversion, void* preserved, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanQueryAutoConfigParameter(void* hclienthandle, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanQueryInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanReasonCodeToString(uint32_t dwreasoncode, uint32_t dwbuffersize, void* pstringbuffer, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterDeviceServiceNotification(void* hclienthandle, void* pdevsvcguidlist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterNotification(void* hclienthandle, uint32_t dwnotifsource, int32_t bignoreduplicate, void* funccallback, void* pcallbackcontext, void* preserved, void* pdwprevnotifsource);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRegisterVirtualStationNotification(void* hclienthandle, int32_t bregister, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanRenameProfile(void* hclienthandle, void* pinterfaceguid, void* stroldprofilename, void* strnewprofilename, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSaveTemporaryProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* stralluserprofilesecurity, uint32_t dwflags, int32_t boverwrite, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanScan(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, void* piedata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetAutoConfigParameter(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* pnetworklist, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfile(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* strprofilexml, void* stralluserprofilesecurity, int32_t boverwrite, void* preserved, void* pdwreasoncode);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileEapXmlUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwflags, void* streapxmluserdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfileList(void* hclienthandle, void* pinterfaceguid, uint32_t dwitems, void* strprofilenames, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetProfilePosition(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwposition, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetPsdIEDataList(void* hclienthandle, void* strformat, void* ppsdiedatalist, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanSetSecuritySettings(void* hclienthandle, int32_t securableobject, void* strmodifiedsddl);
uint32_t windowssys_windows_win32_networkmanagement_wifi_WlanUIEditProfile(uint32_t dwclientversion, void* wstrprofilename, void* pinterfaceguid, void* hwnd, int32_t wlstartpage, void* preserved, void* pwlanreasoncode);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H */
