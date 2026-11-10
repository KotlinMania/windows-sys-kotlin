#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(void* lprect, uint32_t dwstyle, int32_t bmenu, uint32_t dwexstyle, uint32_t dpi);
int32_t windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(void* dpicontexta, void* dpicontextb);
int32_t windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(void* hdlg);
void* windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(void* hprocess);
int32_t windowssys_windows_win32_ui_hidpi_getDpiForMonitor(void* hmonitor, int32_t dpitype, void* dpix, void* dpiy);
uint32_t windowssys_windows_win32_ui_hidpi_getDpiForSystem(void);
uint32_t windowssys_windows_win32_ui_hidpi_getDpiForWindow(void* hwnd);
uint32_t windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(void* hprocess, void* value);
uint32_t windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(void* hprocess);
int32_t windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(int32_t nindex, uint32_t dpi);
void* windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext(void);
int32_t windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior(void);
void* windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(void* hwnd);
int32_t windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(void* value);
int32_t windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int64_t windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(void* hwnd, void* pszclasslist, uint32_t dpi);
int32_t windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(void* hwnd, void* lppoint);
int32_t windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(void* hwnd, int32_t mask, int32_t values);
int32_t windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(void* hdlg, int32_t mask, int32_t values);
int32_t windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(int32_t value);
int32_t windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(void* value);
void* windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(void* dpicontext);
int32_t windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(int32_t value);
int32_t windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uint32_t uiaction, uint32_t uiparam, void* pvparam, uint32_t fwinini, uint32_t dpi);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_HIDPI_WINDOWS_WIN32_UI_HIDPI_WRAPPER_H */
