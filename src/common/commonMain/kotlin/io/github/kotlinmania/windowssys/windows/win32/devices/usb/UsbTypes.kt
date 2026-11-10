package io.github.kotlinmania.windowssys.windows.win32.devices.usb

import io.github.kotlinmania.windowssys.COpaquePointer

public typealias PipeType = Int

public typealias RawPipeType = Int

public typealias UsbdEndpointOffloadMode = Int

public typealias UsbdPipeType = Int

public typealias UsbfnBusSpeed = Int

public typealias UsbfnDeviceState = Int

public typealias UsbfnDirection = Int

public typealias UsbfnEvent = Int

public typealias UsbfnPortType = Int

public typealias UsbChangeRegistrationHandle = COpaquePointer?

public typealias UsbConnectionStatus = Int

public typealias UsbControllerFlavor = Int

public typealias UsbDeviceSpeed = Int

public typealias UsbDeviceType = Int

public typealias UsbHubNode = Int

public typealias UsbHubType = Int

public fun interface UsbIdleCallbackFn {
    public operator fun invoke(context: COpaquePointer?)
}

public typealias UsbIdleCallback = UsbIdleCallbackFn?

public typealias UsbNotificationType = Int

public typealias UsbUserErrorCode = Int

public typealias UsbWmiDeviceNodeType = Int

public typealias WdmusbPowerState = Int

public typealias WinusbInterfaceHandle = COpaquePointer?

public typealias WinusbPipePolicy = UInt

public typealias WinusbPowerPolicy = UInt
