package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias PrjCallbackDataFlags = Int

public fun interface PrjCancelCommandCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?)
}

public typealias PrjCancelCommandCb = PrjCancelCommandCbFn?

public typealias PrjCompleteCommandType = Int

public typealias PrjDirEntryBufferHandle = COpaquePointer?

public fun interface PrjEndDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?, enumerationid: COpaquePointer?): Hresult
}

public typealias PrjEndDirectoryEnumerationCb = PrjEndDirectoryEnumerationCbFn?

public typealias PrjExtInfoType = Int

public typealias PrjFileState = Int

public fun interface PrjGetDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?, enumerationid: COpaquePointer?, searchexpression: Pcwstr, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult
}

public typealias PrjGetDirectoryEnumerationCb = PrjGetDirectoryEnumerationCbFn?

public fun interface PrjGetFileDataCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?, byteoffset: ULong, length: UInt): Hresult
}

public typealias PrjGetFileDataCb = PrjGetFileDataCbFn?

public fun interface PrjGetPlaceholderInfoCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?): Hresult
}

public typealias PrjGetPlaceholderInfoCb = PrjGetPlaceholderInfoCbFn?

public typealias PrjNamespaceVirtualizationContext = COpaquePointer?

public typealias PrjNotification = Int

public fun interface PrjNotificationCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?, isdirectory: Boolean, notification: PrjNotification, destinationfilename: Pcwstr, operationparameters: COpaquePointer?): Hresult
}

public typealias PrjNotificationCb = PrjNotificationCbFn?

public typealias PrjNotifyTypes = UInt

public typealias PrjPlaceholderId = Int

public fun interface PrjQueryFileNameCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?): Hresult
}

public typealias PrjQueryFileNameCb = PrjQueryFileNameCbFn?

public typealias PrjStartvirtualizingFlags = Int

public fun interface PrjStartDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: COpaquePointer?, enumerationid: COpaquePointer?): Hresult
}

public typealias PrjStartDirectoryEnumerationCb = PrjStartDirectoryEnumerationCbFn?

public typealias PrjUpdateFailureCauses = Int

public typealias PrjUpdateTypes = Int
