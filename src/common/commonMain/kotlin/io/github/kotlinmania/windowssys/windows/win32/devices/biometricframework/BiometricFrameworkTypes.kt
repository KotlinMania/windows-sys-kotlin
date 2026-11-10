package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public fun interface PibioEngineAcceptPrivateSensorTypeInfoFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, typeinfobufferaddress: COpaquePointer?, typeinfobuffersize: ULong): Hresult
}

public typealias PibioEngineAcceptPrivateSensorTypeInfoFn = PibioEngineAcceptPrivateSensorTypeInfoFnFn?

public fun interface PibioEngineAcceptSampleDataFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, samplebuffer: COpaquePointer?, samplesize: ULong, purpose: UByte, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioEngineAcceptSampleDataFn = PibioEngineAcceptSampleDataFnFn?

public fun interface PibioEngineActivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineActivateFn = PibioEngineActivateFnFn?

public fun interface PibioEngineAttachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineAttachFn = PibioEngineAttachFnFn?

public fun interface PibioEngineCheckForDuplicateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, duplicate: COpaquePointer?): Hresult
}

public typealias PibioEngineCheckForDuplicateFn = PibioEngineCheckForDuplicateFnFn?

public fun interface PibioEngineClearContextFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineClearContextFn = PibioEngineClearContextFnFn?

public fun interface PibioEngineCommitEnrollmentFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: UByte, payloadblob: COpaquePointer?, payloadblobsize: ULong): Hresult
}

public typealias PibioEngineCommitEnrollmentFn = PibioEngineCommitEnrollmentFnFn?

public fun interface PibioEngineControlUnitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioEngineControlUnitFn = PibioEngineControlUnitFnFn?

public fun interface PibioEngineControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioEngineControlUnitPrivilegedFn = PibioEngineControlUnitPrivilegedFnFn?

public fun interface PibioEngineCreateEnrollmentAuthenticatedFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, nonce: COpaquePointer?, noncesize: COpaquePointer?): Hresult
}

public typealias PibioEngineCreateEnrollmentAuthenticatedFn = PibioEngineCreateEnrollmentAuthenticatedFnFn?

public fun interface PibioEngineCreateEnrollmentFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineCreateEnrollmentFn = PibioEngineCreateEnrollmentFnFn?

public fun interface PibioEngineCreateKeyFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, key: COpaquePointer?, keysize: ULong, keyidentifier: COpaquePointer?, keyidentifiersize: ULong, resultsize: COpaquePointer?): Hresult
}

public typealias PibioEngineCreateKeyFn = PibioEngineCreateKeyFnFn?

public fun interface PibioEngineDeactivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineDeactivateFn = PibioEngineDeactivateFnFn?

public fun interface PibioEngineDetachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineDetachFn = PibioEngineDetachFnFn?

public fun interface PibioEngineDiscardEnrollmentFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineDiscardEnrollmentFn = PibioEngineDiscardEnrollmentFnFn?

public fun interface PibioEngineExportEngineDataFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, flags: UByte, samplebuffer: COpaquePointer?, samplesize: COpaquePointer?): Hresult
}

public typealias PibioEngineExportEngineDataFn = PibioEngineExportEngineDataFnFn?

public fun interface PibioEngineGetEnrollmentHashFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, hashvalue: COpaquePointer?, hashsize: COpaquePointer?): Hresult
}

public typealias PibioEngineGetEnrollmentHashFn = PibioEngineGetEnrollmentHashFnFn?

public fun interface PibioEngineGetEnrollmentStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioEngineGetEnrollmentStatusFn = PibioEngineGetEnrollmentStatusFnFn?

public fun interface PibioEngineIdentifyAllFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, presencecount: COpaquePointer?, presencearray: COpaquePointer?): Hresult
}

public typealias PibioEngineIdentifyAllFn = PibioEngineIdentifyAllFnFn?

public fun interface PibioEngineIdentifyFeatureSetAuthenticatedFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, nonce: COpaquePointer?, noncesize: ULong, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?, authentication: COpaquePointer?, authenticationsize: COpaquePointer?): Hresult
}

