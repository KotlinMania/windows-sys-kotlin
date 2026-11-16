#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(void* lpnetresource, void* lppassword, void* lpusername);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(void* hwndowner, void* lpnetresource, void* lpauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(void* lpname, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(void* lpname, int32_t fforce, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(void* henum);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(void* lpremotename, void* lpformattedname, void* lpnlength, uint32_t dwflags, uint32_t dwavecharperline);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(uint32_t ndex);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(void* lplocalname, void* lpremotename, void* lpnbufferlen);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(void* lplocalname, uint32_t dwlevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(void* lpremotename, void* lpnetconnectinfo);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(void* lpremotepath, void* lpreaduseoptions, uint32_t cbreaduseoptions, void* lpwriteuseoptions, void* lpsizewriteuseoptions);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(void* lpnetresource, void* lpbuffer, void* lpbuffersize, void* lplpsystem);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(void* lpnetresource, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPGetUser(void* lpname, void* lpusername, void* lpnbufferlen);
uint32_t windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(void* lpname, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(void* lpname, int32_t fforce);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(void* henum);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(void* lpconndlgstruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(void* lpconndlgstruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(void* lpconndlgstruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(void* lpconndlgstruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
void windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(uint32_t err, void* lperror, void* lpproviders);
void windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(uint32_t err, void* lperror, void* lpproviders);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H */
