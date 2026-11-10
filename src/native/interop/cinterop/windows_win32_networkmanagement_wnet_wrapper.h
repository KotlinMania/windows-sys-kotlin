#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceA(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_multinetGetConnectionPerformanceW(void* lpnetresource, void* lpnetconnectinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPAddConnection(void* lpnetresource, void* lppassword, void* lpusername);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPAddConnection3(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPAddConnection4(void* hwndowner, void* lpnetresource, void* lpauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPCancelConnection2(void* lpname, int32_t fforce, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPCloseEnum(void* henum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPEnumResource(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPFormatNetworkName(void* lpremotename, void* lpformattedname, void* lpnlength, uint32_t dwflags, uint32_t dwavecharperline);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetCaps(uint32_t ndex);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetConnection(void* lplocalname, void* lpremotename, void* lpnbufferlen);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetConnection3(void* lplocalname, uint32_t dwlevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetConnectionPerformance(void* lpremotename, void* lpnetconnectinfo);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetPersistentUseOptionsForConnection(void* lpremotepath, void* lpreaduseoptions, uint32_t cbreaduseoptions, void* lpwriteuseoptions, void* lpsizewriteuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetResourceInformation(void* lpnetresource, void* lpbuffer, void* lpbuffersize, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetResourceParent(void* lpnetresource, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetUniversalName(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPGetUser(void* lpname, void* lpusername, void* lpnbufferlen);
uint32_t windowssys_windows_win32_networkmanagement_wnet_nPOpenEnum(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2A(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection2W(void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3A(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection3W(void* hwndowner, void* lpnetresource, void* lppassword, void* lpusername, uint32_t dwflags);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionA(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetAddConnectionW(void* lpremotename, void* lppassword, void* lplocalname);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2A(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnection2W(void* lpname, uint32_t dwflags, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionA(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetCancelConnectionW(void* lpname, int32_t fforce);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetCloseEnum(void* henum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1A(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetConnectionDialog1W(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog(void* hwnd, uint32_t dwtype);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1A(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetDisconnectDialog1W(void* lpconndlgstruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceA(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetEnumResourceW(void* henum, void* lpccount, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionA(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetConnectionW(void* lplocalname, void* lpremotename, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorA(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetLastErrorW(void* lperror, void* lperrorbuf, uint32_t nerrorbufsize, void* lpnamebuf, uint32_t nnamebufsize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationA(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetNetworkInformationW(void* lpprovider, void* lpnetinfostruct);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameA(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetProviderNameW(uint32_t dwnettype, void* lpprovidername, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceInformationW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer, void* lplpsystem);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentA(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetResourceParentW(void* lpnetresource, void* lpbuffer, void* lpcbbuffer);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameA(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetUniversalNameW(void* lplocalpath, uint32_t dwinfolevel, void* lpbuffer, void* lpbuffersize);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetUserA(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetGetUserW(void* lpname, void* lpusername, void* lpnlength);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumA(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetOpenEnumW(uint32_t dwscope, uint32_t dwtype, uint32_t dwusage, void* lpnetresource, void* lphenum);
void windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorA(uint32_t err, void* lperror, void* lpproviders);
void windowssys_windows_win32_networkmanagement_wnet_wNetSetLastErrorW(uint32_t err, void* lperror, void* lpproviders);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4A(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetUseConnection4W(void* hwndowner, void* lpnetresource, void* pauthbuffer, uint32_t cbauthbuffer, uint32_t dwflags, void* lpuseoptions, uint32_t cbuseoptions, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionA(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);
uint32_t windowssys_windows_win32_networkmanagement_wnet_wNetUseConnectionW(void* hwndowner, void* lpnetresource, void* lppassword, void* lpuserid, uint32_t dwflags, void* lpaccessname, void* lpbuffersize, void* lpresult);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WINDOWS_WIN32_NETWORKMANAGEMENT_WNET_WRAPPER_H */
