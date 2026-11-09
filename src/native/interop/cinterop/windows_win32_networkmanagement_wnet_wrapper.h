#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceA(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_MultinetGetConnectionPerformanceW(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection(void* lpnetresource, void* lppassword, void* lpusername);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection3(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPAddConnection4(void* hwndowner, void* lpnetresource, void* lpauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCancelConnection2(void* lpname, int32_t fforce, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPCloseEnum(void* henum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPEnumResource(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPFormatNetworkName(void* lpremotename, void* lpformattedname, void* lpnlength, uint32_t dwflags, uint32_t dwavecharperline);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetCaps(uint32_t ndex);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnection(void* lplocalname, void* lpremotename, void* lpnbufferlen);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnection3(void* lplocalname, uint32_t dwlevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetConnectionPerformance(void* lpremotename, void* lpnetconnectinfo);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetPersistentUseOptionsForConnection(void* lpremotepath, void* lpreaduseoptions, uint32_t cbreaduseoptions, void* lpwriteuseoptions, void* lpsizewriteuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetResourceInformation(void* lpnetresource, void* lpbuffer, void* lpbuffersize, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetResourceParent(void* lpnetresource, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetUniversalName(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPGetUser(void* lpname, void* lpusername, void* lpnbufferlen);
uint32_t windowssys_windows_win32_networkmanagement_wnet_NPOpenEnum(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2A(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection2W(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3A(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection3W(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionA(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetAddConnectionW(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2A(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnection2W(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionA(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCancelConnectionW(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetCloseEnum(void* henum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1A(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetConnectionDialog1W(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1A(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetDisconnectDialog1W(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceA(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetEnumResourceW(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionA(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetConnectionW(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorA(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetLastErrorW(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationA(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetNetworkInformationW(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameA(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetProviderNameW(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceInformationW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetResourceParentW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameA(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUniversalNameW(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUserA(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetGetUserW(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumA(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetOpenEnumW(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
void windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorA(uint32_t err, void* lperror, void* lpproviders);
void windowssys_windows_win32_networkmanagement_wnet_WNetSetLastErrorW(uint32_t err, void* lperror, void* lpproviders);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionA(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_WNetUseConnectionW(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H */
