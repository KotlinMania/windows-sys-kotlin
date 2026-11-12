#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_FILEHISTORY_WINDOWS_WIN32_STORAGE_FILEHISTORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_FILEHISTORY_WINDOWS_WIN32_STORAGE_FILEHISTORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(void* arg0Pipe);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(void* arg0Pipe);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(int32_t startserviceifstopped, void* arg1Pipe);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(void* arg0Pipe);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(void* arg0Pipe, int32_t lowpriorityio);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(void* arg0Pipe, int32_t stoptracking);
int32_t windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(void* arg0Pipe);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_FILEHISTORY_WINDOWS_WIN32_STORAGE_FILEHISTORY_WRAPPER_H */
