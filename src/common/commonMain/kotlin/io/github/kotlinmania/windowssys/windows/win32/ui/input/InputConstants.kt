package io.github.kotlinmania.windowssys.windows.win32.ui.input

public val IMDT_KEYBOARD: InputMessageDeviceType = 1

public val IMDT_MOUSE: InputMessageDeviceType = 2

public val IMDT_PEN: InputMessageDeviceType = 8

public val IMDT_TOUCH: InputMessageDeviceType = 4

public val IMDT_TOUCHPAD: InputMessageDeviceType = 16

public val IMDT_UNAVAILABLE: InputMessageDeviceType = 0

public val IMO_HARDWARE: InputMessageOriginId = 1

public val IMO_INJECTED: InputMessageOriginId = 2

public val IMO_SYSTEM: InputMessageOriginId = 4

public val IMO_UNAVAILABLE: InputMessageOriginId = 0

public val MOUSE_ATTRIBUTES_CHANGED: MouseState = 4u.toUShort()

public val MOUSE_MOVE_ABSOLUTE: MouseState = 1u.toUShort()

public val MOUSE_MOVE_NOCOALESCE: MouseState = 8u.toUShort()

public val MOUSE_MOVE_RELATIVE: MouseState = 0u.toUShort()

public val MOUSE_VIRTUAL_DESKTOP: MouseState = 2u.toUShort()

public val RIDEV_APPKEYS: RawinputdeviceFlags = 1024u

public val RIDEV_CAPTUREMOUSE: RawinputdeviceFlags = 512u

public val RIDEV_DEVNOTIFY: RawinputdeviceFlags = 8192u

public val RIDEV_EXCLUDE: RawinputdeviceFlags = 16u

public val RIDEV_EXINPUTSINK: RawinputdeviceFlags = 4096u

public val RIDEV_INPUTSINK: RawinputdeviceFlags = 256u

public val RIDEV_NOHOTKEYS: RawinputdeviceFlags = 512u

public val RIDEV_NOLEGACY: RawinputdeviceFlags = 48u

public val RIDEV_PAGEONLY: RawinputdeviceFlags = 32u

public val RIDEV_REMOVE: RawinputdeviceFlags = 1u

public val RIDI_DEVICEINFO: RawInputDeviceInfoCommand = 536870923u

public val RIDI_DEVICENAME: RawInputDeviceInfoCommand = 536870919u

public val RIDI_PREPARSEDDATA: RawInputDeviceInfoCommand = 536870917u

public val RID_HEADER: RawInputDataCommandFlags = 268435461u

public val RID_INPUT: RawInputDataCommandFlags = 268435459u

public val RIM_TYPEHID: RidDeviceInfoType = 2u

public val RIM_TYPEKEYBOARD: RidDeviceInfoType = 1u

public val RIM_TYPEMOUSE: RidDeviceInfoType = 0u
