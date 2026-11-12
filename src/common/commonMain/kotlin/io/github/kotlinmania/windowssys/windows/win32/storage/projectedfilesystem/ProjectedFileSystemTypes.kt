package io.github.kotlinmania.windowssys.windows.win32.storage.projectedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public typealias PrjCallbackDataFlags = Int

public fun interface PrjCancelCommandCbFn {
    public operator fun invoke(callbackdata: ConstPtr)
}

public typealias PrjCancelCommandCb = PrjCancelCommandCbFn?

public typealias PrjCompleteCommandType = Int

public typealias PrjDirEntryBufferHandle = MutPtr

public fun interface PrjEndDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: ConstPtr, enumerationid: ConstPtr): Hresult
}

public typealias PrjEndDirectoryEnumerationCb = PrjEndDirectoryEnumerationCbFn?

public typealias PrjExtInfoType = Int

public typealias PrjFileState = Int

public fun interface PrjGetDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: ConstPtr, enumerationid: ConstPtr, searchexpression: Pcwstr, direntrybufferhandle: PrjDirEntryBufferHandle): Hresult
}

public typealias PrjGetDirectoryEnumerationCb = PrjGetDirectoryEnumerationCbFn?

public fun interface PrjGetFileDataCbFn {
    public operator fun invoke(callbackdata: ConstPtr, byteoffset: ULong, length: UInt): Hresult
}

public typealias PrjGetFileDataCb = PrjGetFileDataCbFn?

public fun interface PrjGetPlaceholderInfoCbFn {
    public operator fun invoke(callbackdata: ConstPtr): Hresult
}

public typealias PrjGetPlaceholderInfoCb = PrjGetPlaceholderInfoCbFn?

public typealias PrjNamespaceVirtualizationContext = MutPtr

public typealias PrjNotification = Int

public fun interface PrjNotificationCbFn {
    public operator fun invoke(callbackdata: ConstPtr, isdirectory: Boolean, notification: PrjNotification, destinationfilename: Pcwstr, operationparameters: MutPtr): Hresult
}

public typealias PrjNotificationCb = PrjNotificationCbFn?

public typealias PrjNotifyTypes = UInt

public typealias PrjPlaceholderId = Int

public fun interface PrjQueryFileNameCbFn {
    public operator fun invoke(callbackdata: ConstPtr): Hresult
}

public typealias PrjQueryFileNameCb = PrjQueryFileNameCbFn?

public typealias PrjStartvirtualizingFlags = Int

public fun interface PrjStartDirectoryEnumerationCbFn {
    public operator fun invoke(callbackdata: ConstPtr, enumerationid: ConstPtr): Hresult
}

public typealias PrjStartDirectoryEnumerationCb = PrjStartDirectoryEnumerationCbFn?

public typealias PrjUpdateFailureCauses = Int

public typealias PrjUpdateTypes = Int
