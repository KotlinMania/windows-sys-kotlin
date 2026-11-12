#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, uint32_t dwmodifiers);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(void* hrequest, uint32_t dwmodifiers, uint64_t ullflags, uint64_t ullextra, uint32_t cheaders, void* pheaders);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform(void);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(void* hinternet);
void* windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(void* hsession, void* pswzservername, uint16_t nserverport, uint32_t dwreserved);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(void* pwszurl, uint32_t dwurllength, uint32_t dwflags, void* lpurlcomponents);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(void* hsession, void* phresolver);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(void* lpurlcomponents, uint32_t dwflags, void* pwszurl, void* pdwurllength);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(uint32_t dwautodetectflags, void* ppwstrautoconfigurl);
void windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(void* pproxyresult);
void windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(void* pproxyresultex);
void windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(void* pwinhttpproxysettings);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(int32_t proxysettingstype, void* pproxysettingsex);
void windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(void* presult);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(void* pproxyconfig);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(void* hsession, void* lpcwszurl, void* pautoproxyoptions, void* pproxyinfo);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint64_t pcontext);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(void* hresolver, void* pcwszurl, void* pautoproxyoptions, uint32_t cbinterfaceselectioncontext, void* pinterfaceselectioncontext, uint64_t pcontext);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(void* hresolver, void* pproxyresult);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(void* hresolver, void* pproxyresultex);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(void* hresolver, int32_t proxysettingstype, void* pproxysettingsparam, uint64_t pcontext);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(void* hresolver, void* pproxysettingsex);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(void* hsession, void* pdwproxysettingsversion);
void* windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(void* pszagentw, uint32_t dwaccesstype, void* pszproxyw, void* pszproxybypassw, uint32_t dwflags);
void* windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(void* hconnect, void* pwszverb, void* pwszobjectname, void* pwszversion, void* pwszreferrer, void* ppwszaccepttypes, uint32_t dwflags);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(void* hrequest, void* lpdwsupportedschemes, void* lpdwfirstscheme, void* pdwauthtarget);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(void* hinternet, void* pguidconnection, uint64_t ullflags, void* ppresult);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(void* hrequest, void* lpdwnumberofbytesavailable);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(void* hrequest, uint32_t dwinfolevel, void* pwszname, void* lpbuffer, void* lpdwbufferlength, void* lpdwindex);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(void* hrequest, uint32_t dwinfolevel, uint64_t ullflags, uint32_t uicodepage, void* pdwindex, void* pheadername, void* pbuffer, void* pdwbufferlength, void* ppheaders, void* pdwheaderscount);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(void* hinternet, uint32_t dwoption, void* lpbuffer, void* lpdwbufferlength);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestoread, void* lpdwnumberofbytesread, uint64_t ullflags, uint32_t cbproperty, void* pvproperty);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(void* hsession, void* pcwszconnectionname, int32_t ffallbacktodefaultsettings, int32_t fsetautodiscoverfordefaultsettings, void* pdwsettingsversion, void* pfdefaultsettingsarereturned, void* pwinhttpproxysettings);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(void* hrequest, void* lpreserved);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(uint64_t ullflags, void* pfncallback, void* pvcontext, void* hregistration);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(void* hsession, uint32_t dwflags);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(void* hrequest, void* lpszheaders, uint32_t dwheaderslength, void* lpoptional, uint32_t dwoptionallength, uint32_t dwtotallength, uint64_t dwcontext);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(void* hrequest, uint32_t authtargets, uint32_t authscheme, void* pwszusername, void* pwszpassword, void* pauthparams);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(void* pproxyinfo);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(void* hinternet, uint32_t dwoption, void* lpbuffer, uint32_t dwbufferlength);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(int32_t fproxysettingsperuser);
void* windowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback(void* hinternet, void* lpfninternetcallback, uint32_t dwnotificationflags, uint64_t dwreserved);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(void* hinternet, int32_t nresolvetimeout, int32_t nconnecttimeout, int32_t nsendtimeout, int32_t nreceivetimeout);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(void* pst, void* pwsztime);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(void* pwsztime, void* pst);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(void* hregistration);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
void* windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(void* hrequest, uint64_t pcontext);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(void* hwebsocket, void* pusstatus, void* pvreason, uint32_t dwreasonlength, void* pdwreasonlengthconsumed);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(void* hwebsocket, void* pvbuffer, uint32_t dwbufferlength, void* pdwbytesread, void* pebuffertype);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(void* hwebsocket, int32_t ebuffertype, void* pvbuffer, uint32_t dwbufferlength);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(void* hwebsocket, uint16_t usstatus, void* pvreason, uint32_t dwreasonlength);
int32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(void* hrequest, void* lpbuffer, uint32_t dwnumberofbytestowrite, void* lpdwnumberofbyteswritten);
uint32_t windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(void* hsession, int32_t fforceupdate, void* pwinhttpproxysettings);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_WINHTTP_WINDOWS_WIN32_NETWORKING_WINHTTP_WRAPPER_H */
