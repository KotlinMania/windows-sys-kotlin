#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeaders(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpAddRequestHeadersEx(void* hrequest, uint32_t dwmodifiers, uint64_t ullflags, uint64_t ullextra, uint32_t cheaders, void* pheaders);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpCheckPlatform(void);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpCloseHandle(void* hinternet);
void* windowssys_windows_win32_networking_winhttp_WinHttpConnect(void* hsession, void* pswzservername, uint16_t nserverport, uint32_t dwreserved);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpCrackUrl(void* pwszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpCreateProxyResolver(void* hsession, void* phresolver);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpCreateUrl(void* lpurlcomponents, uint32_t dwflags, void* pwszurl, void* pdwurllength);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpDetectAutoProxyConfigUrl(uint32_t dwautodetectflags, void* ppwstrautoconfigurl);
void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResult(void* pproxyresult);
void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxyResultEx(void* pproxyresultex);
void windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettings(void* pwinhttpproxysettings);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpFreeProxySettingsEx(int32_t proxysettingstype, void* pproxysettingsex);
void windowssys_windows_win32_networking_winhttp_WinHttpFreeQueryConnectionGroupResult(void* presult);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetIEProxyConfigForCurrentUser(void* pproxyconfig);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrl(void* hsession, void* lpcwszurl, void* pautoproxyoptions, void* pproxyinfo);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyForUrlEx2(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint32_t cbinterfaceselectioncontext, void* pinterfaceselectioncontext, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResult(void* hresolver, void* pproxyresult);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxyResultEx(void* hresolver, void* pproxyresultex);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsEx(void* hresolver, int32_t proxysettingstype, void* pproxysettingsparam, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsResultEx(void* hresolver, void* pproxysettingsex);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpGetProxySettingsVersion(void* hsession, void* pdwproxysettingsversion);
void* windowssys_windows_win32_networking_winhttp_WinHttpOpen(void* pszagentw, uint32_t dwaccesstype, void* pszproxyw, void* pszproxybypassw, uint32_t dwflags);
void* windowssys_windows_win32_networking_winhttp_WinHttpOpenRequest(void* hconnect, void* pwszverb, void* pwszobjectname, void* pwszversion, void* pwszreferrer, void* ppwszaccepttypes, uint32_t dwflags);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryAuthSchemes(void* hrequest, void* lpdwsupportedschemes, void* lpdwfirstscheme, void* pdwauthtarget);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryConnectionGroup(void* hinternet, void* pguidconnection, uint64_t ullflags, void* ppresult);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryDataAvailable(void* hrequest, void* lpdwnumberofbytesavailable);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryHeaders(void* hrequest, uint32_t dwinfolevel, void* pwszname, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryHeadersEx(void* hrequest, uint32_t dwinfolevel, uint64_t ullflags, uint32_t uicodepage, void* pdwindex, void* pheadername, void* pbuffer, void* pdwbufferlength, void* ppheaders, void* pdwheaderscount);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpQueryOption(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpReadData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpReadDataEx(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread, uint64_t ullflags, uint32_t cbproperty, void* pvproperty);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpReadProxySettings(void* hsession, void* pcwszconnectionname, int32_t ffallbacktodefaultsettings, int32_t fsetautodiscoverfordefaultsettings, void* pdwsettingsversion, void* pfdefaultsettingsarereturned, void* pwinhttpproxysettings);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpReceiveResponse(void* hrequest, void* lpreserved);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpRegisterProxyChangeNotification(uint64_t ullflags, void* pfncallback, void* pvcontext, void* hregistration);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpResetAutoProxy(void* hsession, uint32_t dwflags);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpSendRequest(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength, uint32_t dwtotallength, uint64_t dwcontext);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetCredentials(void* hrequest, uint32_t authtargets, uint32_t authscheme, void* pwszusername, void* pwszpassword, void* pauthparams);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetOption(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpSetProxySettingsPerUser(int32_t fproxysettingsperuser);
void* windowssys_windows_win32_networking_winhttp_WinHttpSetStatusCallback(void* hinternet, void* lpfninternetcallback, uint32_t dwnotificationflags, uint64_t dwreserved);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpSetTimeouts(void* hinternet, int32_t nresolvetimeout, int32_t nconnecttimeout, int32_t nsendtimeout, int32_t nreceivetimeout);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpTimeFromSystemTime(void* pst, void* pwsztime);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpTimeToSystemTime(void* pwsztime, void* pst);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpUnregisterProxyChangeNotification(void* hregistration);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketClose(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
void* windowssys_windows_win32_networking_winhttp_WinHttpWebSocketCompleteUpgrade(void* hrequest, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketQueryCloseStatus(void* hwebsocket, void* pusstatus, void* pvreason, uint32_t dwreasonlength, void* pdwreasonlengthconsumed);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketReceive(void* hwebsocket, void* pvbuffer, uint32_t dwbufferlength, void* pdwbytesread, void* pebuffertype);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketSend(void* hwebsocket, int32_t ebuffertype, void* pvbuffer, uint32_t dwbufferlength);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWebSocketShutdown(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
int32_t windowssys_windows_win32_networking_winhttp_WinHttpWriteData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestowrite, void* lpdwnumberofbyteswritten);
uint32_t windowssys_windows_win32_networking_winhttp_WinHttpWriteProxySettings(void* hsession, int32_t fforceupdate, void* pwinhttpproxysettings);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H */
