#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IO_WINDOWS_WIN32_SYSTEM_IO_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IO_WINDOWS_WIN32_SYSTEM_IO_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_io_BindIoCompletionCallback(void* filehandle, void* function, uint32_t flags);
int32_t windowssys_windows_win32_system_io_CancelIo(void* hfile);
int32_t windowssys_windows_win32_system_io_CancelIoEx(void* hfile, void* lpoverlapped);
int32_t windowssys_windows_win32_system_io_CancelSynchronousIo(void* hthread);
void* windowssys_windows_win32_system_io_CreateIoCompletionPort(void* filehandle, void* existingcompletionport, uint64_t completionkey, uint32_t numberofconcurrentthreads);
int32_t windowssys_windows_win32_system_io_DeviceIoControl(void* hdevice, uint32_t dwiocontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpoverlapped);
int32_t windowssys_windows_win32_system_io_GetOverlappedResult(void* hfile, void* lpoverlapped, void* lpnumberofbytestransferred, int32_t bwait);
int32_t windowssys_windows_win32_system_io_GetOverlappedResultEx(void* hfile, void* lpoverlapped, void* lpnumberofbytestransferred, uint32_t dwmilliseconds, int32_t balertable);
int32_t windowssys_windows_win32_system_io_GetQueuedCompletionStatus(void* completionport, void* lpnumberofbytestransferred, void* lpcompletionkey, void* lpoverlapped, uint32_t dwmilliseconds);
int32_t windowssys_windows_win32_system_io_GetQueuedCompletionStatusEx(void* completionport, void* lpcompletionportentries, uint32_t ulcount, void* ulnumentriesremoved, uint32_t dwmilliseconds, int32_t falertable);
int32_t windowssys_windows_win32_system_io_PostQueuedCompletionStatus(void* completionport, uint32_t dwnumberofbytestransferred, uint64_t dwcompletionkey, void* lpoverlapped);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IO_WINDOWS_WIN32_SYSTEM_IO_WRAPPER_H */
