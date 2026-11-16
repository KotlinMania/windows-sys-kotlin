package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr

public fun interface CfCallbackFn {
    public operator fun invoke(callbackinfo: ConstPtr, callbackparameters: ConstPtr)
}

public typealias CfCallback = CfCallbackFn?

public typealias CfCallbackCancelFlags = Int

public typealias CfCallbackCloseCompletionFlags = Int

public typealias CfCallbackDehydrateCompletionFlags = Int

public typealias CfCallbackDehydrateFlags = Int

public typealias CfCallbackDehydrationReason = Int

public typealias CfCallbackDeleteCompletionFlags = Int

public typealias CfCallbackDeleteFlags = Int

public typealias CfCallbackFetchDataFlags = Int

public typealias CfCallbackFetchPlaceholdersFlags = Int

public typealias CfCallbackOpenCompletionFlags = Int

public typealias CfCallbackRenameCompletionFlags = Int

public typealias CfCallbackRenameFlags = Int

public typealias CfCallbackType = Int

public typealias CfCallbackValidateDataFlags = Int

public typealias CfConnectionKey = Long

public typealias CfConnectFlags = Int

public typealias CfConvertFlags = Int

public typealias CfCreateFlags = Int

public typealias CfDehydrateFlags = Int

public typealias CfHardlinkPolicy = Int

public typealias CfHydrateFlags = Int

public typealias CfHydrationPolicyModifier = UShort

public typealias CfHydrationPolicyPrimary = UShort

public typealias CfInsyncPolicy = UInt

public typealias CfInSyncState = Int

public typealias CfOpenFileFlags = Int

public typealias CfOperationAckDataFlags = Int

public typealias CfOperationAckDehydrateFlags = Int

public typealias CfOperationAckDeleteFlags = Int

public typealias CfOperationAckRenameFlags = Int

public typealias CfOperationRestartHydrationFlags = Int

public typealias CfOperationRetrieveDataFlags = Int

public typealias CfOperationTransferDataFlags = Int

public typealias CfOperationTransferPlaceholdersFlags = Int

public typealias CfOperationType = Int

public typealias CfPinState = Int

public typealias CfPlaceholderCreateFlags = Int

public typealias CfPlaceholderInfoClass = Int

public typealias CfPlaceholderManagementPolicy = Int

public typealias CfPlaceholderRangeInfoClass = Int

public typealias CfPlaceholderState = UInt

public typealias CfPopulationPolicyModifier = UShort

public typealias CfPopulationPolicyPrimary = UShort

public typealias CfRegisterFlags = Int

public typealias CfRevertFlags = Int

public typealias CfSetInSyncFlags = Int

public typealias CfSetPinFlags = Int

public typealias CfSyncProviderStatus = UInt

public typealias CfSyncRootInfoClass = Int

public typealias CfUpdateFlags = Int
