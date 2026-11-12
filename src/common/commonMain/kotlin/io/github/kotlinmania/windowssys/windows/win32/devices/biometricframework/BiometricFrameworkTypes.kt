package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public fun interface PibioEngineAcceptPrivateSensorTypeInfoFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, typeinfobufferaddress: ConstPtr<UByte>, typeinfobuffersize: ULong): Hresult
}

public typealias PibioEngineAcceptPrivateSensorTypeInfoFn = PibioEngineAcceptPrivateSensorTypeInfoFnFn?

public fun interface PibioEngineAcceptSampleDataFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, samplebuffer: ConstPtr<WinbioBir>, samplesize: ULong, purpose: UByte, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioEngineAcceptSampleDataFn = PibioEngineAcceptSampleDataFnFn?

public fun interface PibioEngineActivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineActivateFn = PibioEngineActivateFnFn?

public fun interface PibioEngineAttachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineAttachFn = PibioEngineAttachFnFn?

public fun interface PibioEngineCheckForDuplicateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, duplicate: MutPtr<Boolean>): Hresult
}

public typealias PibioEngineCheckForDuplicateFn = PibioEngineCheckForDuplicateFnFn?

public fun interface PibioEngineClearContextFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineClearContextFn = PibioEngineClearContextFnFn?

public fun interface PibioEngineCommitEnrollmentFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, payloadblob: ConstPtr<UByte>, payloadblobsize: ULong): Hresult
}

public typealias PibioEngineCommitEnrollmentFn = PibioEngineCommitEnrollmentFnFn?

public fun interface PibioEngineControlUnitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioEngineControlUnitFn = PibioEngineControlUnitFnFn?

public fun interface PibioEngineControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioEngineControlUnitPrivilegedFn = PibioEngineControlUnitPrivilegedFnFn?

public fun interface PibioEngineCreateEnrollmentAuthenticatedFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, nonce: MutPtr<MutPtr<UByte>>, noncesize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineCreateEnrollmentAuthenticatedFn = PibioEngineCreateEnrollmentAuthenticatedFnFn?

public fun interface PibioEngineCreateEnrollmentFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineCreateEnrollmentFn = PibioEngineCreateEnrollmentFnFn?

public fun interface PibioEngineCreateKeyFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, key: ConstPtr<UByte>, keysize: ULong, keyidentifier: MutPtr<UByte>, keyidentifiersize: ULong, resultsize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineCreateKeyFn = PibioEngineCreateKeyFnFn?

public fun interface PibioEngineDeactivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineDeactivateFn = PibioEngineDeactivateFnFn?

public fun interface PibioEngineDetachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineDetachFn = PibioEngineDetachFnFn?

public fun interface PibioEngineDiscardEnrollmentFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineDiscardEnrollmentFn = PibioEngineDiscardEnrollmentFnFn?

public fun interface PibioEngineExportEngineDataFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, flags: UByte, samplebuffer: MutPtr<MutPtr<WinbioBir>>, samplesize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineExportEngineDataFn = PibioEngineExportEngineDataFnFn?

public fun interface PibioEngineGetEnrollmentHashFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, hashvalue: MutPtr<MutPtr<UByte>>, hashsize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineGetEnrollmentHashFn = PibioEngineGetEnrollmentHashFnFn?

public fun interface PibioEngineGetEnrollmentStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioEngineGetEnrollmentStatusFn = PibioEngineGetEnrollmentStatusFnFn?

public fun interface PibioEngineIdentifyAllFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, presencecount: MutPtr<ULong>, presencearray: MutPtr<MutPtr<WinbioPresence>>): Hresult
}

public typealias PibioEngineIdentifyAllFn = PibioEngineIdentifyAllFnFn?

public fun interface PibioEngineIdentifyFeatureSetAuthenticatedFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, nonce: ConstPtr<UByte>, noncesize: ULong, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, rejectdetail: MutPtr<UInt>, authentication: MutPtr<MutPtr<UByte>>, authenticationsize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineIdentifyFeatureSetAuthenticatedFn = PibioEngineIdentifyFeatureSetAuthenticatedFnFn?

public fun interface PibioEngineIdentifyFeatureSetFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, payloadblob: MutPtr<MutPtr<UByte>>, payloadblobsize: MutPtr<ULong>, hashvalue: MutPtr<MutPtr<UByte>>, hashsize: MutPtr<ULong>, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioEngineIdentifyFeatureSetFn = PibioEngineIdentifyFeatureSetFnFn?

