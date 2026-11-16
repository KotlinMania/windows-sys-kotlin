package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val BATTERY_DEVTYPE_GAMEPAD: BatteryDevtype = 0u.toUByte()

public val BATTERY_DEVTYPE_HEADSET: BatteryDevtype = 1u.toUByte()

public val BATTERY_LEVEL_EMPTY: BatteryLevel = 0u.toUByte()

public val BATTERY_LEVEL_FULL: BatteryLevel = 3u.toUByte()

public val BATTERY_LEVEL_LOW: BatteryLevel = 1u.toUByte()

public val BATTERY_LEVEL_MEDIUM: BatteryLevel = 2u.toUByte()

public val BATTERY_TYPE_ALKALINE: BatteryType = 2u.toUByte()

public val BATTERY_TYPE_DISCONNECTED: BatteryType = 0u.toUByte()

public val BATTERY_TYPE_NIMH: BatteryType = 3u.toUByte()

public val BATTERY_TYPE_UNKNOWN: BatteryType = 255u.toUByte()

public val BATTERY_TYPE_WIRED: BatteryType = 1u.toUByte()

public val VK_PAD_A: XinputVirtualKey = 22528u.toUShort()

public val VK_PAD_B: XinputVirtualKey = 22529u.toUShort()

public val VK_PAD_BACK: XinputVirtualKey = 22549u.toUShort()

public val VK_PAD_DPAD_DOWN: XinputVirtualKey = 22545u.toUShort()

public val VK_PAD_DPAD_LEFT: XinputVirtualKey = 22546u.toUShort()

public val VK_PAD_DPAD_RIGHT: XinputVirtualKey = 22547u.toUShort()

public val VK_PAD_DPAD_UP: XinputVirtualKey = 22544u.toUShort()

public val VK_PAD_LSHOULDER: XinputVirtualKey = 22533u.toUShort()

public val VK_PAD_LTHUMB_DOWN: XinputVirtualKey = 22561u.toUShort()

public val VK_PAD_LTHUMB_DOWNLEFT: XinputVirtualKey = 22567u.toUShort()

public val VK_PAD_LTHUMB_DOWNRIGHT: XinputVirtualKey = 22566u.toUShort()

public val VK_PAD_LTHUMB_LEFT: XinputVirtualKey = 22563u.toUShort()

public val VK_PAD_LTHUMB_PRESS: XinputVirtualKey = 22550u.toUShort()

public val VK_PAD_LTHUMB_RIGHT: XinputVirtualKey = 22562u.toUShort()

public val VK_PAD_LTHUMB_UP: XinputVirtualKey = 22560u.toUShort()

public val VK_PAD_LTHUMB_UPLEFT: XinputVirtualKey = 22564u.toUShort()

public val VK_PAD_LTHUMB_UPRIGHT: XinputVirtualKey = 22565u.toUShort()

public val VK_PAD_LTRIGGER: XinputVirtualKey = 22534u.toUShort()

public val VK_PAD_RSHOULDER: XinputVirtualKey = 22532u.toUShort()

public val VK_PAD_RTHUMB_DOWN: XinputVirtualKey = 22577u.toUShort()

public val VK_PAD_RTHUMB_DOWNLEFT: XinputVirtualKey = 22583u.toUShort()

public val VK_PAD_RTHUMB_DOWNRIGHT: XinputVirtualKey = 22582u.toUShort()

public val VK_PAD_RTHUMB_LEFT: XinputVirtualKey = 22579u.toUShort()

public val VK_PAD_RTHUMB_PRESS: XinputVirtualKey = 22551u.toUShort()

public val VK_PAD_RTHUMB_RIGHT: XinputVirtualKey = 22578u.toUShort()

public val VK_PAD_RTHUMB_UP: XinputVirtualKey = 22576u.toUShort()

public val VK_PAD_RTHUMB_UPLEFT: XinputVirtualKey = 22580u.toUShort()

public val VK_PAD_RTHUMB_UPRIGHT: XinputVirtualKey = 22581u.toUShort()

public val VK_PAD_RTRIGGER: XinputVirtualKey = 22535u.toUShort()

public val VK_PAD_START: XinputVirtualKey = 22548u.toUShort()

public val VK_PAD_X: XinputVirtualKey = 22530u.toUShort()

public val VK_PAD_Y: XinputVirtualKey = 22531u.toUShort()

public val XINPUT_CAPS_FFB_SUPPORTED: XinputCapabilitiesFlags = 1u.toUShort()

public val XINPUT_CAPS_NO_NAVIGATION: XinputCapabilitiesFlags = 16u.toUShort()

public val XINPUT_CAPS_PMD_SUPPORTED: XinputCapabilitiesFlags = 8u.toUShort()

