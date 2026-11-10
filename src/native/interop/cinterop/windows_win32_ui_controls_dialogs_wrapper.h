#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_controls_dialogs_chooseColorA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_chooseColorW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_chooseFontA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_chooseFontW(void* param0);
uint32_t windowssys_windows_win32_ui_controls_dialogs_commDlgExtendedError(void);
void* windowssys_windows_win32_ui_controls_dialogs_findTextA(void* param0);
void* windowssys_windows_win32_ui_controls_dialogs_findTextW(void* param0);
int16_t windowssys_windows_win32_ui_controls_dialogs_getFileTitleA(void* param0, void* buf, uint16_t cchsize);
int16_t windowssys_windows_win32_ui_controls_dialogs_getFileTitleW(void* param0, void* buf, uint16_t cchsize);
int32_t windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_getOpenFileNameW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_getSaveFileNameW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_pageSetupDlgW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_printDlgA(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_printDlgExA(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_printDlgExW(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_printDlgW(void* ppd);
void* windowssys_windows_win32_ui_controls_dialogs_replaceTextA(void* param0);
void* windowssys_windows_win32_ui_controls_dialogs_replaceTextW(void* param0);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H */
