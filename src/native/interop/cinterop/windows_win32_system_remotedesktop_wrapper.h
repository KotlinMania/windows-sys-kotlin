#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(uint32_t dwprocessid, void* psessionid);
void windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(void* hserver);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(uint32_t logonid, uint32_t targetlogonid, void* ppassword, int32_t bwait);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer, uint32_t flag);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(void* hserver, uint32_t sessionid, int32_t bwait);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(int32_t benable);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(void* hserver, void* preserved, uint32_t reserved, void* plisteners, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(void* hserver, void* plevel, uint32_t sessionid, void* ppprocessinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(void* hserver, uint32_t reserved, uint32_t version, void* ppprocessinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(void* pdomainname, uint32_t reserved, uint32_t version, void* ppserverinfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(void* hserver, void* plevel, uint32_t filter, void* ppsessioninfo, void* pcount);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(void* hserver, uint32_t reserved, uint32_t version, void* ppsessioninfo, void* pcount);
void windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(void* pmemory);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(int32_t wtstypeclass, void* pmemory, uint32_t numberofentries);
uint32_t windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId(void);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(void* psessionid);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(void* pbenabled);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(void* hserver, uint32_t sessionid, int32_t bwait);
void* windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(void* pservername);
void* windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(void* pservername);
void* windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(void* pservername);
void* windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(void* pservername);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, void* pbuffer);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(void* hserver, uint32_t sessionid, int32_t wtsinfoclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* ppbuffer, void* pbytesreturned);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(uint32_t sessionid, void* phtoken);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(void* hwnd, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(void* hserver, void* hwnd, uint32_t dwflags);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(void* hserver, uint32_t sessionid, void* ptitle, uint32_t titlelength, void* pmessage, uint32_t messagelength, uint32_t style, uint32_t timeout, void* presponse, int32_t bwait);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(void* hserver, void* preserved, uint32_t reserved, void* plistenername, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(void* prenderhintid, void* hwndowner, uint32_t renderhinttype, uint32_t cbhintdatalength, void* phintdata);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(void* pservername, void* pusername, int32_t wtsconfigclass, void* pbuffer, uint32_t datalength);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(void* hserver, uint32_t shutdownflag);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(void* ptargetservername, uint32_t targetlogonid, uint8_t hotkeyvk, uint16_t hotkeymodifiers);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(uint32_t logonid);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(void* hserver, uint32_t processid, uint32_t exitcode);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(void* hwnd);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(void* hserver, void* hwnd);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(void* hchannelhandle);
void* windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(void* hserver, uint32_t sessionid, void* pvirtualname);
void* windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(uint32_t sessionid, void* pvirtualname, uint32_t flags);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(void* hchannelhandle);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(void* hchannelhandle);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(void* hchannelhandle, int32_t param1, void* ppbuffer, void* pbytesreturned);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(void* hchannelhandle, uint32_t timeout, void* buffer, uint32_t buffersize, void* pbytesread);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(void* hchannelhandle, void* buffer, uint32_t length, void* pbyteswritten);
int32_t windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(void* hserver, uint32_t eventmask, void* peventflags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WINDOWS_WIN32_SYSTEM_REMOTEDESKTOP_WRAPPER_H */
