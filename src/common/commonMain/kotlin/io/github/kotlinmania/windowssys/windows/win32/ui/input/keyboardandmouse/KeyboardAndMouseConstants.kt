package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ACUTE: UInt = 769u

public val AX_KBD_DESKTOP_TYPE: UInt = 1u

public val BREVE: UInt = 774u

public val CAPLOK: UInt = 1u

public val CAPLOKALTGR: UInt = 4u

public val CEDILLA: UInt = 807u

public val CIRCUMFLEX: UInt = 770u

public val DEC_KBD_ANSI_LAYOUT_TYPE: UInt = 1u

public val DEC_KBD_JIS_LAYOUT_TYPE: UInt = 2u

public val DIARESIS: UInt = 776u

public val DIARESIS_TONOS: UInt = 901u

public val DKF_DEAD: UInt = 1u

public val DONTCARE_BIT: UInt = 33554432u

public val DOT_ABOVE: UInt = 775u

public val DOUBLE_ACUTE: UInt = 779u

public val EXTENDED_BIT: UInt = 16777216u

public val FAKE_KEYSTROKE: UInt = 33554432u

public val FMR_KBD_JIS_TYPE: UInt = 0u

public val FMR_KBD_OASYS_TYPE: UInt = 1u

public val FMV_KBD_OASYS_TYPE: UInt = 2u

public val GMMP_USE_DISPLAY_POINTS: GetMouseMovePointsExResolution = 1u

public val GMMP_USE_HIGH_RESOLUTION_POINTS: GetMouseMovePointsExResolution = 2u

public val GRAVE: UInt = 768u

public val GRPSELTAP: UInt = 128u

public val HACEK: UInt = 780u

public val HOOK_ABOVE: UInt = 777u

public val INPUT_HARDWARE: InputType = 2u

public val INPUT_KEYBOARD: InputType = 1u

public val INPUT_MOUSE: InputType = 0u

public val KANALOK: UInt = 8u

public val KBDALT: UInt = 4u

public val KBDBASE: UInt = 0u

public val KBDCTRL: UInt = 2u

public val KBDGRPSELTAP: UInt = 128u

public val KBDKANA: UInt = 8u

public val KBDLOYA: UInt = 32u

public val KBDNLS_ALPHANUM: UInt = 5u

public val KBDNLS_CODEINPUT: UInt = 10u

public val KBDNLS_CONV_OR_NONCONV: UInt = 15u

public val KBDNLS_HELP_OR_END: UInt = 11u

public val KBDNLS_HIRAGANA: UInt = 6u

public val KBDNLS_HOME_OR_CLEAR: UInt = 12u

public val KBDNLS_INDEX_ALT: UInt = 2u

public val KBDNLS_INDEX_NORMAL: UInt = 1u

public val KBDNLS_KANAEVENT: UInt = 14u

public val KBDNLS_KANALOCK: UInt = 4u

public val KBDNLS_KATAKANA: UInt = 7u

public val KBDNLS_NOEVENT: UInt = 1u

public val KBDNLS_NULL: UInt = 0u

public val KBDNLS_NUMPAD: UInt = 13u

public val KBDNLS_ROMAN: UInt = 9u

public val KBDNLS_SBCSDBCS: UInt = 8u

public val KBDNLS_SEND_BASE_VK: UInt = 2u

public val KBDNLS_SEND_PARAM_VK: UInt = 3u

public val KBDNLS_TYPE_NORMAL: UInt = 1u

public val KBDNLS_TYPE_NULL: UInt = 0u

public val KBDNLS_TYPE_TOGGLE: UInt = 2u

public val KBDROYA: UInt = 16u

public val KBDSHIFT: UInt = 1u

public val KBDTABLE_MULTI_MAX: UInt = 8u

public val KBD_TYPE: UInt = 4u

public val KBD_VERSION: UInt = 1u

