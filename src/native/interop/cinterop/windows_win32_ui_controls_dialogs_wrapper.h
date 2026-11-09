#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_ui_controls_dialogs_ChooseColorA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_ChooseColorW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_ChooseFontA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_ChooseFontW(void* param0);
uint32_t windowssys_windows_win32_ui_controls_dialogs_CommDlgExtendedError(void);
void* windowssys_windows_win32_ui_controls_dialogs_FindTextA(void* param0);
void* windowssys_windows_win32_ui_controls_dialogs_FindTextW(void* param0);
int16_t windowssys_windows_win32_ui_controls_dialogs_GetFileTitleA(void* param0, void* buf, uint16_t cchsize);
int16_t windowssys_windows_win32_ui_controls_dialogs_GetFileTitleW(void* param0, void* buf, uint16_t cchsize);
int32_t windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_GetOpenFileNameW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_GetSaveFileNameW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgA(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_PageSetupDlgW(void* param0);
int32_t windowssys_windows_win32_ui_controls_dialogs_PrintDlgA(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_PrintDlgExA(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_PrintDlgExW(void* ppd);
int32_t windowssys_windows_win32_ui_controls_dialogs_PrintDlgW(void* ppd);
void* windowssys_windows_win32_ui_controls_dialogs_ReplaceTextA(void* param0);
void* windowssys_windows_win32_ui_controls_dialogs_ReplaceTextW(void* param0);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H */