public typealias PibioEngineIdentifyFeatureSetAuthenticatedFn = PibioEngineIdentifyFeatureSetAuthenticatedFnFn?

public fun interface PibioEngineIdentifyFeatureSetFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: COpaquePointer?, payloadblob: COpaquePointer?, payloadblobsize: COpaquePointer?, hashvalue: COpaquePointer?, hashsize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioEngineIdentifyFeatureSetFn = PibioEngineIdentifyFeatureSetFnFn?

public fun interface PibioEngineIdentifyFeatureSetSecureFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, nonce: COpaquePointer?, noncesize: ULong, keyidentifier: COpaquePointer?, keyidentifiersize: ULong, identity: COpaquePointer?, subfactor: COpaquePointer?, rejectdetail: COpaquePointer?, authorization: COpaquePointer?, authorizationsize: COpaquePointer?): Hresult
}

public typealias PibioEngineIdentifyFeatureSetSecureFn = PibioEngineIdentifyFeatureSetSecureFnFn?

public fun interface PibioEngineNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, powereventtype: UInt): Hresult
}

public typealias PibioEngineNotifyPowerChangeFn = PibioEngineNotifyPowerChangeFnFn?

public fun interface PibioEnginePipelineCleanupFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEnginePipelineCleanupFn = PibioEnginePipelineCleanupFnFn?

public fun interface PibioEnginePipelineInitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEnginePipelineInitFn = PibioEnginePipelineInitFnFn?

public fun interface PibioEngineQueryCalibrationDataFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, discardandrepeatcapture: COpaquePointer?, calibrationbuffer: COpaquePointer?, calibrationbuffersize: COpaquePointer?, maxbuffersize: ULong): Hresult
}

public typealias PibioEngineQueryCalibrationDataFn = PibioEngineQueryCalibrationDataFnFn?

public fun interface PibioEngineQueryExtendedEnrollmentStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, enrollmentstatus: COpaquePointer?, enrollmentstatussize: ULong): Hresult
}

public typealias PibioEngineQueryExtendedEnrollmentStatusFn = PibioEngineQueryExtendedEnrollmentStatusFnFn?

public fun interface PibioEngineQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, engineinfo: COpaquePointer?, engineinfosize: ULong): Hresult
}

public typealias PibioEngineQueryExtendedInfoFn = PibioEngineQueryExtendedInfoFnFn?

public fun interface PibioEngineQueryHashAlgorithmsFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, algorithmcount: COpaquePointer?, algorithmbuffersize: COpaquePointer?, algorithmbuffer: COpaquePointer?): Hresult
}

public typealias PibioEngineQueryHashAlgorithmsFn = PibioEngineQueryHashAlgorithmsFnFn?

public fun interface PibioEngineQueryIndexVectorSizeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, indexelementcount: COpaquePointer?): Hresult
}

public typealias PibioEngineQueryIndexVectorSizeFn = PibioEngineQueryIndexVectorSizeFnFn?

public fun interface PibioEngineQueryPreferredFormatFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, standardformat: COpaquePointer?, vendorformat: COpaquePointer?): Hresult
}

public typealias PibioEngineQueryPreferredFormatFn = PibioEngineQueryPreferredFormatFnFn?

public fun interface PibioEngineQuerySampleHintFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, samplehint: COpaquePointer?): Hresult
}

public typealias PibioEngineQuerySampleHintFn = PibioEngineQuerySampleHintFnFn?

public fun interface PibioEngineRefreshCacheFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioEngineRefreshCacheFn = PibioEngineRefreshCacheFnFn?

public fun interface PibioEngineReserved1FnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?): Hresult
}

public typealias PibioEngineReserved1Fn = PibioEngineReserved1FnFn?

public fun interface PibioEngineSelectCalibrationFormatFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, formatarray: COpaquePointer?, formatcount: ULong, selectedformat: COpaquePointer?, maxbuffersize: COpaquePointer?): Hresult
}

public typealias PibioEngineSelectCalibrationFormatFn = PibioEngineSelectCalibrationFormatFnFn?

public fun interface PibioEngineSetAccountPolicyFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, policyitemarray: COpaquePointer?, policyitemcount: ULong): Hresult
}