public val KEYBOARD_TYPE_GENERIC_101: UInt = 4u

public val KEYBOARD_TYPE_JAPAN: UInt = 7u

public val KEYBOARD_TYPE_KOREA: UInt = 8u

public val KEYBOARD_TYPE_UNKNOWN: UInt = 81u

public val KEYEVENTF_EXTENDEDKEY: KeybdEventFlags = 1u

public val KEYEVENTF_KEYUP: KeybdEventFlags = 2u

public val KEYEVENTF_SCANCODE: KeybdEventFlags = 8u

public val KEYEVENTF_UNICODE: KeybdEventFlags = 4u

public val KLF_ACTIVATE: ActivateKeyboardLayoutFlags = 1u

public val KLF_NOTELLSHELL: ActivateKeyboardLayoutFlags = 128u

public val KLF_REORDER: ActivateKeyboardLayoutFlags = 8u

public val KLF_REPLACELANG: ActivateKeyboardLayoutFlags = 16u

public val KLF_RESET: ActivateKeyboardLayoutFlags = 1073741824u

public val KLF_SETFORPROCESS: ActivateKeyboardLayoutFlags = 256u

public val KLF_SHIFTLOCK: ActivateKeyboardLayoutFlags = 65536u

public val KLF_SUBSTITUTE_OK: ActivateKeyboardLayoutFlags = 2u

public val KLLF_ALTGR: UInt = 1u

public val KLLF_GLOBAL_ATTRS: UInt = 2u

public val KLLF_LRM_RLM: UInt = 4u

public val KLLF_SHIFTLOCK: UInt = 2u

public val MACRON: UInt = 772u

public val MAPVK_VK_TO_CHAR: MapVirtualKeyType = 2u

public val MAPVK_VK_TO_VSC: MapVirtualKeyType = 0u

public val MAPVK_VK_TO_VSC_EX: MapVirtualKeyType = 4u

public val MAPVK_VSC_TO_VK: MapVirtualKeyType = 1u

public val MAPVK_VSC_TO_VK_EX: MapVirtualKeyType = 3u

public val MICROSOFT_KBD_001_TYPE: UInt = 4u

public val MICROSOFT_KBD_002_TYPE: UInt = 3u

public val MICROSOFT_KBD_101A_TYPE: UInt = 0u

public val MICROSOFT_KBD_101B_TYPE: UInt = 4u

public val MICROSOFT_KBD_101C_TYPE: UInt = 5u

public val MICROSOFT_KBD_101_TYPE: UInt = 0u

public val MICROSOFT_KBD_103_TYPE: UInt = 6u

public val MICROSOFT_KBD_106_TYPE: UInt = 2u

public val MICROSOFT_KBD_AX_TYPE: UInt = 1u

public val MICROSOFT_KBD_FUNC: UInt = 12u

public val MOD_ALT: HotKeyModifiers = 1u

public val MOD_CONTROL: HotKeyModifiers = 2u

public val MOD_NOREPEAT: HotKeyModifiers = 16384u

public val MOD_SHIFT: HotKeyModifiers = 4u

public val MOD_WIN: HotKeyModifiers = 8u

public val MOUSEEVENTF_ABSOLUTE: MouseEventFlags = 32768u

public val MOUSEEVENTF_HWHEEL: MouseEventFlags = 4096u

public val MOUSEEVENTF_LEFTDOWN: MouseEventFlags = 2u

public val MOUSEEVENTF_LEFTUP: MouseEventFlags = 4u

public val MOUSEEVENTF_MIDDLEDOWN: MouseEventFlags = 32u

public val MOUSEEVENTF_MIDDLEUP: MouseEventFlags = 64u

public val MOUSEEVENTF_MOVE: MouseEventFlags = 1u

public val MOUSEEVENTF_MOVE_NOCOALESCE: MouseEventFlags = 8192u

public val MOUSEEVENTF_RIGHTDOWN: MouseEventFlags = 8u

