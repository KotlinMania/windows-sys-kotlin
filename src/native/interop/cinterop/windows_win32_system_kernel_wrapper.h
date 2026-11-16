#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32SystemKernelRtlFirstEntrySList(void* listhead);
void windowssysWindowsWin32SystemKernelRtlInitializeSListHead(void* listhead);
void* windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(void* listhead);
void* windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(void* listhead);
void* windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(void* listhead, void* listentry);
void* windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(void* listhead, void* list, void* listend, uint32_t count);
uint16_t windowssysWindowsWin32SystemKernelRtlQueryDepthSList(void* listhead);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H */