public fun interface PibioEngineIdentifyFeatureSetSecureFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, nonce: ConstPtr<UByte>, noncesize: ULong, keyidentifier: ConstPtr<UByte>, keyidentifiersize: ULong, identity: MutPtr<WinbioIdentity>, subfactor: MutPtr<UByte>, rejectdetail: MutPtr<UInt>, authorization: MutPtr<MutPtr<UByte>>, authorizationsize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineIdentifyFeatureSetSecureFn = PibioEngineIdentifyFeatureSetSecureFnFn?

public fun interface PibioEngineNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, powereventtype: UInt): Hresult
}

public typealias PibioEngineNotifyPowerChangeFn = PibioEngineNotifyPowerChangeFnFn?

public fun interface PibioEnginePipelineCleanupFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEnginePipelineCleanupFn = PibioEnginePipelineCleanupFnFn?

public fun interface PibioEnginePipelineInitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEnginePipelineInitFn = PibioEnginePipelineInitFnFn?

public fun interface PibioEngineQueryCalibrationDataFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, discardandrepeatcapture: MutPtr<Boolean>, calibrationbuffer: MutPtr<UByte>, calibrationbuffersize: MutPtr<ULong>, maxbuffersize: ULong): Hresult
}

public typealias PibioEngineQueryCalibrationDataFn = PibioEngineQueryCalibrationDataFnFn?

public fun interface PibioEngineQueryExtendedEnrollmentStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, enrollmentstatus: MutPtr<WinbioExtendedEnrollmentStatus>, enrollmentstatussize: ULong): Hresult
}

public typealias PibioEngineQueryExtendedEnrollmentStatusFn = PibioEngineQueryExtendedEnrollmentStatusFnFn?

public fun interface PibioEngineQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, engineinfo: MutPtr<WinbioExtendedEngineInfo>, engineinfosize: ULong): Hresult
}

public typealias PibioEngineQueryExtendedInfoFn = PibioEngineQueryExtendedInfoFnFn?

public fun interface PibioEngineQueryHashAlgorithmsFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, algorithmcount: MutPtr<ULong>, algorithmbuffersize: MutPtr<ULong>, algorithmbuffer: MutPtr<MutPtr<UByte>>): Hresult
}

public typealias PibioEngineQueryHashAlgorithmsFn = PibioEngineQueryHashAlgorithmsFnFn?

public fun interface PibioEngineQueryIndexVectorSizeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, indexelementcount: MutPtr<ULong>): Hresult
}

public typealias PibioEngineQueryIndexVectorSizeFn = PibioEngineQueryIndexVectorSizeFnFn?

public fun interface PibioEngineQueryPreferredFormatFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, standardformat: MutPtr<WinbioRegisteredFormat>, vendorformat: MutPtr<Guid>): Hresult
}

public typealias PibioEngineQueryPreferredFormatFn = PibioEngineQueryPreferredFormatFnFn?

public fun interface PibioEngineQuerySampleHintFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, samplehint: MutPtr<ULong>): Hresult
}

public typealias PibioEngineQuerySampleHintFn = PibioEngineQuerySampleHintFnFn?

public fun interface PibioEngineRefreshCacheFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioEngineRefreshCacheFn = PibioEngineRefreshCacheFnFn?

public fun interface PibioEngineReserved1FnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: MutPtr<WinbioIdentity>): Hresult
}

public typealias PibioEngineReserved1Fn = PibioEngineReserved1FnFn?

public fun interface PibioEngineSelectCalibrationFormatFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, formatarray: ConstPtr<Guid>, formatcount: ULong, selectedformat: MutPtr<Guid>, maxbuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioEngineSelectCalibrationFormatFn = PibioEngineSelectCalibrationFormatFnFn?

public fun interface PibioEngineSetAccountPolicyFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, policyitemarray: ConstPtr<WinbioAccountPolicy>, policyitemcount: ULong): Hresult
}

public typealias PibioEngineSetAccountPolicyFn = PibioEngineSetAccountPolicyFnFn?

public fun interface PibioEngineSetEnrollmentParametersFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, parameters: ConstPtr<WinbioExtendedEnrollmentParameters>): Hresult
}

public typealias PibioEngineSetEnrollmentParametersFn = PibioEngineSetEnrollmentParametersFnFn?