public typealias PibioEngineSetAccountPolicyFn = PibioEngineSetAccountPolicyFnFn?

public fun interface PibioEngineSetEnrollmentParametersFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, parameters: COpaquePointer?): Hresult
}

public typealias PibioEngineSetEnrollmentParametersFn = PibioEngineSetEnrollmentParametersFnFn?

public fun interface PibioEngineSetEnrollmentSelectorFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, selectorvalue: ULong): Hresult
}

public typealias PibioEngineSetEnrollmentSelectorFn = PibioEngineSetEnrollmentSelectorFnFn?

public fun interface PibioEngineSetHashAlgorithmFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, algorithmbuffersize: ULong, algorithmbuffer: COpaquePointer?): Hresult
}

public typealias PibioEngineSetHashAlgorithmFn = PibioEngineSetHashAlgorithmFnFn?

public fun interface PibioEngineUpdateEnrollmentFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioEngineUpdateEnrollmentFn = PibioEngineUpdateEnrollmentFnFn?

public fun interface PibioEngineVerifyFeatureSetFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: UByte, match: COpaquePointer?, payloadblob: COpaquePointer?, payloadblobsize: COpaquePointer?, hashvalue: COpaquePointer?, hashsize: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioEngineVerifyFeatureSetFn = PibioEngineVerifyFeatureSetFnFn?

public fun interface PibioFrameworkAllocateMemoryFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, allocationsize: ULong, address: COpaquePointer?): Hresult
}

public typealias PibioFrameworkAllocateMemoryFn = PibioFrameworkAllocateMemoryFnFn?

public fun interface PibioFrameworkFreeMemoryFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, address: COpaquePointer?): Hresult
}

public typealias PibioFrameworkFreeMemoryFn = PibioFrameworkFreeMemoryFnFn?

public fun interface PibioFrameworkGetPropertyFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, propertytype: UInt, propertyid: UInt, identity: COpaquePointer?, subfactor: UByte, propertybuffer: COpaquePointer?, propertybuffersize: COpaquePointer?): Hresult
}

public typealias PibioFrameworkGetPropertyFn = PibioFrameworkGetPropertyFnFn?

public fun interface PibioFrameworkLockAndValidateSecureBufferFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, securebufferidentifier: Guid, securebufferaddress: COpaquePointer?, securebuffersize: COpaquePointer?): Hresult
}

public typealias PibioFrameworkLockAndValidateSecureBufferFn = PibioFrameworkLockAndValidateSecureBufferFnFn?

public fun interface PibioFrameworkReleaseSecureBufferFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, securebufferidentifier: Guid): Hresult
}

public typealias PibioFrameworkReleaseSecureBufferFn = PibioFrameworkReleaseSecureBufferFnFn?

public fun interface PibioFrameworkSetUnitStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, extendedstatus: COpaquePointer?, extendedstatussize: ULong): Hresult
}

public typealias PibioFrameworkSetUnitStatusFn = PibioFrameworkSetUnitStatusFnFn?

public fun interface PibioFrameworkVsmCacheClearFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheClearFn = PibioFrameworkVsmCacheClearFnFn?

public fun interface PibioFrameworkVsmCacheExportBeginFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, requiredcapacity: COpaquePointer?, maxbuffersize: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheExportBeginFn = PibioFrameworkVsmCacheExportBeginFnFn?

public fun interface PibioFrameworkVsmCacheExportEndFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheExportEndFn = PibioFrameworkVsmCacheExportEndFnFn?

public fun interface PibioFrameworkVsmCacheExportNextFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, bufferaddress: COpaquePointer?, buffersize: ULong, returneddatasize: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheExportNextFn = PibioFrameworkVsmCacheExportNextFnFn?

public fun interface PibioFrameworkVsmCacheImportBeginFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, requiredcapacity: ULong, maxbuffersize: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheImportBeginFn = PibioFrameworkVsmCacheImportBeginFnFn?

public fun interface PibioFrameworkVsmCacheImportEndFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmCacheImportEndFn = PibioFrameworkVsmCacheImportEndFnFn?

public fun interface PibioFrameworkVsmCacheImportNextFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, bufferaddress: COpaquePointer?, buffersize: ULong): Hresult
}