public val MOUSEEVENTF_RIGHTUP: MouseEventFlags = 16u

public val MOUSEEVENTF_VIRTUALDESK: MouseEventFlags = 16384u

public val MOUSEEVENTF_WHEEL: MouseEventFlags = 2048u

public val MOUSEEVENTF_XDOWN: MouseEventFlags = 128u

public val MOUSEEVENTF_XUP: MouseEventFlags = 256u

public val NEC_KBD_106_TYPE: UInt = 5u

public val NEC_KBD_H_MODE_TYPE: UInt = 3u

public val NEC_KBD_LAPTOP_TYPE: UInt = 4u

public val NEC_KBD_NORMAL_TYPE: UInt = 1u

public val NEC_KBD_N_MODE_TYPE: UInt = 2u

public val NLSKBD_INFO_ACCESSIBILITY_KEYMAP: UInt = 2u

public val NLSKBD_INFO_EMURATE_101_KEYBOARD: UInt = 16u

public val NLSKBD_INFO_EMURATE_106_KEYBOARD: UInt = 32u

public val NLSKBD_INFO_SEND_IME_NOTIFICATION: UInt = 1u

public val NLSKBD_OEM_AX: UInt = 1u

public val NLSKBD_OEM_DEC: UInt = 24u

public val NLSKBD_OEM_EPSON: UInt = 4u

public val NLSKBD_OEM_FUJITSU: UInt = 5u

public val NLSKBD_OEM_IBM: UInt = 7u

public val NLSKBD_OEM_MATSUSHITA: UInt = 10u

public val NLSKBD_OEM_MICROSOFT: UInt = 0u

public val NLSKBD_OEM_NEC: UInt = 13u

public val NLSKBD_OEM_TOSHIBA: UInt = 18u

public val OGONEK: UInt = 808u

public val OVERSCORE: UInt = 773u

public val RING: UInt = 778u

public val SCANCODE_ALT: UInt = 56u

public val SCANCODE_CTRL: UInt = 29u

public val SCANCODE_LSHIFT: UInt = 42u

public val SCANCODE_LWIN: UInt = 91u

public val SCANCODE_NUMPAD_FIRST: UInt = 71u

public val SCANCODE_NUMPAD_LAST: UInt = 82u

public val SCANCODE_RSHIFT: UInt = 54u

public val SCANCODE_RWIN: UInt = 92u

public val SCANCODE_THAI_LAYOUT_TOGGLE: UInt = 41u

public val SGCAPS: UInt = 2u

public val SHFT_INVALID: UInt = 15u

public val TILDE: UInt = 771u

public val TME_CANCEL: TrackmouseeventFlags = 2147483648u

public val TME_HOVER: TrackmouseeventFlags = 1u

public val TME_LEAVE: TrackmouseeventFlags = 2u

public val TME_NONCLIENT: TrackmouseeventFlags = 16u

public val TME_QUERY: TrackmouseeventFlags = 1073741824u

public val TONOS: UInt = 900u

public val TOSHIBA_KBD_DESKTOP_TYPE: UInt = 13u

public val TOSHIBA_KBD_LAPTOP_TYPE: UInt = 15u

public val UMLAUT: UInt = 776u

public val VK_0: VirtualKey = 48u.toUShort()

public val VK_1: VirtualKey = 49u.toUShort()

public val VK_2: VirtualKey = 50u.toUShort()

public val VK_3: VirtualKey = 51u.toUShort()

public val VK_4: VirtualKey = 52u.toUShort()

public val VK_5: VirtualKey = 53u.toUShort()

public val VK_6: VirtualKey = 54u.toUShort()

public val VK_7: VirtualKey = 55u.toUShort()

public val VK_8: VirtualKey = 56u.toUShort()

public val VK_9: VirtualKey = 57u.toUShort()

public val VK_A: VirtualKey = 65u.toUShort()

