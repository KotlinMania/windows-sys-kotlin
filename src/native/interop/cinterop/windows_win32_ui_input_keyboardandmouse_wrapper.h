#ifndef WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32UiInputKeyboardandmouseActivateKeyboardLayout(void* hkl, uint32_t flags);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseBlockInput(int32_t fblockit);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseEnableWindow(void* hwnd, int32_t benable);
void* windowssysWindowsWin32UiInputKeyboardandmouseGetActiveWindow(void);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseGetAsyncKeyState(int32_t vkey);
void* windowssysWindowsWin32UiInputKeyboardandmouseGetCapture(void);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseGetDoubleClickTime(void);
void* windowssysWindowsWin32UiInputKeyboardandmouseGetFocus(void);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKBCodePage(void);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextA(int32_t lparam, void* lpstring, int32_t cchsize);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyNameTextW(int32_t lparam, void* lpstring, int32_t cchsize);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyState(int32_t nvirtkey);
void* windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayout(uint32_t idthread);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutList(int32_t nbuff, void* lplist);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameA(void* pwszklid);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardLayoutNameW(void* pwszklid);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardState(void* lpkeystate);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetKeyboardType(int32_t ntypeflag);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetLastInputInfo(void* plii);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseGetMouseMovePointsEx(uint32_t cbsize, void* lppt, void* lpptbuf, int32_t nbufpoints, uint32_t resolution);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseIsWindowEnabled(void* hwnd);
void* windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutA(void* pwszklid, uint32_t flags);
void* windowssysWindowsWin32UiInputKeyboardandmouseLoadKeyboardLayoutW(void* pwszklid, uint32_t flags);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyA(uint32_t ucode, uint32_t umaptype);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExA(uint32_t ucode, uint32_t umaptype, void* dwhkl);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyExW(uint32_t ucode, uint32_t umaptype, void* dwhkl);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseMapVirtualKeyW(uint32_t ucode, uint32_t umaptype);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseOemKeyScan(uint16_t woemchar);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseRegisterHotKey(void* hwnd, int32_t id, uint32_t fsmodifiers, uint32_t vk);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseReleaseCapture(void);
uint32_t windowssysWindowsWin32UiInputKeyboardandmouseSendInput(uint32_t cinputs, void* pinputs, int32_t cbsize);
void* windowssysWindowsWin32UiInputKeyboardandmouseSetActiveWindow(void* hwnd);
void* windowssysWindowsWin32UiInputKeyboardandmouseSetCapture(void* hwnd);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseSetDoubleClickTime(uint32_t param0);
void* windowssysWindowsWin32UiInputKeyboardandmouseSetFocus(void* hwnd);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseSetKeyboardState(void* lpkeystate);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseSwapMouseButton(int32_t fswap);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseToAscii(uint32_t uvirtkey, uint32_t uscancode, void* lpkeystate, void* lpchar, uint32_t uflags);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseToAsciiEx(uint32_t uvirtkey, uint32_t uscancode, void* lpkeystate, void* lpchar, uint32_t uflags, void* dwhkl);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseToUnicode(uint32_t wvirtkey, uint32_t wscancode, void* lpkeystate, void* pwszbuff, int32_t cchbuff, uint32_t wflags);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseToUnicodeEx(uint32_t wvirtkey, uint32_t wscancode, void* lpkeystate, void* pwszbuff, int32_t cchbuff, uint32_t wflags, void* dwhkl);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseTrackMouseEvent(void* lpeventtrack);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseUnloadKeyboardLayout(void* hkl);
int32_t windowssysWindowsWin32UiInputKeyboardandmouseUnregisterHotKey(void* hwnd, int32_t id);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanA(int8_t ch);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExA(int8_t ch, void* dwhkl);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanExW(uint16_t ch, void* dwhkl);
int16_t windowssysWindowsWin32UiInputKeyboardandmouseVkKeyScanW(uint16_t ch);
void windowssysWindowsWin32UiInputKeyboardandmouseKeybdEvent(uint8_t bvk, uint8_t bscan, uint32_t dwflags, uint64_t dwextrainfo);
void windowssysWindowsWin32UiInputKeyboardandmouseMouseEvent(uint32_t dwflags, int32_t dx, int32_t dy, int32_t dwdata, uint64_t dwextrainfo);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WINDOWS_WIN32_UI_INPUT_KEYBOARDANDMOUSE_WRAPPER_H */
