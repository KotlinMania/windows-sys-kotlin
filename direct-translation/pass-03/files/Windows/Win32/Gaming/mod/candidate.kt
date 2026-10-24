// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-1.dll, ABI=system, export=CheckGamingPrivilegeSilently; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckGamingPrivilegeSilently`(`privilegeid` : UInt, `scope` : `windows_sys`.`core`.`HSTRING`, `policy` : `windows_sys`.`core`.`HSTRING`, `hasprivilege` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=CheckGamingPrivilegeSilentlyForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckGamingPrivilegeSilentlyForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privilegeid` : UInt, `scope` : `windows_sys`.`core`.`HSTRING`, `policy` : `windows_sys`.`core`.`HSTRING`, `hasprivilege` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-1.dll, ABI=system, export=CheckGamingPrivilegeWithUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckGamingPrivilegeWithUI`(`privilegeid` : UInt, `scope` : `windows_sys`.`core`.`HSTRING`, `policy` : `windows_sys`.`core`.`HSTRING`, `friendlymessage` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=CheckGamingPrivilegeWithUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckGamingPrivilegeWithUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `privilegeid` : UInt, `scope` : `windows_sys`.`core`.`HSTRING`, `policy` : `windows_sys`.`core`.`HSTRING`, `friendlymessage` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-expandedresources-l1-1-0.dll, ABI=system, export=GetExpandedResourceExclusiveCpuCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExpandedResourceExclusiveCpuCount`(`exclusivecpucount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-deviceinformation-l1-1-0.dll, ABI=system, export=GetGamingDeviceModelInformation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGamingDeviceModelInformation`(`information` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GAMING_DEVICE_MODEL_INFORMATION`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-expandedresources-l1-1-0.dll, ABI=system, export=HasExpandedResources; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HasExpandedResources`(`hasexpandedresources` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ProcessPendingGameUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ProcessPendingGameUI`(`waitforcompletion` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-expandedresources-l1-1-0.dll, ABI=system, export=ReleaseExclusiveCpuSets; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleaseExclusiveCpuSets`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ShowChangeFriendRelationshipUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowChangeFriendRelationshipUI`(`targetuserxuid` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=ShowChangeFriendRelationshipUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowChangeFriendRelationshipUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `targetuserxuid` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowCustomizeUserProfileUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowCustomizeUserProfileUI`(`completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowCustomizeUserProfileUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowCustomizeUserProfileUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowFindFriendsUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowFindFriendsUI`(`completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowFindFriendsUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowFindFriendsUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowGameInfoUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInfoUI`(`titleid` : UInt, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowGameInfoUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInfoUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `titleid` : UInt, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ShowGameInviteUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInviteUI`(`serviceconfigurationid` : `windows_sys`.`core`.`HSTRING`, `sessiontemplatename` : `windows_sys`.`core`.`HSTRING`, `sessionid` : `windows_sys`.`core`.`HSTRING`, `invitationdisplaytext` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=ShowGameInviteUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInviteUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceconfigurationid` : `windows_sys`.`core`.`HSTRING`, `sessiontemplatename` : `windows_sys`.`core`.`HSTRING`, `sessionid` : `windows_sys`.`core`.`HSTRING`, `invitationdisplaytext` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-3.dll, ABI=system, export=ShowGameInviteUIWithContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInviteUIWithContext`(`serviceconfigurationid` : `windows_sys`.`core`.`HSTRING`, `sessiontemplatename` : `windows_sys`.`core`.`HSTRING`, `sessionid` : `windows_sys`.`core`.`HSTRING`, `invitationdisplaytext` : `windows_sys`.`core`.`HSTRING`, `customactivationcontext` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-3.dll, ABI=system, export=ShowGameInviteUIWithContextForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowGameInviteUIWithContextForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `serviceconfigurationid` : `windows_sys`.`core`.`HSTRING`, `sessiontemplatename` : `windows_sys`.`core`.`HSTRING`, `sessionid` : `windows_sys`.`core`.`HSTRING`, `invitationdisplaytext` : `windows_sys`.`core`.`HSTRING`, `customactivationcontext` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ShowPlayerPickerUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowPlayerPickerUI`(`promptdisplaytext` : `windows_sys`.`core`.`HSTRING`, `xuids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HSTRING`>?, `xuidscount` : ULong, `preselectedxuids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HSTRING`>?, `preselectedxuidscount` : ULong, `minselectioncount` : ULong, `maxselectioncount` : ULong, `completionroutine` : `PlayerPickerUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=ShowPlayerPickerUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowPlayerPickerUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `promptdisplaytext` : `windows_sys`.`core`.`HSTRING`, `xuids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HSTRING`>?, `xuidscount` : ULong, `preselectedxuids` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HSTRING`>?, `preselectedxuidscount` : ULong, `minselectioncount` : ULong, `maxselectioncount` : ULong, `completionroutine` : `PlayerPickerUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ShowProfileCardUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowProfileCardUI`(`targetuserxuid` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=ShowProfileCardUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowProfileCardUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `targetuserxuid` : `windows_sys`.`core`.`HSTRING`, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=ShowTitleAchievementsUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowTitleAchievementsUI`(`titleid` : UInt, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-2.dll, ABI=system, export=ShowTitleAchievementsUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowTitleAchievementsUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `titleid` : UInt, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowUserSettingsUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowUserSettingsUI`(`completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-4.dll, ABI=system, export=ShowUserSettingsUIForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ShowUserSettingsUIForUser`(`user` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `completionroutine` : `GameUICompletionRoutine`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-gaming-tcui-l1-1-0.dll, ABI=system, export=TryCancelPendingGameUI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `TryCancelPendingGameUI`() : `windows_sys`.`core`.`BOOL`
public const val `GAMESTATS_OPEN_CREATED`: `GAMESTATS_OPEN_RESULT` = 0;
public const val `GAMESTATS_OPEN_OPENED`: `GAMESTATS_OPEN_RESULT` = 1;
public const val `GAMESTATS_OPEN_OPENONLY`: `GAMESTATS_OPEN_TYPE` = 1;
public const val `GAMESTATS_OPEN_OPENORCREATE`: `GAMESTATS_OPEN_TYPE` = 0;
public typealias `GAMESTATS_OPEN_RESULT` = Int;
public typealias `GAMESTATS_OPEN_TYPE` = Int;
public typealias `GAME_INSTALL_SCOPE` = Int;
public typealias `GAMING_DEVICE_DEVICE_ID` = Int;
public const val `GAMING_DEVICE_DEVICE_ID_NONE`: `GAMING_DEVICE_DEVICE_ID` = 0;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE`: `GAMING_DEVICE_DEVICE_ID` = 1988865574;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_S`: `GAMING_DEVICE_DEVICE_ID` = 712204761;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X`: `GAMING_DEVICE_DEVICE_ID` = 1523980231;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_ONE_X_DEVKIT`: `GAMING_DEVICE_DEVICE_ID` = 284675555;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_S`: `GAMING_DEVICE_DEVICE_ID` = 489159355;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X`: `GAMING_DEVICE_DEVICE_ID` = 796540415;
public const val `GAMING_DEVICE_DEVICE_ID_XBOX_SERIES_X_DEVKIT`: `GAMING_DEVICE_DEVICE_ID` = -561359263;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GAMING_DEVICE_MODEL_INFORMATION` (
    public var `vendorId`: `GAMING_DEVICE_VENDOR_ID`,
    public var `deviceId`: `GAMING_DEVICE_DEVICE_ID`,
)
public typealias `GAMING_DEVICE_VENDOR_ID` = Int;
public const val `GAMING_DEVICE_VENDOR_ID_MICROSOFT`: `GAMING_DEVICE_VENDOR_ID` = -1024700366;
public const val `GAMING_DEVICE_VENDOR_ID_NONE`: `GAMING_DEVICE_VENDOR_ID` = 0;
public const val `GIS_ALL_USERS`: `GAME_INSTALL_SCOPE` = 3;
public const val `GIS_CURRENT_USER`: `GAME_INSTALL_SCOPE` = 2;
public const val `GIS_NOT_INSTALLED`: `GAME_INSTALL_SCOPE` = 1;
// UNSUPPORTED Rust 59:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GameExplorer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9a5ea990_3034_4d6f_9128_01f3c61022bc);

// UNSUPPORTED Rust 60:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GameStatistics: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdbc85a2c_c0dc_4961_b6e2_d28b62c11ad4);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GameUICompletionRoutine` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_GDF_THUMBNAIL_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("__GDF_THUMBNAIL");

