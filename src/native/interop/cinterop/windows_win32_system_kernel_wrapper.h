#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_kernel_rtlFirstEntrySList(void* listhead);
void windowssys_windows_win32_system_kernel_rtlInitializeSListHead(void* listhead);
void* windowssys_windows_win32_system_kernel_rtlInterlockedFlushSList(void* listhead);
void* windowssys_windows_win32_system_kernel_rtlInterlockedPopEntrySList(void* listhead);
void* windowssys_windows_win32_system_kernel_rtlInterlockedPushEntrySList(void* listhead, void* listentry);
void* windowssys_windows_win32_system_kernel_rtlInterlockedPushListSListEx(void* listhead, void* list, void* listend, uint32_t count);
uint16_t windowssys_windows_win32_system_kernel_rtlQueryDepthSList(void* listhead);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_KERNEL_WINDOWS_WIN32_SYSTEM_KERNEL_WRAPPER_H */