public fun interface PibioEngineSetEnrollmentSelectorFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, selectorvalue: ULong): Hresult
}

public typealias PibioEngineSetEnrollmentSelectorFn = PibioEngineSetEnrollmentSelectorFnFn?

public fun interface PibioEngineSetHashAlgorithmFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, algorithmbuffersize: ULong, algorithmbuffer: ConstPtr<UByte>): Hresult
}

public typealias PibioEngineSetHashAlgorithmFn = PibioEngineSetHashAlgorithmFnFn?

public fun interface PibioEngineUpdateEnrollmentFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioEngineUpdateEnrollmentFn = PibioEngineUpdateEnrollmentFnFn?

public fun interface PibioEngineVerifyFeatureSetFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, match: MutPtr<Boolean>, payloadblob: MutPtr<MutPtr<UByte>>, payloadblobsize: MutPtr<ULong>, hashvalue: MutPtr<MutPtr<UByte>>, hashsize: MutPtr<ULong>, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioEngineVerifyFeatureSetFn = PibioEngineVerifyFeatureSetFnFn?

public fun interface PibioFrameworkAllocateMemoryFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, allocationsize: ULong, address: MutPtr<MutPtr<CVoid>>): Hresult
}

public typealias PibioFrameworkAllocateMemoryFn = PibioFrameworkAllocateMemoryFnFn?

public fun interface PibioFrameworkFreeMemoryFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, address: ConstPtr<CVoid>): Hresult
}

public typealias PibioFrameworkFreeMemoryFn = PibioFrameworkFreeMemoryFnFn?

public fun interface PibioFrameworkGetPropertyFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, propertytype: UInt, propertyid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, propertybuffer: MutPtr<MutPtr<CVoid>>, propertybuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioFrameworkGetPropertyFn = PibioFrameworkGetPropertyFnFn?

public fun interface PibioFrameworkLockAndValidateSecureBufferFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, securebufferidentifier: Guid, securebufferaddress: MutPtr<MutPtr<CVoid>>, securebuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioFrameworkLockAndValidateSecureBufferFn = PibioFrameworkLockAndValidateSecureBufferFnFn?

public fun interface PibioFrameworkReleaseSecureBufferFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, securebufferidentifier: Guid): Hresult
}

public typealias PibioFrameworkReleaseSecureBufferFn = PibioFrameworkReleaseSecureBufferFnFn?

public fun interface PibioFrameworkSetUnitStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, extendedstatus: ConstPtr<WinbioExtendedUnitStatus>, extendedstatussize: ULong): Hresult
}

public typealias PibioFrameworkSetUnitStatusFn = PibioFrameworkSetUnitStatusFnFn?

public fun interface PibioFrameworkVsmCacheClearFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioFrameworkVsmCacheClearFn = PibioFrameworkVsmCacheClearFnFn?

public fun interface PibioFrameworkVsmCacheExportBeginFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, requiredcapacity: MutPtr<ULong>, maxbuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioFrameworkVsmCacheExportBeginFn = PibioFrameworkVsmCacheExportBeginFnFn?

public fun interface PibioFrameworkVsmCacheExportEndFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioFrameworkVsmCacheExportEndFn = PibioFrameworkVsmCacheExportEndFnFn?

public fun interface PibioFrameworkVsmCacheExportNextFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, bufferaddress: MutPtr<UByte>, buffersize: ULong, returneddatasize: MutPtr<ULong>): Hresult
}

public typealias PibioFrameworkVsmCacheExportNextFn = PibioFrameworkVsmCacheExportNextFnFn?

public fun interface PibioFrameworkVsmCacheImportBeginFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, requiredcapacity: ULong, maxbuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioFrameworkVsmCacheImportBeginFn = PibioFrameworkVsmCacheImportBeginFnFn?

public fun interface PibioFrameworkVsmCacheImportEndFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioFrameworkVsmCacheImportEndFn = PibioFrameworkVsmCacheImportEndFnFn?

public fun interface PibioFrameworkVsmCacheImportNextFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, bufferaddress: ConstPtr<UByte>, buffersize: ULong): Hresult
}

public typealias PibioFrameworkVsmCacheImportNextFn = PibioFrameworkVsmCacheImportNextFnFn?

public fun interface PibioFrameworkVsmDecryptSampleFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, authentication: ConstPtr<UByte>, authenticationsize: ULong, iv: ConstPtr<UByte>, ivsize: ULong, encrypteddata: MutPtr<UByte>, encrypteddatasize: ULong): Hresult
}