public val VK_ABNT_C1: VirtualKey = 193u.toUShort()

public val VK_ABNT_C2: VirtualKey = 194u.toUShort()

public val VK_ACCEPT: VirtualKey = 30u.toUShort()

public val VK_ADD: VirtualKey = 107u.toUShort()

public val VK_APPS: VirtualKey = 93u.toUShort()

public val VK_ATTN: VirtualKey = 246u.toUShort()

public val VK_B: VirtualKey = 66u.toUShort()

public val VK_BACK: VirtualKey = 8u.toUShort()

public val VK_BROWSER_BACK: VirtualKey = 166u.toUShort()

public val VK_BROWSER_FAVORITES: VirtualKey = 171u.toUShort()

public val VK_BROWSER_FORWARD: VirtualKey = 167u.toUShort()

public val VK_BROWSER_HOME: VirtualKey = 172u.toUShort()

public val VK_BROWSER_REFRESH: VirtualKey = 168u.toUShort()

public val VK_BROWSER_SEARCH: VirtualKey = 170u.toUShort()

public val VK_BROWSER_STOP: VirtualKey = 169u.toUShort()

public val VK_C: VirtualKey = 67u.toUShort()

public val VK_CANCEL: VirtualKey = 3u.toUShort()

public val VK_CAPITAL: VirtualKey = 20u.toUShort()

public val VK_CLEAR: VirtualKey = 12u.toUShort()

public val VK_CONTROL: VirtualKey = 17u.toUShort()

public val VK_CONVERT: VirtualKey = 28u.toUShort()

public val VK_CRSEL: VirtualKey = 247u.toUShort()

public val VK_D: VirtualKey = 68u.toUShort()

public val VK_DBE_ALPHANUMERIC: VirtualKey = 240u.toUShort()

public val VK_DBE_CODEINPUT: VirtualKey = 250u.toUShort()

public val VK_DBE_DBCSCHAR: VirtualKey = 244u.toUShort()

public val VK_DBE_DETERMINESTRING: VirtualKey = 252u.toUShort()

public val VK_DBE_ENTERDLGCONVERSIONMODE: VirtualKey = 253u.toUShort()

public val VK_DBE_ENTERIMECONFIGMODE: VirtualKey = 248u.toUShort()

public val VK_DBE_ENTERWORDREGISTERMODE: VirtualKey = 247u.toUShort()

public val VK_DBE_FLUSHSTRING: VirtualKey = 249u.toUShort()

public val VK_DBE_HIRAGANA: VirtualKey = 242u.toUShort()

public val VK_DBE_KATAKANA: VirtualKey = 241u.toUShort()

public val VK_DBE_NOCODEINPUT: VirtualKey = 251u.toUShort()

public val VK_DBE_NOROMAN: VirtualKey = 246u.toUShort()

public val VK_DBE_ROMAN: VirtualKey = 245u.toUShort()

public val VK_DBE_SBCSCHAR: VirtualKey = 243u.toUShort()

public val VK_DECIMAL: VirtualKey = 110u.toUShort()

public val VK_DELETE: VirtualKey = 46u.toUShort()

public val VK_DIVIDE: VirtualKey = 111u.toUShort()

public val VK_DOWN: VirtualKey = 40u.toUShort()

public val VK_E: VirtualKey = 69u.toUShort()

public val VK_END: VirtualKey = 35u.toUShort()

public val VK_EREOF: VirtualKey = 249u.toUShort()

public val VK_ESCAPE: VirtualKey = 27u.toUShort()

public val VK_EXECUTE: VirtualKey = 43u.toUShort()

public val VK_EXSEL: VirtualKey = 248u.toUShort()

public val VK_F: VirtualKey = 70u.toUShort()

public val VK_F1: VirtualKey = 112u.toUShort()

public val VK_F10: VirtualKey = 121u.toUShort()

public val VK_F11: VirtualKey = 122u.toUShort()

