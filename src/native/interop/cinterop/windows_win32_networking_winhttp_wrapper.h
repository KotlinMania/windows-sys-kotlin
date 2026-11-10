#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeaders(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpAddRequestHeadersEx(void* hrequest, uint32_t dwmodifiers, uint64_t ullflags, uint64_t ullextra, uint32_t cheaders, void* pheaders);
int32_t windowssys_windows_win32_networking_winhttp_winHttpCheckPlatform(void);
int32_t windowssys_windows_win32_networking_winhttp_winHttpCloseHandle(void* hinternet);
void* windowssys_windows_win32_networking_winhttp_winHttpConnect(void* hsession, void* pswzservername, uint16_t nserverport, uint32_t dwreserved);
int32_t windowssys_windows_win32_networking_winhttp_winHttpCrackUrl(void* pwszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpCreateProxyResolver(void* hsession, void* phresolver);
int32_t windowssys_windows_win32_networking_winhttp_winHttpCreateUrl(void* lpurlcomponents, uint32_t dwflags, void* pwszurl, void* pdwurllength);
int32_t windowssys_windows_win32_networking_winhttp_winHttpDetectAutoProxyConfigUrl(uint32_t dwautodetectflags, void* ppwstrautoconfigurl);
void windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResult(void* pproxyresult);
void windowssys_windows_win32_networking_winhttp_winHttpFreeProxyResultEx(void* pproxyresultex);
void windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettings(void* pwinhttpproxysettings);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpFreeProxySettingsEx(int32_t proxysettingstype, void* pproxysettingsex);
void windowssys_windows_win32_networking_winhttp_winHttpFreeQueryConnectionGroupResult(void* presult);
int32_t windowssys_windows_win32_networking_winhttp_winHttpGetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssys_windows_win32_networking_winhttp_winHttpGetIEProxyConfigForCurrentUser(void* pproxyconfig);
int32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrl(void* hsession, void* lpcwszurl, void* pautoproxyoptions, void* pproxyinfo);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxyForUrlEx2(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint32_t cbinterfaceselectioncontext, void* pinterfaceselectioncontext, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxyResult(void* hresolver, void* pproxyresult);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxyResultEx(void* hresolver, void* pproxyresultex);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsEx(void* hresolver, int32_t proxysettingstype, void* pproxysettingsparam, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsResultEx(void* hresolver, void* pproxysettingsex);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpGetProxySettingsVersion(void* hsession, void* pdwproxysettingsversion);
void* windowssys_windows_win32_networking_winhttp_winHttpOpen(void* pszagentw, uint32_t dwaccesstype, void* pszproxyw, void* pszproxybypassw, uint32_t dwflags);
void* windowssys_windows_win32_networking_winhttp_winHttpOpenRequest(void* hconnect, void* pwszverb, void* pwszobjectname, void* pwszversion, void* pwszreferrer, void* ppwszaccepttypes, uint32_t dwflags);
int32_t windowssys_windows_win32_networking_winhttp_winHttpQueryAuthSchemes(void* hrequest, void* lpdwsupportedschemes, void* lpdwfirstscheme, void* pdwauthtarget);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpQueryConnectionGroup(void* hinternet, void* pguidconnection, uint64_t ullflags, void* ppresult);
int32_t windowssys_windows_win32_networking_winhttp_winHttpQueryDataAvailable(void* hrequest, void* lpdwnumberofbytesavailable);
int32_t windowssys_windows_win32_networking_winhttp_winHttpQueryHeaders(void* hrequest, uint32_t dwinfolevel, void* pwszname, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpQueryHeadersEx(void* hrequest, uint32_t dwinfolevel, uint64_t ullflags, uint32_t uicodepage, void* pdwindex, void* pheadername, void* pbuffer, void* pdwbufferlength, void* ppheaders, void* pdwheaderscount);
int32_t windowssys_windows_win32_networking_winhttp_winHttpQueryOption(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength);
int32_t windowssys_windows_win32_networking_winhttp_winHttpReadData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpReadDataEx(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread, uint64_t ullflags, uint32_t cbproperty, void* pvproperty);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpReadProxySettings(void* hsession, void* pcwszconnectionname, int32_t ffallbacktodefaultsettings, int32_t fsetautodiscoverfordefaultsettings, void* pdwsettingsversion, void* pfdefaultsettingsarereturned, void* pwinhttpproxysettings);
int32_t windowssys_windows_win32_networking_winhttp_winHttpReceiveResponse(void* hrequest, void* lpreserved);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpRegisterProxyChangeNotification(uint64_t ullflags, void* pfncallback, void* pvcontext, void* hregistration);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpResetAutoProxy(void* hsession, uint32_t dwflags);
int32_t windowssys_windows_win32_networking_winhttp_winHttpSendRequest(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength, uint32_t dwtotallength, uint64_t dwcontext);
int32_t windowssys_windows_win32_networking_winhttp_winHttpSetCredentials(void* hrequest, uint32_t authtargets, uint32_t authscheme, void* pwszusername, void* pwszpassword, void* pauthparams);
int32_t windowssys_windows_win32_networking_winhttp_winHttpSetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssys_windows_win32_networking_winhttp_winHttpSetOption(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpSetProxySettingsPerUser(int32_t fproxysettingsperuser);
void* windowssys_windows_win32_networking_winhttp_winHttpSetStatusCallback(void* hinternet, void* lpfninternetcallback, uint32_t dwnotificationflags, uint64_t dwreserved);
int32_t windowssys_windows_win32_networking_winhttp_winHttpSetTimeouts(void* hinternet, int32_t nresolvetimeout, int32_t nconnecttimeout, int32_t nsendtimeout, int32_t nreceivetimeout);
int32_t windowssys_windows_win32_networking_winhttp_winHttpTimeFromSystemTime(void* pst, void* pwsztime);
int32_t windowssys_windows_win32_networking_winhttp_winHttpTimeToSystemTime(void* pwsztime, void* pst);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpUnregisterProxyChangeNotification(void* hregistration);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWebSocketClose(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
void* windowssys_windows_win32_networking_winhttp_winHttpWebSocketCompleteUpgrade(void* hrequest, uint64_t pcontext);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWebSocketQueryCloseStatus(void* hwebsocket, void* pusstatus, void* pvreason, uint32_t dwreasonlength, void* pdwreasonlengthconsumed);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWebSocketReceive(void* hwebsocket, void* pvbuffer, uint32_t dwbufferlength, void* pdwbytesread, void* pebuffertype);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWebSocketSend(void* hwebsocket, int32_t ebuffertype, void* pvbuffer, uint32_t dwbufferlength);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWebSocketShutdown(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
int32_t windowssys_windows_win32_networking_winhttp_winHttpWriteData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestowrite, void* lpdwnumberofbyteswritten);
uint32_t windowssys_windows_win32_networking_winhttp_winHttpWriteProxySettings(void* hsession, int32_t fforceupdate, void* pwinhttpproxysettings);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H */
