#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemPipesCallNamedPipeA(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssysWindowsWin32SystemPipesCallNamedPipeW(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssysWindowsWin32SystemPipesConnectNamedPipe(void* hnamedpipe, void* lpoverlapped);
void* windowssysWindowsWin32SystemPipesCreateNamedPipeA(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
void* windowssysWindowsWin32SystemPipesCreateNamedPipeW(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
int32_t windowssysWindowsWin32SystemPipesCreatePipe(void* hreadpipe, void* hwritepipe, void* lppipeattributes, uint32_t nsize);
int32_t windowssysWindowsWin32SystemPipesDisconnectNamedPipe(void* hnamedpipe);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameA(void* arg0Pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientComputerNameW(void* arg0Pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientProcessId(void* arg0Pipe, void* clientprocessid);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeClientSessionId(void* arg0Pipe, void* clientsessionid);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateA(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeHandleStateW(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeInfo(void* hnamedpipe, void* lpflags, void* lpoutbuffersize, void* lpinbuffersize, void* lpmaxinstances);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeServerProcessId(void* arg0Pipe, void* serverprocessid);
int32_t windowssysWindowsWin32SystemPipesGetNamedPipeServerSessionId(void* arg0Pipe, void* serversessionid);
int32_t windowssysWindowsWin32SystemPipesImpersonateNamedPipeClient(void* hnamedpipe);
int32_t windowssysWindowsWin32SystemPipesPeekNamedPipe(void* hnamedpipe, void* lpbuffer, uint32_t nbuffersize, void* lpbytesread, void* lptotalbytesavail, void* lpbytesleftthismessage);
int32_t windowssysWindowsWin32SystemPipesSetNamedPipeHandleState(void* hnamedpipe, void* lpmode, void* lpmaxcollectioncount, void* lpcollectdatatimeout);
int32_t windowssysWindowsWin32SystemPipesTransactNamedPipe(void* hnamedpipe, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, void* lpoverlapped);
int32_t windowssysWindowsWin32SystemPipesWaitNamedPipeA(void* lpnamedpipename, uint32_t ntimeout);
int32_t windowssysWindowsWin32SystemPipesWaitNamedPipeW(void* lpnamedpipename, uint32_t ntimeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H */
