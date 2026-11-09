#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_hidpi_AdjustWindowRectExForDpi(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle, uint32_t dpi);
int32_t windowssys_windows_win32_ui_hidpi_AreDpiAwarenessContextsEqual(void* dpicontexta, void* dpicontextb);
int32_t windowssys_windows_win32_ui_hidpi_EnableNonClientDpiScaling(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_GetAwarenessFromDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_GetDialogControlDpiChangeBehavior(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_GetDialogDpiChangeBehavior(void* hdlg);
void* windowssys_windows_win32_ui_hidpi_GetDpiAwarenessContextForProcess(void* hprocess);
int32_t windowssys_windows_win32_ui_hidpi_GetDpiForMonitor(void* hmonitor, int32_t dpitype, void* dpix, void* dpiy);
uint32_t windowssys_windows_win32_ui_hidpi_GetDpiForSystem(void);
uint32_t windowssys_windows_win32_ui_hidpi_GetDpiForWindow(void* hwnd);
uint32_t windowssys_windows_win32_ui_hidpi_GetDpiFromDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_GetProcessDpiAwareness(void* hprocess, void* value);
uint32_t windowssys_windows_win32_ui_hidpi_GetSystemDpiForProcess(void* hprocess);
int32_t windowssys_windows_win32_ui_hidpi_GetSystemMetricsForDpi(int32_t nindex, uint32_t dpi);
void* windowssys_windows_win32_ui_hidpi_GetThreadDpiAwarenessContext(void);
int32_t windowssys_windows_win32_ui_hidpi_GetThreadDpiHostingBehavior(void);
void* windowssys_windows_win32_ui_hidpi_GetWindowDpiAwarenessContext(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_GetWindowDpiHostingBehavior(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_IsValidDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_LogicalToPhysicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int64_t windowssys_windows_win32_ui_hidpi_OpenThemeDataForDpi(void* hwnd, void* pszclasslist, uint32_t dpi);
int32_t windowssys_windows_win32_ui_hidpi_PhysicalToLogicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int32_t windowssys_windows_win32_ui_hidpi_SetDialogControlDpiChangeBehavior(void* hwnd, int32_t mask, int32_t values);
int32_t windowssys_windows_win32_ui_hidpi_SetDialogDpiChangeBehavior(void* hdlg, int32_t mask, int32_t values);
int32_t windowssys_windows_win32_ui_hidpi_SetProcessDpiAwareness(int32_t value);
int32_t windowssys_windows_win32_ui_hidpi_SetProcessDpiAwarenessContext(void* value);
void* windowssys_windows_win32_ui_hidpi_SetThreadDpiAwarenessContext(void* dpicontext);
int32_t windowssys_windows_win32_ui_hidpi_SetThreadDpiHostingBehavior(int32_t value);
int32_t windowssys_windows_win32_ui_hidpi_SystemParametersInfoForDpi(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini, uint32_t dpi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H */