public val VK_F12: VirtualKey = 123u.toUShort()

public val VK_F13: VirtualKey = 124u.toUShort()

public val VK_F14: VirtualKey = 125u.toUShort()

public val VK_F15: VirtualKey = 126u.toUShort()

public val VK_F16: VirtualKey = 127u.toUShort()

public val VK_F17: VirtualKey = 128u.toUShort()

public val VK_F18: VirtualKey = 129u.toUShort()

public val VK_F19: VirtualKey = 130u.toUShort()

public val VK_F2: VirtualKey = 113u.toUShort()

public val VK_F20: VirtualKey = 131u.toUShort()

public val VK_F21: VirtualKey = 132u.toUShort()

public val VK_F22: VirtualKey = 133u.toUShort()

public val VK_F23: VirtualKey = 134u.toUShort()

public val VK_F24: VirtualKey = 135u.toUShort()

public val VK_F3: VirtualKey = 114u.toUShort()

public val VK_F4: VirtualKey = 115u.toUShort()

public val VK_F5: VirtualKey = 116u.toUShort()

public val VK_F6: VirtualKey = 117u.toUShort()

public val VK_F7: VirtualKey = 118u.toUShort()

public val VK_F8: VirtualKey = 119u.toUShort()

public val VK_F9: VirtualKey = 120u.toUShort()

public val VK_FINAL: VirtualKey = 24u.toUShort()

public val VK_G: VirtualKey = 71u.toUShort()

public val VK_GAMEPAD_A: VirtualKey = 195u.toUShort()

public val VK_GAMEPAD_B: VirtualKey = 196u.toUShort()

public val VK_GAMEPAD_DPAD_DOWN: VirtualKey = 204u.toUShort()

public val VK_GAMEPAD_DPAD_LEFT: VirtualKey = 205u.toUShort()

public val VK_GAMEPAD_DPAD_RIGHT: VirtualKey = 206u.toUShort()

public val VK_GAMEPAD_DPAD_UP: VirtualKey = 203u.toUShort()

public val VK_GAMEPAD_LEFT_SHOULDER: VirtualKey = 200u.toUShort()

public val VK_GAMEPAD_LEFT_THUMBSTICK_BUTTON: VirtualKey = 209u.toUShort()

public val VK_GAMEPAD_LEFT_THUMBSTICK_DOWN: VirtualKey = 212u.toUShort()

public val VK_GAMEPAD_LEFT_THUMBSTICK_LEFT: VirtualKey = 214u.toUShort()

public val VK_GAMEPAD_LEFT_THUMBSTICK_RIGHT: VirtualKey = 213u.toUShort()

public val VK_GAMEPAD_LEFT_THUMBSTICK_UP: VirtualKey = 211u.toUShort()

public val VK_GAMEPAD_LEFT_TRIGGER: VirtualKey = 201u.toUShort()

public val VK_GAMEPAD_MENU: VirtualKey = 207u.toUShort()

public val VK_GAMEPAD_RIGHT_SHOULDER: VirtualKey = 199u.toUShort()

public val VK_GAMEPAD_RIGHT_THUMBSTICK_BUTTON: VirtualKey = 210u.toUShort()

public val VK_GAMEPAD_RIGHT_THUMBSTICK_DOWN: VirtualKey = 216u.toUShort()

public val VK_GAMEPAD_RIGHT_THUMBSTICK_LEFT: VirtualKey = 218u.toUShort()

public val VK_GAMEPAD_RIGHT_THUMBSTICK_RIGHT: VirtualKey = 217u.toUShort()

public val VK_GAMEPAD_RIGHT_THUMBSTICK_UP: VirtualKey = 215u.toUShort()

public val VK_GAMEPAD_RIGHT_TRIGGER: VirtualKey = 202u.toUShort()

public val VK_GAMEPAD_VIEW: VirtualKey = 208u.toUShort()

