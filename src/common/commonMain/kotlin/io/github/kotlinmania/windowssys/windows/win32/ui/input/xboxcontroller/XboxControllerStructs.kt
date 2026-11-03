package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

public data class XINPUT_BATTERY_INFORMATION(public var BatteryType: BATTERY_TYPE = 0u, public var BatteryLevel: BATTERY_LEVEL = 0u)

public data class XINPUT_CAPABILITIES(
    public var Type: XINPUT_DEVTYPE = 0u,
    public var SubType: XINPUT_DEVSUBTYPE = 0u,
    public var Flags: XINPUT_CAPABILITIES_FLAGS = 0u,
    public var Gamepad: XINPUT_GAMEPAD = XINPUT_GAMEPAD(),
    public var Vibration: XINPUT_VIBRATION = XINPUT_VIBRATION(),
)

public data class XINPUT_GAMEPAD(
    public var wButtons: XINPUT_GAMEPAD_BUTTON_FLAGS = 0u,
    public var bLeftTrigger: UByte = 0u,
    public var bRightTrigger: UByte = 0u,
    public var sThumbLX: Short = 0,
    public var sThumbLY: Short = 0,
    public var sThumbRX: Short = 0,
    public var sThumbRY: Short = 0,
)

public data class XINPUT_KEYSTROKE(
    public var VirtualKey: XINPUT_VIRTUAL_KEY = 0u,
    public var Unicode: UShort = 0u,
    public var Flags: XINPUT_KEYSTROKE_FLAGS = 0u,
    public var UserIndex: UByte = 0u,
    public var HidCode: UByte = 0u,
)

public data class XINPUT_STATE(public var dwPacketNumber: UInt = 0u, public var Gamepad: XINPUT_GAMEPAD = XINPUT_GAMEPAD())

public data class XINPUT_VIBRATION(public var wLeftMotorSpeed: UShort = 0u, public var wRightMotorSpeed: UShort = 0u)
