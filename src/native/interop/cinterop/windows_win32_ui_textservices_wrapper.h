#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_TEXTSERVICES_WINDOWS_WIN32_UI_TEXTSERVICES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_TEXTSERVICES_WINDOWS_WIN32_UI_TEXTSERVICES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_textservices_doMsCtfMonitor(uint32_t dwflags, void* heventforservicestop);
int32_t windowssys_windows_win32_ui_textservices_initLocalMsCtfMonitor(uint32_t dwflags);
int32_t windowssys_windows_win32_ui_textservices_uninitLocalMsCtfMonitor(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_TEXTSERVICES_WINDOWS_WIN32_UI_TEXTSERVICES_WRAPPER_H */