public val VK_GAMEPAD_X: VirtualKey = 197u.toUShort()

public val VK_GAMEPAD_Y: VirtualKey = 198u.toUShort()

public val VK_H: VirtualKey = 72u.toUShort()

public val VK_HANGEUL: VirtualKey = 21u.toUShort()

public val VK_HANGUL: VirtualKey = 21u.toUShort()

public val VK_HANJA: VirtualKey = 25u.toUShort()

public val VK_HELP: VirtualKey = 47u.toUShort()

public val VK_HOME: VirtualKey = 36u.toUShort()

public val VK_I: VirtualKey = 73u.toUShort()

public val VK_ICO_00: VirtualKey = 228u.toUShort()

public val VK_ICO_CLEAR: VirtualKey = 230u.toUShort()

public val VK_ICO_HELP: VirtualKey = 227u.toUShort()

public val VK_IME_OFF: VirtualKey = 26u.toUShort()

public val VK_IME_ON: VirtualKey = 22u.toUShort()

public val VK_INSERT: VirtualKey = 45u.toUShort()

public val VK_J: VirtualKey = 74u.toUShort()

public val VK_JUNJA: VirtualKey = 23u.toUShort()

public val VK_K: VirtualKey = 75u.toUShort()

public val VK_KANA: VirtualKey = 21u.toUShort()

public val VK_KANJI: VirtualKey = 25u.toUShort()

public val VK_L: VirtualKey = 76u.toUShort()

public val VK_LAUNCH_APP1: VirtualKey = 182u.toUShort()

public val VK_LAUNCH_APP2: VirtualKey = 183u.toUShort()

public val VK_LAUNCH_MAIL: VirtualKey = 180u.toUShort()

public val VK_LAUNCH_MEDIA_SELECT: VirtualKey = 181u.toUShort()

public val VK_LBUTTON: VirtualKey = 1u.toUShort()

public val VK_LCONTROL: VirtualKey = 162u.toUShort()

public val VK_LEFT: VirtualKey = 37u.toUShort()

public val VK_LMENU: VirtualKey = 164u.toUShort()

public val VK_LSHIFT: VirtualKey = 160u.toUShort()

public val VK_LWIN: VirtualKey = 91u.toUShort()

public val VK_M: VirtualKey = 77u.toUShort()

public val VK_MBUTTON: VirtualKey = 4u.toUShort()

public val VK_MEDIA_NEXT_TRACK: VirtualKey = 176u.toUShort()

public val VK_MEDIA_PLAY_PAUSE: VirtualKey = 179u.toUShort()

public val VK_MEDIA_PREV_TRACK: VirtualKey = 177u.toUShort()

public val VK_MEDIA_STOP: VirtualKey = 178u.toUShort()

public val VK_MENU: VirtualKey = 18u.toUShort()

public val VK_MODECHANGE: VirtualKey = 31u.toUShort()

public val VK_MULTIPLY: VirtualKey = 106u.toUShort()

public val VK_N: VirtualKey = 78u.toUShort()

public val VK_NAVIGATION_ACCEPT: VirtualKey = 142u.toUShort()

public val VK_NAVIGATION_CANCEL: VirtualKey = 143u.toUShort()

public val VK_NAVIGATION_DOWN: VirtualKey = 139u.toUShort()

public val VK_NAVIGATION_LEFT: VirtualKey = 140u.toUShort()

public val VK_NAVIGATION_MENU: VirtualKey = 137u.toUShort()

public val VK_NAVIGATION_RIGHT: VirtualKey = 141u.toUShort()

public val VK_NAVIGATION_UP: VirtualKey = 138u.toUShort()

public val VK_NAVIGATION_VIEW: VirtualKey = 136u.toUShort()

public val VK_NEXT: VirtualKey = 34u.toUShort()

public val VK_NONAME: VirtualKey = 252u.toUShort()

public val VK_NONCONVERT: VirtualKey = 29u.toUShort()