public val XINPUT_CAPS_VOICE_SUPPORTED: XinputCapabilitiesFlags = 4u.toUShort()

public val XINPUT_CAPS_WIRELESS: XinputCapabilitiesFlags = 2u.toUShort()

public val XINPUT_DEVSUBTYPE_ARCADE_PAD: XinputDevsubtype = 19u.toUByte()

public val XINPUT_DEVSUBTYPE_ARCADE_STICK: XinputDevsubtype = 3u.toUByte()

public val XINPUT_DEVSUBTYPE_DANCE_PAD: XinputDevsubtype = 5u.toUByte()

public val XINPUT_DEVSUBTYPE_DRUM_KIT: XinputDevsubtype = 8u.toUByte()

public val XINPUT_DEVSUBTYPE_FLIGHT_STICK: XinputDevsubtype = 4u.toUByte()

public val XINPUT_DEVSUBTYPE_GAMEPAD: XinputDevsubtype = 1u.toUByte()

public val XINPUT_DEVSUBTYPE_GUITAR: XinputDevsubtype = 6u.toUByte()

public val XINPUT_DEVSUBTYPE_GUITAR_ALTERNATE: XinputDevsubtype = 7u.toUByte()

public val XINPUT_DEVSUBTYPE_GUITAR_BASS: XinputDevsubtype = 11u.toUByte()

public val XINPUT_DEVSUBTYPE_UNKNOWN: XinputDevsubtype = 0u.toUByte()

public val XINPUT_DEVSUBTYPE_WHEEL: XinputDevsubtype = 2u.toUByte()

public val XINPUT_DEVTYPE_GAMEPAD: XinputDevtype = 1u.toUByte()

public val XINPUT_DLL: Pcwstr = w("xinput1_4.dll")

public val XINPUT_DLL_A: Pcstr = s("xinput1_4.dll")

public val XINPUT_DLL_W: Pcwstr = w("xinput1_4.dll")

public val XINPUT_FLAG_ALL: XinputFlag = 0u

public val XINPUT_FLAG_GAMEPAD: XinputFlag = 1u

public val XINPUT_GAMEPAD_A: XinputGamepadButtonFlags = 4096u.toUShort()

public val XINPUT_GAMEPAD_B: XinputGamepadButtonFlags = 8192u.toUShort()

public val XINPUT_GAMEPAD_BACK: XinputGamepadButtonFlags = 32u.toUShort()

public val XINPUT_GAMEPAD_DPAD_DOWN: XinputGamepadButtonFlags = 2u.toUShort()

public val XINPUT_GAMEPAD_DPAD_LEFT: XinputGamepadButtonFlags = 4u.toUShort()

public val XINPUT_GAMEPAD_DPAD_RIGHT: XinputGamepadButtonFlags = 8u.toUShort()

public val XINPUT_GAMEPAD_DPAD_UP: XinputGamepadButtonFlags = 1u.toUShort()

public val XINPUT_GAMEPAD_LEFT_SHOULDER: XinputGamepadButtonFlags = 256u.toUShort()

public val XINPUT_GAMEPAD_LEFT_THUMB: XinputGamepadButtonFlags = 64u.toUShort()

public val XINPUT_GAMEPAD_LEFT_THUMB_DEADZONE: XinputGamepadButtonFlags = 7849u.toUShort()

public val XINPUT_GAMEPAD_RIGHT_SHOULDER: XinputGamepadButtonFlags = 512u.toUShort()

public val XINPUT_GAMEPAD_RIGHT_THUMB: XinputGamepadButtonFlags = 128u.toUShort()

public val XINPUT_GAMEPAD_RIGHT_THUMB_DEADZONE: XinputGamepadButtonFlags = 8689u.toUShort()

public val XINPUT_GAMEPAD_START: XinputGamepadButtonFlags = 16u.toUShort()

public val XINPUT_GAMEPAD_TRIGGER_THRESHOLD: XinputGamepadButtonFlags = 30u.toUShort()

public val XINPUT_GAMEPAD_X: XinputGamepadButtonFlags = 16384u.toUShort()

public val XINPUT_GAMEPAD_Y: XinputGamepadButtonFlags = 32768u.toUShort()

public val XINPUT_KEYSTROKE_KEYDOWN: XinputKeystrokeFlags = 1u.toUShort()

public val XINPUT_KEYSTROKE_KEYUP: XinputKeystrokeFlags = 2u.toUShort()

public val XINPUT_KEYSTROKE_REPEAT: XinputKeystrokeFlags = 4u.toUShort()

public val XUSER_INDEX_ANY: UInt = 255u

public val XUSER_MAX_COUNT: UInt = 4u
