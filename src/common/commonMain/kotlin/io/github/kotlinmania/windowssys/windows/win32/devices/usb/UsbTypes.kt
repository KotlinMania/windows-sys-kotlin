package io.github.kotlinmania.windowssys.windows.win32.devices.usb

public typealias PIPE_TYPE = Int

public typealias RAW_PIPE_TYPE = Int

public typealias USBD_ENDPOINT_OFFLOAD_MODE = Int

public typealias USBD_PIPE_TYPE = Int

public typealias USBFN_BUS_SPEED = Int

public typealias USBFN_DEVICE_STATE = Int

public typealias USBFN_DIRECTION = Int

public typealias USBFN_EVENT = Int

public typealias USBFN_PORT_TYPE = Int

public typealias USB_CHANGE_REGISTRATION_HANDLE = Long

public typealias USB_CONNECTION_STATUS = Int

public typealias USB_CONTROLLER_FLAVOR = Int

public typealias USB_DEVICE_SPEED = Int

public typealias USB_DEVICE_TYPE = Int

public typealias USB_HUB_NODE = Int

public typealias USB_HUB_TYPE = Int

public fun interface USB_IDLE_CALLBACKFn {
    public operator fun invoke(context: Long)
}

public typealias USB_IDLE_CALLBACK = USB_IDLE_CALLBACKFn?

public typealias USB_NOTIFICATION_TYPE = Int

public typealias USB_USER_ERROR_CODE = Int

public typealias USB_WMI_DEVICE_NODE_TYPE = Int

public typealias WDMUSB_POWER_STATE = Int

public typealias WINUSB_INTERFACE_HANDLE = Long

public typealias WINUSB_PIPE_POLICY = UInt

public typealias WINUSB_POWER_POLICY = UInt
