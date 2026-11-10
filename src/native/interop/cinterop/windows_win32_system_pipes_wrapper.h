#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_pipes_callNamedPipeA(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_callNamedPipeW(void* lpnamedpipename, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_connectNamedPipe(void* hnamedpipe, void* lpoverlapped);
void* windowssys_windows_win32_system_pipes_createNamedPipeA(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
void* windowssys_windows_win32_system_pipes_createNamedPipeW(void* lpname, uint32_t dwopenmode, uint32_t dwpipemode, uint32_t nmaxinstances, uint32_t noutbuffersize, uint32_t ninbuffersize, uint32_t ndefaulttimeout, void* lpsecurityattributes);
int32_t windowssys_windows_win32_system_pipes_createPipe(void* hreadpipe, void* hwritepipe, void* lppipeattributes, uint32_t nsize);
int32_t windowssys_windows_win32_system_pipes_disconnectNamedPipe(void* hnamedpipe);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameA(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientComputerNameW(void* arg_0_pipe, void* clientcomputername, uint32_t clientcomputernamelength);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientProcessId(void* arg_0_pipe, void* clientprocessid);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeClientSessionId(void* arg_0_pipe, void* clientsessionid);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeHandleStateA(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeHandleStateW(void* hnamedpipe, void* lpstate, void* lpcurinstances, void* lpmaxcollectioncount, void* lpcollectdatatimeout, void* lpusername, uint32_t nmaxusernamesize);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeInfo(void* hnamedpipe, void* lpflags, void* lpoutbuffersize, void* lpinbuffersize, void* lpmaxinstances);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeServerProcessId(void* arg_0_pipe, void* serverprocessid);
int32_t windowssys_windows_win32_system_pipes_getNamedPipeServerSessionId(void* arg_0_pipe, void* serversessionid);
int32_t windowssys_windows_win32_system_pipes_impersonateNamedPipeClient(void* hnamedpipe);
int32_t windowssys_windows_win32_system_pipes_peekNamedPipe(void* hnamedpipe, void* lpbuffer, uint32_t nbuffersize, void* lpbytesread, void* lptotalbytesavail, void* lpbytesleftthismessage);
int32_t windowssys_windows_win32_system_pipes_setNamedPipeHandleState(void* hnamedpipe, void* lpmode, void* lpmaxcollectioncount, void* lpcollectdatatimeout);
int32_t windowssys_windows_win32_system_pipes_transactNamedPipe(void* hnamedpipe, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesread, void* lpoverlapped);
int32_t windowssys_windows_win32_system_pipes_waitNamedPipeA(void* lpnamedpipename, uint32_t ntimeout);
int32_t windowssys_windows_win32_system_pipes_waitNamedPipeW(void* lpnamedpipename, uint32_t ntimeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PIPES_WINDOWS_WIN32_SYSTEM_PIPES_WRAPPER_H */