public typealias PibioFrameworkVsmDecryptSampleFn = PibioFrameworkVsmDecryptSampleFnFn?

public fun interface PibioFrameworkVsmQueryAuthorizedEnrollmentsFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, secureidentitycount: MutPtr<ULong>, secureidentities: MutPtr<MutPtr<WinbioIdentity>>): Hresult
}

public typealias PibioFrameworkVsmQueryAuthorizedEnrollmentsFn = PibioFrameworkVsmQueryAuthorizedEnrollmentsFnFn?

public fun interface PibioFrameworkVsmStorageReserved1FnFn {
    public operator fun invoke(pipeline: ConstPtr<WinbioPipeline>, reserved1: ULong, reserved2: ConstPtr<ULong>): Hresult
}

public typealias PibioFrameworkVsmStorageReserved1Fn = PibioFrameworkVsmStorageReserved1FnFn?

public fun interface PibioFrameworkVsmStorageReserved2FnFn {
    public operator fun invoke(pipeline: ConstPtr<WinbioPipeline>, reserved1: ConstPtr<UByte>, reserved2: ULong): Hresult
}

public typealias PibioFrameworkVsmStorageReserved2Fn = PibioFrameworkVsmStorageReserved2FnFn?

public fun interface PibioFrameworkVsmStorageReserved3FnFn {
    public operator fun invoke(pipeline: ConstPtr<WinbioPipeline>): Hresult
}

public typealias PibioFrameworkVsmStorageReserved3Fn = PibioFrameworkVsmStorageReserved3FnFn?

public fun interface PibioSensorAcceptCalibrationDataFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, calibrationbuffer: ConstPtr<UByte>, calibrationbuffersize: ULong): Hresult
}

public typealias PibioSensorAcceptCalibrationDataFn = PibioSensorAcceptCalibrationDataFnFn?

public fun interface PibioSensorActivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorActivateFn = PibioSensorActivateFnFn?

public fun interface PibioSensorAsyncImportRawBufferFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, rawbufferaddress: ConstPtr<UByte>, rawbuffersize: ULong, resultbufferaddress: MutPtr<MutPtr<UByte>>, resultbuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioSensorAsyncImportRawBufferFn = PibioSensorAsyncImportRawBufferFnFn?

public fun interface PibioSensorAsyncImportSecureBufferFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, securebufferidentifier: Guid, metadatabufferaddress: ConstPtr<UByte>, metadatabuffersize: ULong, resultbufferaddress: MutPtr<MutPtr<UByte>>, resultbuffersize: MutPtr<ULong>): Hresult
}

public typealias PibioSensorAsyncImportSecureBufferFn = PibioSensorAsyncImportSecureBufferFnFn?

public fun interface PibioSensorAttachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorAttachFn = PibioSensorAttachFnFn?

public fun interface PibioSensorCancelFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorCancelFn = PibioSensorCancelFnFn?

public fun interface PibioSensorClearContextFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorClearContextFn = PibioSensorClearContextFnFn?

public fun interface PibioSensorConnectSecureFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, connectionparams: ConstPtr<WinbioSecureConnectionParams>, connectiondata: MutPtr<MutPtr<WinbioSecureConnectionData>>): Hresult
}

public typealias PibioSensorConnectSecureFn = PibioSensorConnectSecureFnFn?

public fun interface PibioSensorControlUnitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioSensorControlUnitFn = PibioSensorControlUnitFnFn?

public fun interface PibioSensorControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioSensorControlUnitPrivilegedFn = PibioSensorControlUnitPrivilegedFnFn?

public fun interface PibioSensorDeactivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorDeactivateFn = PibioSensorDeactivateFnFn?

public fun interface PibioSensorDetachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorDetachFn = PibioSensorDetachFnFn?

public fun interface PibioSensorExportSensorDataFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, samplebuffer: MutPtr<MutPtr<WinbioBir>>, samplesize: MutPtr<ULong>): Hresult
}

public typealias PibioSensorExportSensorDataFn = PibioSensorExportSensorDataFnFn?

public fun interface PibioSensorFinishCaptureFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioSensorFinishCaptureFn = PibioSensorFinishCaptureFnFn?

public fun interface PibioSensorFinishNotifyWakeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, reason: MutPtr<UInt>): Hresult
}

public typealias PibioSensorFinishNotifyWakeFn = PibioSensorFinishNotifyWakeFnFn?

public fun interface PibioSensorGetIndicatorStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, indicatorstatus: MutPtr<UInt>): Hresult
}

public typealias PibioSensorGetIndicatorStatusFn = PibioSensorGetIndicatorStatusFnFn?

public fun interface PibioSensorNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, powereventtype: UInt): Hresult
}

public typealias PibioSensorNotifyPowerChangeFn = PibioSensorNotifyPowerChangeFnFn?

public fun interface PibioSensorPipelineCleanupFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorPipelineCleanupFn = PibioSensorPipelineCleanupFnFn?

public fun interface PibioSensorPipelineInitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorPipelineInitFn = PibioSensorPipelineInitFnFn?

public fun interface PibioSensorPushDataToEngineFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, purpose: UByte, flags: UByte, rejectdetail: MutPtr<UInt>): Hresult
}

public typealias PibioSensorPushDataToEngineFn = PibioSensorPushDataToEngineFnFn?

public fun interface PibioSensorQueryCalibrationFormatsFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, formatarray: MutPtr<Guid>, formatarraysize: ULong, formatcount: MutPtr<ULong>): Hresult
}

public typealias PibioSensorQueryCalibrationFormatsFn = PibioSensorQueryCalibrationFormatsFnFn?

public fun interface PibioSensorQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, sensorinfo: MutPtr<WinbioExtendedSensorInfo>, sensorinfosize: ULong): Hresult
}

public typealias PibioSensorQueryExtendedInfoFn = PibioSensorQueryExtendedInfoFnFn?

public fun interface PibioSensorQueryPrivateSensorTypeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, typeinfobufferaddress: MutPtr<UByte>, typeinfobuffersize: ULong, typeinfodatasize: MutPtr<ULong>): Hresult
}

public typealias PibioSensorQueryPrivateSensorTypeFn = PibioSensorQueryPrivateSensorTypeFnFn?

public fun interface PibioSensorQueryStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, status: MutPtr<UInt>): Hresult
}

public typealias PibioSensorQueryStatusFn = PibioSensorQueryStatusFnFn?

public fun interface PibioSensorResetFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioSensorResetFn = PibioSensorResetFnFn?

public fun interface PibioSensorSetCalibrationFormatFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, format: ConstPtr<Guid>): Hresult
}

public typealias PibioSensorSetCalibrationFormatFn = PibioSensorSetCalibrationFormatFnFn?

public fun interface PibioSensorSetIndicatorStatusFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, indicatorstatus: UInt): Hresult
}

public typealias PibioSensorSetIndicatorStatusFn = PibioSensorSetIndicatorStatusFnFn?

public fun interface PibioSensorSetModeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, mode: UInt): Hresult
}

public typealias PibioSensorSetModeFn = PibioSensorSetModeFnFn?

public fun interface PibioSensorStartCaptureExFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, purpose: UByte, nonce: ConstPtr<UByte>, noncesize: ULong, flags: UByte, overlapped: MutPtr<MutPtr<Overlapped>>): Hresult
}

public typealias PibioSensorStartCaptureExFn = PibioSensorStartCaptureExFnFn?

public fun interface PibioSensorStartCaptureFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, purpose: UByte, overlapped: MutPtr<MutPtr<Overlapped>>): Hresult
}

public typealias PibioSensorStartCaptureFn = PibioSensorStartCaptureFnFn?

public fun interface PibioSensorStartNotifyWakeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, overlapped: MutPtr<MutPtr<Overlapped>>): Hresult
}

public typealias PibioSensorStartNotifyWakeFn = PibioSensorStartNotifyWakeFnFn?

public fun interface PibioStorageActivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageActivateFn = PibioStorageActivateFnFn?

public fun interface PibioStorageAddRecordFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, recordcontents: ConstPtr<WinbioStorageRecord>): Hresult
}

public typealias PibioStorageAddRecordFn = PibioStorageAddRecordFnFn?

public fun interface PibioStorageAttachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageAttachFn = PibioStorageAttachFnFn?

public fun interface PibioStorageClearContextFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageClearContextFn = PibioStorageClearContextFnFn?

public fun interface PibioStorageCloseDatabaseFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageCloseDatabaseFn = PibioStorageCloseDatabaseFnFn?

public fun interface PibioStorageControlUnitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioStorageControlUnitFn = PibioStorageControlUnitFnFn?