public val VK_NUMLOCK: VirtualKey = 144u.toUShort()

public val VK_NUMPAD0: VirtualKey = 96u.toUShort()

public val VK_NUMPAD1: VirtualKey = 97u.toUShort()

public val VK_NUMPAD2: VirtualKey = 98u.toUShort()

public val VK_NUMPAD3: VirtualKey = 99u.toUShort()

public val VK_NUMPAD4: VirtualKey = 100u.toUShort()

public val VK_NUMPAD5: VirtualKey = 101u.toUShort()

public val VK_NUMPAD6: VirtualKey = 102u.toUShort()

public val VK_NUMPAD7: VirtualKey = 103u.toUShort()

public val VK_NUMPAD8: VirtualKey = 104u.toUShort()

public val VK_NUMPAD9: VirtualKey = 105u.toUShort()

public val VK_O: VirtualKey = 79u.toUShort()

public val VK_OEM_1: VirtualKey = 186u.toUShort()

public val VK_OEM_102: VirtualKey = 226u.toUShort()

public val VK_OEM_2: VirtualKey = 191u.toUShort()

public val VK_OEM_3: VirtualKey = 192u.toUShort()

public val VK_OEM_4: VirtualKey = 219u.toUShort()

public val VK_OEM_5: VirtualKey = 220u.toUShort()

public val VK_OEM_6: VirtualKey = 221u.toUShort()

public val VK_OEM_7: VirtualKey = 222u.toUShort()

public val VK_OEM_8: VirtualKey = 223u.toUShort()

public val VK_OEM_ATTN: VirtualKey = 240u.toUShort()

public val VK_OEM_AUTO: VirtualKey = 243u.toUShort()

public val VK_OEM_AX: VirtualKey = 225u.toUShort()

public val VK_OEM_BACKTAB: VirtualKey = 245u.toUShort()

public val VK_OEM_CLEAR: VirtualKey = 254u.toUShort()

public val VK_OEM_COMMA: VirtualKey = 188u.toUShort()

public val VK_OEM_COPY: VirtualKey = 242u.toUShort()

public val VK_OEM_CUSEL: VirtualKey = 239u.toUShort()

public val VK_OEM_ENLW: VirtualKey = 244u.toUShort()

public val VK_OEM_FINISH: VirtualKey = 241u.toUShort()

public val VK_OEM_FJ_JISHO: VirtualKey = 146u.toUShort()

public val VK_OEM_FJ_LOYA: VirtualKey = 149u.toUShort()

public val VK_OEM_FJ_MASSHOU: VirtualKey = 147u.toUShort()

public val VK_OEM_FJ_ROYA: VirtualKey = 150u.toUShort()

public val VK_OEM_FJ_TOUROKU: VirtualKey = 148u.toUShort()

public val VK_OEM_JUMP: VirtualKey = 234u.toUShort()

public val VK_OEM_MINUS: VirtualKey = 189u.toUShort()

public val VK_OEM_NEC_EQUAL: VirtualKey = 146u.toUShort()

public val VK_OEM_PA1: VirtualKey = 235u.toUShort()

public val VK_OEM_PA2: VirtualKey = 236u.toUShort()

public val VK_OEM_PA3: VirtualKey = 237u.toUShort()

public val VK_OEM_PERIOD: VirtualKey = 190u.toUShort()

public val VK_OEM_PLUS: VirtualKey = 187u.toUShort()

public val VK_OEM_RESET: VirtualKey = 233u.toUShort()

public val VK_OEM_WSCTRL: VirtualKey = 238u.toUShort()

public val VK_P: VirtualKey = 80u.toUShort()

public val VK_PA1: VirtualKey = 253u.toUShort()

public val VK_PACKET: VirtualKey = 231u.toUShort()

public val VK_PAUSE: VirtualKey = 19u.toUShort()

public val VK_PLAY: VirtualKey = 250u.toUShort()

