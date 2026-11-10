package io.github.kotlinmania.windowssys.windows.win32.ui.input.xboxcontroller

public data class XinputBatteryInformation(
    public var batteryType: BatteryType = 0u,
    public var batteryLevel: BatteryLevel = 0u,
)

public data class XinputCapabilities(
    public var type: XinputDevtype = 0u,
    public var subType: XinputDevsubtype = 0u,
    public var flags: XinputCapabilitiesFlags = 0u,
    public var gamepad: XinputGamepad = XinputGamepad(),
    public var vibration: XinputVibration = XinputVibration(),
)

public data class XinputGamepad(
    public var wButtons: XinputGamepadButtonFlags = 0u,
    public var bLeftTrigger: UByte = 0u,
    public var bRightTrigger: UByte = 0u,
    public var sThumbLX: Short = 0,
    public var sThumbLY: Short = 0,
    public var sThumbRX: Short = 0,
    public var sThumbRY: Short = 0,
)

public data class XinputKeystroke(
    public var virtualKey: XinputVirtualKey = 0u,
    public var unicode: UShort = 0u,
    public var flags: XinputKeystrokeFlags = 0u,
    public var userIndex: UByte = 0u,
    public var hidCode: UByte = 0u,
)

public data class XinputState(
    public var dwPacketNumber: UInt = 0u,
    public var gamepad: XinputGamepad = XinputGamepad(),
)

public data class XinputVibration(
    public var wLeftMotorSpeed: UShort = 0u,
    public var wRightMotorSpeed: UShort = 0u,
)