public fun interface PibioStorageControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, controlcode: UInt, sendbuffer: ConstPtr<UByte>, sendbuffersize: ULong, receivebuffer: MutPtr<UByte>, receivebuffersize: ULong, receivedatasize: MutPtr<ULong>, operationstatus: MutPtr<UInt>): Hresult
}

public typealias PibioStorageControlUnitPrivilegedFn = PibioStorageControlUnitPrivilegedFnFn?

public fun interface PibioStorageCreateDatabaseFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, databaseid: ConstPtr<Guid>, factor: UInt, format: ConstPtr<Guid>, filepath: Pcwstr, connectstring: Pcwstr, indexelementcount: ULong, initialsize: ULong): Hresult
}

public typealias PibioStorageCreateDatabaseFn = PibioStorageCreateDatabaseFnFn?

public fun interface PibioStorageDeactivateFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageDeactivateFn = PibioStorageDeactivateFnFn?

public fun interface PibioStorageDeleteRecordFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, subfactor: UByte): Hresult
}

public typealias PibioStorageDeleteRecordFn = PibioStorageDeleteRecordFnFn?

public fun interface PibioStorageDetachFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageDetachFn = PibioStorageDetachFnFn?

public fun interface PibioStorageEraseDatabaseFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, databaseid: ConstPtr<Guid>, filepath: Pcwstr, connectstring: Pcwstr): Hresult
}

public typealias PibioStorageEraseDatabaseFn = PibioStorageEraseDatabaseFnFn?

public fun interface PibioStorageFirstRecordFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageFirstRecordFn = PibioStorageFirstRecordFnFn?

public fun interface PibioStorageGetCurrentRecordFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, recordcontents: MutPtr<WinbioStorageRecord>): Hresult
}

public typealias PibioStorageGetCurrentRecordFn = PibioStorageGetCurrentRecordFnFn?

public fun interface PibioStorageGetDatabaseSizeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, availablerecordcount: MutPtr<ULong>, totalrecordcount: MutPtr<ULong>): Hresult
}

public typealias PibioStorageGetDatabaseSizeFn = PibioStorageGetDatabaseSizeFnFn?

public fun interface PibioStorageGetDataFormatFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, format: MutPtr<Guid>, version: MutPtr<WinbioVersion>): Hresult
}

public typealias PibioStorageGetDataFormatFn = PibioStorageGetDataFormatFnFn?

public fun interface PibioStorageGetRecordCountFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, recordcount: MutPtr<ULong>): Hresult
}

public typealias PibioStorageGetRecordCountFn = PibioStorageGetRecordCountFnFn?

public fun interface PibioStorageNextRecordFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStorageNextRecordFn = PibioStorageNextRecordFnFn?

public fun interface PibioStorageNotifyDatabaseChangeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, recordsadded: Boolean): Hresult
}

public typealias PibioStorageNotifyDatabaseChangeFn = PibioStorageNotifyDatabaseChangeFnFn?

public fun interface PibioStorageNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, powereventtype: UInt): Hresult
}

public typealias PibioStorageNotifyPowerChangeFn = PibioStorageNotifyPowerChangeFnFn?

public fun interface PibioStorageOpenDatabaseFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, databaseid: ConstPtr<Guid>, filepath: Pcwstr, connectstring: Pcwstr): Hresult
}

public typealias PibioStorageOpenDatabaseFn = PibioStorageOpenDatabaseFnFn?

public fun interface PibioStoragePipelineCleanupFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStoragePipelineCleanupFn = PibioStoragePipelineCleanupFnFn?

public fun interface PibioStoragePipelineInitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>): Hresult
}

public typealias PibioStoragePipelineInitFn = PibioStoragePipelineInitFnFn?

public fun interface PibioStorageQueryByContentFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, subfactor: UByte, indexvector: ConstPtr<UInt>, indexelementcount: ULong): Hresult
}

public typealias PibioStorageQueryByContentFn = PibioStorageQueryByContentFnFn?

public fun interface PibioStorageQueryBySubjectFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, subfactor: UByte): Hresult
}

public typealias PibioStorageQueryBySubjectFn = PibioStorageQueryBySubjectFnFn?

public fun interface PibioStorageQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, storageinfo: MutPtr<WinbioExtendedStorageInfo>, storageinfosize: ULong): Hresult
}

public typealias PibioStorageQueryExtendedInfoFn = PibioStorageQueryExtendedInfoFnFn?