// UNSUPPORTED Rust 63:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ID_GDF_XML_STR: windows_sys::core::PCWSTR = windows_sys::core::w!("__GDF_XML");

public typealias `KnownGamingPrivileges` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PlayerPickerUICompletionRoutine` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`HRESULT`, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`HSTRING`>?, ULong) -> Unit>>>;
public typealias `XBL_IDP_AUTH_TOKEN_STATUS` = Int;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_LOAD_MSA_ACCOUNT_FAILED`: `XBL_IDP_AUTH_TOKEN_STATUS` = 3;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_MSA_INTERRUPT`: `XBL_IDP_AUTH_TOKEN_STATUS` = 5;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_NO_ACCOUNT_SET`: `XBL_IDP_AUTH_TOKEN_STATUS` = 2;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_NO_CONSENT`: `XBL_IDP_AUTH_TOKEN_STATUS` = 6;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_OFFLINE_SUCCESS`: `XBL_IDP_AUTH_TOKEN_STATUS` = 1;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_SUCCESS`: `XBL_IDP_AUTH_TOKEN_STATUS` = 0;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_UNKNOWN`: `XBL_IDP_AUTH_TOKEN_STATUS` = -1;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_VIEW_NOT_SET`: `XBL_IDP_AUTH_TOKEN_STATUS` = 7;
public const val `XBL_IDP_AUTH_TOKEN_STATUS_XBOX_VETO`: `XBL_IDP_AUTH_TOKEN_STATUS` = 4;
public const val `XPRIVILEGE_ADD_FRIEND`: `KnownGamingPrivileges` = 255;
public const val `XPRIVILEGE_BROADCAST`: `KnownGamingPrivileges` = 190;
public const val `XPRIVILEGE_CLOUD_GAMING_JOIN_SESSION`: `KnownGamingPrivileges` = 208;
public const val `XPRIVILEGE_CLOUD_GAMING_MANAGE_SESSION`: `KnownGamingPrivileges` = 207;
public const val `XPRIVILEGE_CLOUD_SAVED_GAMES`: `KnownGamingPrivileges` = 209;
public const val `XPRIVILEGE_COMMUNICATIONS`: `KnownGamingPrivileges` = 252;
public const val `XPRIVILEGE_COMMUNICATION_VOICE_INGAME`: `KnownGamingPrivileges` = 205;
public const val `XPRIVILEGE_COMMUNICATION_VOICE_SKYPE`: `KnownGamingPrivileges` = 206;
public const val `XPRIVILEGE_GAME_DVR`: `KnownGamingPrivileges` = 198;
public const val `XPRIVILEGE_MULTIPLAYER_PARTIES`: `KnownGamingPrivileges` = 203;
public const val `XPRIVILEGE_MULTIPLAYER_SESSIONS`: `KnownGamingPrivileges` = 254;
public const val `XPRIVILEGE_PREMIUM_CONTENT`: `KnownGamingPrivileges` = 214;
public const val `XPRIVILEGE_PREMIUM_VIDEO`: `KnownGamingPrivileges` = 224;
public const val `XPRIVILEGE_PROFILE_VIEWING`: `KnownGamingPrivileges` = 249;
public const val `XPRIVILEGE_PURCHASE_CONTENT`: `KnownGamingPrivileges` = 245;
public const val `XPRIVILEGE_SHARE_CONTENT`: `KnownGamingPrivileges` = 211;
public const val `XPRIVILEGE_SHARE_KINECT_CONTENT`: `KnownGamingPrivileges` = 199;
public const val `XPRIVILEGE_SOCIAL_NETWORK_SHARING`: `KnownGamingPrivileges` = 220;
public const val `XPRIVILEGE_SUBSCRIPTION_CONTENT`: `KnownGamingPrivileges` = 219;
public const val `XPRIVILEGE_USER_CREATED_CONTENT`: `KnownGamingPrivileges` = 247;
public const val `XPRIVILEGE_VIDEO_COMMUNICATIONS`: `KnownGamingPrivileges` = 235;
public const val `XPRIVILEGE_VIEW_FRIENDS_LIST`: `KnownGamingPrivileges` = 197;
// UNSUPPORTED Rust 98:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const XblIdpAuthManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xce23534b_56d8_4978_86a2_7ee570640468);

// UNSUPPORTED Rust 99:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const XblIdpAuthTokenResult: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x9f493441_744a_410c_ae2b_9a22f7c7731f);

