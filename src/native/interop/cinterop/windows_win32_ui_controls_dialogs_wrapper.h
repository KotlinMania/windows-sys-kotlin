#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32UiControlsDialogsChooseColorA(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsChooseColorW(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsChooseFontA(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsChooseFontW(void* param0);
uint32_t windowssysWindowsWin32UiControlsDialogsCommDlgExtendedError(void);
void* windowssysWindowsWin32UiControlsDialogsFindTextA(void* param0);
void* windowssysWindowsWin32UiControlsDialogsFindTextW(void* param0);
int16_t windowssysWindowsWin32UiControlsDialogsGetFileTitleA(void* param0, void* buf, uint16_t cchsize);
int16_t windowssysWindowsWin32UiControlsDialogsGetFileTitleW(void* param0, void* buf, uint16_t cchsize);
int32_t windowssysWindowsWin32UiControlsDialogsGetOpenFileNameA(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsGetOpenFileNameW(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsGetSaveFileNameA(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsGetSaveFileNameW(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsPageSetupDlgA(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsPageSetupDlgW(void* param0);
int32_t windowssysWindowsWin32UiControlsDialogsPrintDlgA(void* ppd);
int32_t windowssysWindowsWin32UiControlsDialogsPrintDlgExA(void* ppd);
int32_t windowssysWindowsWin32UiControlsDialogsPrintDlgExW(void* ppd);
int32_t windowssysWindowsWin32UiControlsDialogsPrintDlgW(void* ppd);
void* windowssysWindowsWin32UiControlsDialogsReplaceTextA(void* param0);
void* windowssysWindowsWin32UiControlsDialogsReplaceTextW(void* param0);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WINDOWS_WIN32_UI_CONTROLS_DIALOGS_WRAPPER_H */