public fun interface PibioStorageReserved1FnFn {
    public operator fun invoke(pipeline: ConstPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, reserved1: ConstPtr<ULong>, reserved2: ConstPtr<ULong>): Hresult
}

public typealias PibioStorageReserved1Fn = PibioStorageReserved1FnFn?

public fun interface PibioStorageReserved2FnFn {
    public operator fun invoke(pipeline: ConstPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>): Hresult
}

public typealias PibioStorageReserved2Fn = PibioStorageReserved2FnFn?

public fun interface PibioStorageUpdateRecordBeginFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, recordcontents: MutPtr<WinbioStorageRecord>): Hresult
}

public typealias PibioStorageUpdateRecordBeginFn = PibioStorageUpdateRecordBeginFnFn?

public fun interface PibioStorageUpdateRecordCommitFnFn {
    public operator fun invoke(pipeline: MutPtr<WinbioPipeline>, recordcontents: ConstPtr<WinbioStorageRecord>): Hresult
}

public typealias PibioStorageUpdateRecordCommitFn = PibioStorageUpdateRecordCommitFnFn?

public fun interface PwinbioAsyncCompletionCallbackFn {
    public operator fun invoke(asyncresult: ConstPtr<WinbioAsyncResult>)
}

public typealias PwinbioAsyncCompletionCallback = PwinbioAsyncCompletionCallbackFn?

public fun interface PwinbioCaptureCallbackFn {
    public operator fun invoke(capturecallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, unitid: UInt, sample: ConstPtr<WinbioBir>, samplesize: ULong, rejectdetail: UInt)
}

public typealias PwinbioCaptureCallback = PwinbioCaptureCallbackFn?

public fun interface PwinbioEnrollCaptureCallbackFn {
    public operator fun invoke(enrollcallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, rejectdetail: UInt)
}

public typealias PwinbioEnrollCaptureCallback = PwinbioEnrollCaptureCallbackFn?

public fun interface PwinbioEventCallbackFn {
    public operator fun invoke(eventcallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, event: ConstPtr<WinbioEvent>)
}

public typealias PwinbioEventCallback = PwinbioEventCallbackFn?

public fun interface PwinbioIdentifyCallbackFn {
    public operator fun invoke(identifycallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, unitid: UInt, identity: ConstPtr<WinbioIdentity>, subfactor: UByte, rejectdetail: UInt)
}

public typealias PwinbioIdentifyCallback = PwinbioIdentifyCallbackFn?

public fun interface PwinbioLocateSensorCallbackFn {
    public operator fun invoke(locatecallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, unitid: UInt)
}

public typealias PwinbioLocateSensorCallback = PwinbioLocateSensorCallbackFn?

public fun interface PwinbioQueryEngineInterfaceFnFn {
    public operator fun invoke(engineinterface: MutPtr<MutPtr<WinbioEngineInterface>>): Hresult
}

public typealias PwinbioQueryEngineInterfaceFn = PwinbioQueryEngineInterfaceFnFn?

public fun interface PwinbioQuerySensorInterfaceFnFn {
    public operator fun invoke(sensorinterface: MutPtr<MutPtr<WinbioSensorInterface>>): Hresult
}

public typealias PwinbioQuerySensorInterfaceFn = PwinbioQuerySensorInterfaceFnFn?

public fun interface PwinbioQueryStorageInterfaceFnFn {
    public operator fun invoke(storageinterface: MutPtr<MutPtr<WinbioStorageInterface>>): Hresult
}

public typealias PwinbioQueryStorageInterfaceFn = PwinbioQueryStorageInterfaceFnFn?

public fun interface PwinbioVerifyCallbackFn {
    public operator fun invoke(verifycallbackcontext: ConstPtr<CVoid>, operationstatus: Hresult, unitid: UInt, match: Boolean, rejectdetail: UInt)
}

public typealias PwinbioVerifyCallback = PwinbioVerifyCallbackFn?

public typealias WinbioAntiSpoofPolicyAction = Int

public typealias WinbioAsyncNotificationMethod = Int

public typealias WinbioComponent = UInt

public typealias WinbioCredentialFormat = Int

public typealias WinbioCredentialState = Int

public typealias WinbioCredentialType = Int

public typealias WinbioPolicySource = Int

public typealias WinbioPool = UInt

public typealias WinbioSettingSource = UInt

public typealias WinibioEngineContext = Long

public typealias WinibioSensorContext = Long

public typealias WinibioStorageContext = Long
