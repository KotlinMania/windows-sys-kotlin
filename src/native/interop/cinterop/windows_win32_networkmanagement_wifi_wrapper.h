#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDCancelOpenSession(void* hsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDCloseHandle(void* hclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDCloseSession(void* hsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDOpenHandle(uint32_t dwclientversion, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDOpenLegacySession(void* hclienthandle, void* plegacymacaddress, void* phsessionhandle, void* pguidsessioninterface);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDStartOpenSession(void* hclienthandle, void* pdeviceaddress, void* pvcontext, void* pfncallback, void* phsessionhandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wFDUpdateDeviceVisibility(void* pdeviceaddress);
void* windowssys_windows_win32_networkmanagement_wifi_wlanAllocateMemory(uint32_t dwmemorysize);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanCloseHandle(void* hclienthandle, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanConnect(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanConnect2(void* hclienthandle, void* pinterfaceguid, void* pconnectionparameters, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanDeleteProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanDeviceServiceCommand(void* hclienthandle, void* pinterfaceguid, void* pdeviceserviceguid, uint32_t dwopcode, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanDisconnect(void* hclienthandle, void* pinterfaceguid, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanEnumInterfaces(void* hclienthandle, void* preserved, void* ppinterfacelist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanExtractPsdIEDataList(void* hclienthandle, uint32_t dwiedatasize, void* prawiedata, void* strformat, void* preserved, void* pppsdiedatalist);
void windowssys_windows_win32_networkmanagement_wifi_wlanFreeMemory(void* pmemory);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetAvailableNetworkList2(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* preserved, void* ppavailablenetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* preserved, void* ppnetworklist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetInterfaceCapability(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppcapability);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetNetworkBssList(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, int32_t dot11bsstype, int32_t bsecurityenabled, void* preserved, void* ppwlanbsslist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pstrprofilexml, void* pdwflags, void* pdwgrantedaccess);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* preserved, void* pdwdatasize, void* ppdata);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetProfileList(void* hclienthandle, void* pinterfaceguid, void* preserved, void* ppprofilelist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetSecuritySettings(void* hclienthandle, int32_t securableobject, void* pvaluetype, void* pstrcurrentsddl, void* pdwgrantedaccess);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanGetSupportedDeviceServices(void* hclienthandle, void* pinterfaceguid, void* ppdevsvcguidlist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStart(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkForceStop(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkInitSettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryProperty(void* hclienthandle, int32_t opcode, void* pdwdatasize, void* ppvdata, void* pwlanopcodevaluetype, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQuerySecondaryKey(void* hclienthandle, void* pdwkeylength, void* ppuckeydata, void* pbispassphrase, void* pbpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkQueryStatus(void* hclienthandle, void* ppwlanhostednetworkstatus, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkRefreshSecuritySettings(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetProperty(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pvdata, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkSetSecondaryKey(void* hclienthandle, uint32_t dwkeylength, void* puckeydata, int32_t bispassphrase, int32_t bpersistent, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStartUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanHostedNetworkStopUsing(void* hclienthandle, void* pfailreason, void* pvreserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanIhvControl(void* hclienthandle, void* pinterfaceguid, int32_t type, uint32_t dwinbuffersize, void* pinbuffer, uint32_t dwoutbuffersize, void* poutbuffer, void* pdwbytesreturned);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanOpenHandle(uint32_t dwclientversion, void* preserved, void* pdwnegotiatedversion, void* phclienthandle);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanQueryAutoConfigParameter(void* hclienthandle, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanQueryInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, void* preserved, void* pdwdatasize, void* ppdata, void* pwlanopcodevaluetype);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanReasonCodeToString(uint32_t dwreasoncode, uint32_t dwbuffersize, void* pstringbuffer, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanRegisterDeviceServiceNotification(void* hclienthandle, void* pdevsvcguidlist);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanRegisterNotification(void* hclienthandle, uint32_t dwnotifsource, int32_t bignoreduplicate, void* funccallback, void* pcallbackcontext, void* preserved, void* pdwprevnotifsource);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanRegisterVirtualStationNotification(void* hclienthandle, int32_t bregister, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanRenameProfile(void* hclienthandle, void* pinterfaceguid, void* stroldprofilename, void* strnewprofilename, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSaveTemporaryProfile(void* hclienthandle, void* pinterfaceguid, void* strprofilename, void* stralluserprofilesecurity, uint32_t dwflags, int32_t boverwrite, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanScan(void* hclienthandle, void* pinterfaceguid, void* pdot11ssid, void* piedata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetAutoConfigParameter(void* hclienthandle, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetFilterList(void* hclienthandle, int32_t wlanfilterlisttype, void* pnetworklist, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetInterface(void* hclienthandle, void* pinterfaceguid, int32_t opcode, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetProfile(void* hclienthandle, void* pinterfaceguid, uint32_t dwflags, void* strprofilexml, void* stralluserprofilesecurity, int32_t boverwrite, void* preserved, void* pdwreasoncode);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileCustomUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwdatasize, void* pdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileEapXmlUserData(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwflags, void* streapxmluserdata, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetProfileList(void* hclienthandle, void* pinterfaceguid, uint32_t dwitems, void* strprofilenames, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetProfilePosition(void* hclienthandle, void* pinterfaceguid, void* strprofilename, uint32_t dwposition, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetPsdIEDataList(void* hclienthandle, void* strformat, void* ppsdiedatalist, void* preserved);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanSetSecuritySettings(void* hclienthandle, int32_t securableobject, void* strmodifiedsddl);
uint32_t windowssys_windows_win32_networkmanagement_wifi_wlanUIEditProfile(uint32_t dwclientversion, void* wstrprofilename, void* pinterfaceguid, void* hwnd, int32_t wlstartpage, void* preserved, void* pwlanreasoncode);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WINDOWS_WIN32_NETWORKMANAGEMENT_WIFI_WRAPPER_H */