public typealias PibioFrameworkVsmCacheImportNextFn = PibioFrameworkVsmCacheImportNextFnFn?

public fun interface PibioFrameworkVsmDecryptSampleFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, authentication: COpaquePointer?, authenticationsize: ULong, iv: COpaquePointer?, ivsize: ULong, encrypteddata: COpaquePointer?, encrypteddatasize: ULong): Hresult
}

public typealias PibioFrameworkVsmDecryptSampleFn = PibioFrameworkVsmDecryptSampleFnFn?

public fun interface PibioFrameworkVsmQueryAuthorizedEnrollmentsFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, secureidentitycount: COpaquePointer?, secureidentities: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmQueryAuthorizedEnrollmentsFn = PibioFrameworkVsmQueryAuthorizedEnrollmentsFnFn?

public fun interface PibioFrameworkVsmStorageReserved1FnFn {
    public operator fun invoke(pipeline: COpaquePointer?, reserved1: ULong, reserved2: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmStorageReserved1Fn = PibioFrameworkVsmStorageReserved1FnFn?

public fun interface PibioFrameworkVsmStorageReserved2FnFn {
    public operator fun invoke(pipeline: COpaquePointer?, reserved1: COpaquePointer?, reserved2: ULong): Hresult
}

public typealias PibioFrameworkVsmStorageReserved2Fn = PibioFrameworkVsmStorageReserved2FnFn?

public fun interface PibioFrameworkVsmStorageReserved3FnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioFrameworkVsmStorageReserved3Fn = PibioFrameworkVsmStorageReserved3FnFn?

public fun interface PibioSensorAcceptCalibrationDataFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, calibrationbuffer: COpaquePointer?, calibrationbuffersize: ULong): Hresult
}

public typealias PibioSensorAcceptCalibrationDataFn = PibioSensorAcceptCalibrationDataFnFn?

public fun interface PibioSensorActivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorActivateFn = PibioSensorActivateFnFn?

public fun interface PibioSensorAsyncImportRawBufferFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, rawbufferaddress: COpaquePointer?, rawbuffersize: ULong, resultbufferaddress: COpaquePointer?, resultbuffersize: COpaquePointer?): Hresult
}

public typealias PibioSensorAsyncImportRawBufferFn = PibioSensorAsyncImportRawBufferFnFn?

public fun interface PibioSensorAsyncImportSecureBufferFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, securebufferidentifier: Guid, metadatabufferaddress: COpaquePointer?, metadatabuffersize: ULong, resultbufferaddress: COpaquePointer?, resultbuffersize: COpaquePointer?): Hresult
}

public typealias PibioSensorAsyncImportSecureBufferFn = PibioSensorAsyncImportSecureBufferFnFn?

public fun interface PibioSensorAttachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorAttachFn = PibioSensorAttachFnFn?

public fun interface PibioSensorCancelFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorCancelFn = PibioSensorCancelFnFn?

public fun interface PibioSensorClearContextFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorClearContextFn = PibioSensorClearContextFnFn?

public fun interface PibioSensorConnectSecureFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, connectionparams: COpaquePointer?, connectiondata: COpaquePointer?): Hresult
}

public typealias PibioSensorConnectSecureFn = PibioSensorConnectSecureFnFn?

public fun interface PibioSensorControlUnitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioSensorControlUnitFn = PibioSensorControlUnitFnFn?

public fun interface PibioSensorControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioSensorControlUnitPrivilegedFn = PibioSensorControlUnitPrivilegedFnFn?

public fun interface PibioSensorDeactivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorDeactivateFn = PibioSensorDeactivateFnFn?

public fun interface PibioSensorDetachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorDetachFn = PibioSensorDetachFnFn?

public fun interface PibioSensorExportSensorDataFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, samplebuffer: COpaquePointer?, samplesize: COpaquePointer?): Hresult
}

public typealias PibioSensorExportSensorDataFn = PibioSensorExportSensorDataFnFn?

public fun interface PibioSensorFinishCaptureFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioSensorFinishCaptureFn = PibioSensorFinishCaptureFnFn?

public fun interface PibioSensorFinishNotifyWakeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, reason: COpaquePointer?): Hresult
}

public typealias PibioSensorFinishNotifyWakeFn = PibioSensorFinishNotifyWakeFnFn?

public fun interface PibioSensorGetIndicatorStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, indicatorstatus: COpaquePointer?): Hresult
}

public typealias PibioSensorGetIndicatorStatusFn = PibioSensorGetIndicatorStatusFnFn?

public fun interface PibioSensorNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, powereventtype: UInt): Hresult
}

public typealias PibioSensorNotifyPowerChangeFn = PibioSensorNotifyPowerChangeFnFn?

public fun interface PibioSensorPipelineCleanupFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorPipelineCleanupFn = PibioSensorPipelineCleanupFnFn?

public fun interface PibioSensorPipelineInitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorPipelineInitFn = PibioSensorPipelineInitFnFn?

public fun interface PibioSensorPushDataToEngineFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, purpose: UByte, flags: UByte, rejectdetail: COpaquePointer?): Hresult
}

public typealias PibioSensorPushDataToEngineFn = PibioSensorPushDataToEngineFnFn?

public fun interface PibioSensorQueryCalibrationFormatsFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, formatarray: COpaquePointer?, formatarraysize: ULong, formatcount: COpaquePointer?): Hresult
}

public typealias PibioSensorQueryCalibrationFormatsFn = PibioSensorQueryCalibrationFormatsFnFn?

public fun interface PibioSensorQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, sensorinfo: COpaquePointer?, sensorinfosize: ULong): Hresult
}

public typealias PibioSensorQueryExtendedInfoFn = PibioSensorQueryExtendedInfoFnFn?

public fun interface PibioSensorQueryPrivateSensorTypeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, typeinfobufferaddress: COpaquePointer?, typeinfobuffersize: ULong, typeinfodatasize: COpaquePointer?): Hresult
}

public typealias PibioSensorQueryPrivateSensorTypeFn = PibioSensorQueryPrivateSensorTypeFnFn?

public fun interface PibioSensorQueryStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, status: COpaquePointer?): Hresult
}

public typealias PibioSensorQueryStatusFn = PibioSensorQueryStatusFnFn?

public fun interface PibioSensorResetFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioSensorResetFn = PibioSensorResetFnFn?

public fun interface PibioSensorSetCalibrationFormatFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, format: COpaquePointer?): Hresult
}

public typealias PibioSensorSetCalibrationFormatFn = PibioSensorSetCalibrationFormatFnFn?

public fun interface PibioSensorSetIndicatorStatusFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, indicatorstatus: UInt): Hresult
}

public typealias PibioSensorSetIndicatorStatusFn = PibioSensorSetIndicatorStatusFnFn?

public fun interface PibioSensorSetModeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, mode: UInt): Hresult
}

public typealias PibioSensorSetModeFn = PibioSensorSetModeFnFn?

public fun interface PibioSensorStartCaptureExFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, purpose: UByte, nonce: COpaquePointer?, noncesize: ULong, flags: UByte, overlapped: COpaquePointer?): Hresult
}

public typealias PibioSensorStartCaptureExFn = PibioSensorStartCaptureExFnFn?

public fun interface PibioSensorStartCaptureFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, purpose: UByte, overlapped: COpaquePointer?): Hresult
}

public typealias PibioSensorStartCaptureFn = PibioSensorStartCaptureFnFn?

public fun interface PibioSensorStartNotifyWakeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, overlapped: COpaquePointer?): Hresult
}

public typealias PibioSensorStartNotifyWakeFn = PibioSensorStartNotifyWakeFnFn?

public fun interface PibioStorageActivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageActivateFn = PibioStorageActivateFnFn?

public fun interface PibioStorageAddRecordFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, recordcontents: COpaquePointer?): Hresult
}

public typealias PibioStorageAddRecordFn = PibioStorageAddRecordFnFn?

public fun interface PibioStorageAttachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageAttachFn = PibioStorageAttachFnFn?

public fun interface PibioStorageClearContextFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageClearContextFn = PibioStorageClearContextFnFn?

public fun interface PibioStorageCloseDatabaseFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageCloseDatabaseFn = PibioStorageCloseDatabaseFnFn?

public fun interface PibioStorageControlUnitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioStorageControlUnitFn = PibioStorageControlUnitFnFn?

public fun interface PibioStorageControlUnitPrivilegedFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, controlcode: UInt, sendbuffer: COpaquePointer?, sendbuffersize: ULong, receivebuffer: COpaquePointer?, receivebuffersize: ULong, receivedatasize: COpaquePointer?, operationstatus: COpaquePointer?): Hresult
}

public typealias PibioStorageControlUnitPrivilegedFn = PibioStorageControlUnitPrivilegedFnFn?

public fun interface PibioStorageCreateDatabaseFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, databaseid: COpaquePointer?, factor: UInt, format: COpaquePointer?, filepath: Pcwstr, connectstring: Pcwstr, indexelementcount: ULong, initialsize: ULong): Hresult
}

public typealias PibioStorageCreateDatabaseFn = PibioStorageCreateDatabaseFnFn?

public fun interface PibioStorageDeactivateFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageDeactivateFn = PibioStorageDeactivateFnFn?

public fun interface PibioStorageDeleteRecordFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: UByte): Hresult
}

public typealias PibioStorageDeleteRecordFn = PibioStorageDeleteRecordFnFn?

public fun interface PibioStorageDetachFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageDetachFn = PibioStorageDetachFnFn?

public fun interface PibioStorageEraseDatabaseFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, databaseid: COpaquePointer?, filepath: Pcwstr, connectstring: Pcwstr): Hresult
}

public typealias PibioStorageEraseDatabaseFn = PibioStorageEraseDatabaseFnFn?

public fun interface PibioStorageFirstRecordFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageFirstRecordFn = PibioStorageFirstRecordFnFn?

public fun interface PibioStorageGetCurrentRecordFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, recordcontents: COpaquePointer?): Hresult
}

public typealias PibioStorageGetCurrentRecordFn = PibioStorageGetCurrentRecordFnFn?

public fun interface PibioStorageGetDatabaseSizeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, availablerecordcount: COpaquePointer?, totalrecordcount: COpaquePointer?): Hresult
}

public typealias PibioStorageGetDatabaseSizeFn = PibioStorageGetDatabaseSizeFnFn?

public fun interface PibioStorageGetDataFormatFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, format: COpaquePointer?, version: COpaquePointer?): Hresult
}

public typealias PibioStorageGetDataFormatFn = PibioStorageGetDataFormatFnFn?

public fun interface PibioStorageGetRecordCountFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, recordcount: COpaquePointer?): Hresult
}

public typealias PibioStorageGetRecordCountFn = PibioStorageGetRecordCountFnFn?

public fun interface PibioStorageNextRecordFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStorageNextRecordFn = PibioStorageNextRecordFnFn?

public fun interface PibioStorageNotifyDatabaseChangeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, recordsadded: Boolean): Hresult
}

public typealias PibioStorageNotifyDatabaseChangeFn = PibioStorageNotifyDatabaseChangeFnFn?

public fun interface PibioStorageNotifyPowerChangeFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, powereventtype: UInt): Hresult
}

public typealias PibioStorageNotifyPowerChangeFn = PibioStorageNotifyPowerChangeFnFn?

public fun interface PibioStorageOpenDatabaseFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, databaseid: COpaquePointer?, filepath: Pcwstr, connectstring: Pcwstr): Hresult
}

public typealias PibioStorageOpenDatabaseFn = PibioStorageOpenDatabaseFnFn?

public fun interface PibioStoragePipelineCleanupFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStoragePipelineCleanupFn = PibioStoragePipelineCleanupFnFn?

public fun interface PibioStoragePipelineInitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?): Hresult
}

public typealias PibioStoragePipelineInitFn = PibioStoragePipelineInitFnFn?

public fun interface PibioStorageQueryByContentFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, subfactor: UByte, indexvector: COpaquePointer?, indexelementcount: ULong): Hresult
}

public typealias PibioStorageQueryByContentFn = PibioStorageQueryByContentFnFn?

public fun interface PibioStorageQueryBySubjectFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: UByte): Hresult
}