public val VK_PRINT: VirtualKey = 42u.toUShort()

public val VK_PRIOR: VirtualKey = 33u.toUShort()

public val VK_PROCESSKEY: VirtualKey = 229u.toUShort()

public val VK_Q: VirtualKey = 81u.toUShort()

public val VK_R: VirtualKey = 82u.toUShort()

public val VK_RBUTTON: VirtualKey = 2u.toUShort()

public val VK_RCONTROL: VirtualKey = 163u.toUShort()

public val VK_RETURN: VirtualKey = 13u.toUShort()

public val VK_RIGHT: VirtualKey = 39u.toUShort()

public val VK_RMENU: VirtualKey = 165u.toUShort()

public val VK_RSHIFT: VirtualKey = 161u.toUShort()

public val VK_RWIN: VirtualKey = 92u.toUShort()

public val VK_S: VirtualKey = 83u.toUShort()

public val VK_SCROLL: VirtualKey = 145u.toUShort()

public val VK_SELECT: VirtualKey = 41u.toUShort()

public val VK_SEPARATOR: VirtualKey = 108u.toUShort()

public val VK_SHIFT: VirtualKey = 16u.toUShort()

public val VK_SLEEP: VirtualKey = 95u.toUShort()

public val VK_SNAPSHOT: VirtualKey = 44u.toUShort()

public val VK_SPACE: VirtualKey = 32u.toUShort()

public val VK_SUBTRACT: VirtualKey = 109u.toUShort()

public val VK_T: VirtualKey = 84u.toUShort()

public val VK_TAB: VirtualKey = 9u.toUShort()

public val VK_U: VirtualKey = 85u.toUShort()

public val VK_UP: VirtualKey = 38u.toUShort()

public val VK_V: VirtualKey = 86u.toUShort()

public val VK_VOLUME_DOWN: VirtualKey = 174u.toUShort()

public val VK_VOLUME_MUTE: VirtualKey = 173u.toUShort()

public val VK_VOLUME_UP: VirtualKey = 175u.toUShort()

public val VK_W: VirtualKey = 87u.toUShort()

public val VK_X: VirtualKey = 88u.toUShort()

public val VK_XBUTTON1: VirtualKey = 5u.toUShort()

public val VK_XBUTTON2: VirtualKey = 6u.toUShort()

public val VK_Y: VirtualKey = 89u.toUShort()

public val VK_Z: VirtualKey = 90u.toUShort()

public val VK_ZOOM: VirtualKey = 251u.toUShort()

public val VK_NONE: VirtualKey = 255u.toUShort()

public val WCH_DEAD: UInt = 61441u

public val WCH_LGTR: UInt = 61442u

public val WCH_NONE: UInt = 61440u

public val WSZ_ACUTE: Pcwstr = w("́")

public val WSZ_BREVE: Pcwstr = w("̆")

public val WSZ_CEDILLA: Pcwstr = w("̧")

public val WSZ_CIRCUMFLEX: Pcwstr = w("̂")

public val WSZ_DIARESIS_TONOS: Pcwstr = w("΅")

public val WSZ_DOT_ABOVE: Pcwstr = w("̇")

public val WSZ_DOUBLE_ACUTE: Pcwstr = w("̋")

public val WSZ_GRAVE: Pcwstr = w("̀")

public val WSZ_HACEK: Pcwstr = w("̌")

public val WSZ_HOOK_ABOVE: Pcwstr = w("̉")

public val WSZ_MACRON: Pcwstr = w("̄")

public val WSZ_OGONEK: Pcwstr = w("̨")

public val WSZ_OVERSCORE: Pcwstr = w("̅")

public val WSZ_RING: Pcwstr = w("̊")

public val WSZ_TILDE: Pcwstr = w("̃")

public val WSZ_TONOS: Pcwstr = w("΄")

public val WSZ_UMLAUT: Pcwstr = w("̈")