public typealias PibioStorageQueryBySubjectFn = PibioStorageQueryBySubjectFnFn?

public fun interface PibioStorageQueryExtendedInfoFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, storageinfo: COpaquePointer?, storageinfosize: ULong): Hresult
}

public typealias PibioStorageQueryExtendedInfoFn = PibioStorageQueryExtendedInfoFnFn?

public fun interface PibioStorageReserved1FnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, reserved1: COpaquePointer?, reserved2: COpaquePointer?): Hresult
}

public typealias PibioStorageReserved1Fn = PibioStorageReserved1FnFn?

public fun interface PibioStorageReserved2FnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?): Hresult
}

public typealias PibioStorageReserved2Fn = PibioStorageReserved2FnFn?

public fun interface PibioStorageUpdateRecordBeginFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, identity: COpaquePointer?, subfactor: UByte, recordcontents: COpaquePointer?): Hresult
}

public typealias PibioStorageUpdateRecordBeginFn = PibioStorageUpdateRecordBeginFnFn?

public fun interface PibioStorageUpdateRecordCommitFnFn {
    public operator fun invoke(pipeline: COpaquePointer?, recordcontents: COpaquePointer?): Hresult
}

public typealias PibioStorageUpdateRecordCommitFn = PibioStorageUpdateRecordCommitFnFn?

public fun interface PwinbioAsyncCompletionCallbackFn {
    public operator fun invoke(asyncresult: COpaquePointer?)
}

public typealias PwinbioAsyncCompletionCallback = PwinbioAsyncCompletionCallbackFn?

public fun interface PwinbioCaptureCallbackFn {
    public operator fun invoke(capturecallbackcontext: COpaquePointer?, operationstatus: Hresult, unitid: UInt, sample: COpaquePointer?, samplesize: ULong, rejectdetail: UInt)
}

public typealias PwinbioCaptureCallback = PwinbioCaptureCallbackFn?

public fun interface PwinbioEnrollCaptureCallbackFn {
    public operator fun invoke(enrollcallbackcontext: COpaquePointer?, operationstatus: Hresult, rejectdetail: UInt)
}

public typealias PwinbioEnrollCaptureCallback = PwinbioEnrollCaptureCallbackFn?

public fun interface PwinbioEventCallbackFn {
    public operator fun invoke(eventcallbackcontext: COpaquePointer?, operationstatus: Hresult, event: COpaquePointer?)
}

public typealias PwinbioEventCallback = PwinbioEventCallbackFn?

public fun interface PwinbioIdentifyCallbackFn {
    public operator fun invoke(identifycallbackcontext: COpaquePointer?, operationstatus: Hresult, unitid: UInt, identity: COpaquePointer?, subfactor: UByte, rejectdetail: UInt)
}

public typealias PwinbioIdentifyCallback = PwinbioIdentifyCallbackFn?

public fun interface PwinbioLocateSensorCallbackFn {
    public operator fun invoke(locatecallbackcontext: COpaquePointer?, operationstatus: Hresult, unitid: UInt)
}

public typealias PwinbioLocateSensorCallback = PwinbioLocateSensorCallbackFn?

public fun interface PwinbioQueryEngineInterfaceFnFn {
    public operator fun invoke(engineinterface: COpaquePointer?): Hresult
}

public typealias PwinbioQueryEngineInterfaceFn = PwinbioQueryEngineInterfaceFnFn?

public fun interface PwinbioQuerySensorInterfaceFnFn {
    public operator fun invoke(sensorinterface: COpaquePointer?): Hresult
}

public typealias PwinbioQuerySensorInterfaceFn = PwinbioQuerySensorInterfaceFnFn?

public fun interface PwinbioQueryStorageInterfaceFnFn {
    public operator fun invoke(storageinterface: COpaquePointer?): Hresult
}

public typealias PwinbioQueryStorageInterfaceFn = PwinbioQueryStorageInterfaceFnFn?

public fun interface PwinbioVerifyCallbackFn {
    public operator fun invoke(verifycallbackcontext: COpaquePointer?, operationstatus: Hresult, unitid: UInt, match: Boolean, rejectdetail: UInt)
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
