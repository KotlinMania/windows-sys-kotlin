package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FNFn {
    public operator fun invoke(pipeline: Long, typeinfobufferaddress: Long, typeinfobuffersize: ULong): HRESULT
}

public typealias PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FN = PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FNFn?

public fun interface PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FNFn {
    public operator fun invoke(pipeline: Long, samplebuffer: Long, samplesize: ULong, purpose: UByte, rejectdetail: Long): HRESULT
}

public typealias PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FN = PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FNFn?

public fun interface PIBIO_ENGINE_ACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_ACTIVATE_FN = PIBIO_ENGINE_ACTIVATE_FNFn?

public fun interface PIBIO_ENGINE_ATTACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_ATTACH_FN = PIBIO_ENGINE_ATTACH_FNFn?

public fun interface PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: Long, duplicate: Long): HRESULT
}

public typealias PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FN = PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FNFn?

public fun interface PIBIO_ENGINE_CLEAR_CONTEXT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_CLEAR_CONTEXT_FN = PIBIO_ENGINE_CLEAR_CONTEXT_FNFn?

public fun interface PIBIO_ENGINE_COMMIT_ENROLLMENT_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: UByte, payloadblob: Long, payloadblobsize: ULong): HRESULT
}

public typealias PIBIO_ENGINE_COMMIT_ENROLLMENT_FN = PIBIO_ENGINE_COMMIT_ENROLLMENT_FNFn?

public fun interface PIBIO_ENGINE_CONTROL_UNIT_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_ENGINE_CONTROL_UNIT_FN = PIBIO_ENGINE_CONTROL_UNIT_FNFn?

public fun interface PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FN = PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FNFn?

public fun interface PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FNFn {
    public operator fun invoke(pipeline: Long, nonce: Long, noncesize: Long): HRESULT
}

public typealias PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FN = PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FNFn?

public fun interface PIBIO_ENGINE_CREATE_ENROLLMENT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_CREATE_ENROLLMENT_FN = PIBIO_ENGINE_CREATE_ENROLLMENT_FNFn?

public fun interface PIBIO_ENGINE_CREATE_KEY_FNFn {
    public operator fun invoke(pipeline: Long, key: Long, keysize: ULong, keyidentifier: Long, keyidentifiersize: ULong, resultsize: Long): HRESULT
}

public typealias PIBIO_ENGINE_CREATE_KEY_FN = PIBIO_ENGINE_CREATE_KEY_FNFn?

public fun interface PIBIO_ENGINE_DEACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_DEACTIVATE_FN = PIBIO_ENGINE_DEACTIVATE_FNFn?

public fun interface PIBIO_ENGINE_DETACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_DETACH_FN = PIBIO_ENGINE_DETACH_FNFn?

public fun interface PIBIO_ENGINE_DISCARD_ENROLLMENT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_DISCARD_ENROLLMENT_FN = PIBIO_ENGINE_DISCARD_ENROLLMENT_FNFn?

public fun interface PIBIO_ENGINE_EXPORT_ENGINE_DATA_FNFn {
    public operator fun invoke(pipeline: Long, flags: UByte, samplebuffer: Long, samplesize: Long): HRESULT
}

public typealias PIBIO_ENGINE_EXPORT_ENGINE_DATA_FN = PIBIO_ENGINE_EXPORT_ENGINE_DATA_FNFn?

public fun interface PIBIO_ENGINE_GET_ENROLLMENT_HASH_FNFn {
    public operator fun invoke(pipeline: Long, hashvalue: Long, hashsize: Long): HRESULT
}

public typealias PIBIO_ENGINE_GET_ENROLLMENT_HASH_FN = PIBIO_ENGINE_GET_ENROLLMENT_HASH_FNFn?

public fun interface PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, rejectdetail: Long): HRESULT
}

public typealias PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FN = PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FNFn?

public fun interface PIBIO_ENGINE_IDENTIFY_ALL_FNFn {
    public operator fun invoke(pipeline: Long, presencecount: Long, presencearray: Long): HRESULT
}

public typealias PIBIO_ENGINE_IDENTIFY_ALL_FN = PIBIO_ENGINE_IDENTIFY_ALL_FNFn?

public fun interface PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FNFn {
    public operator fun invoke(pipeline: Long, nonce: Long, noncesize: ULong, identity: Long, subfactor: Long, rejectdetail: Long, authentication: Long, authenticationsize: Long): HRESULT
}

public typealias PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FN = PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FNFn?

public fun interface PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: Long, payloadblob: Long, payloadblobsize: Long, hashvalue: Long, hashsize: Long, rejectdetail: Long): HRESULT
}

public typealias PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FN = PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FNFn?

public fun interface PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FNFn {
    public operator fun invoke(pipeline: Long, nonce: Long, noncesize: ULong, keyidentifier: Long, keyidentifiersize: ULong, identity: Long, subfactor: Long, rejectdetail: Long, authorization: Long, authorizationsize: Long): HRESULT
}

public typealias PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FN = PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FNFn?

public fun interface PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FNFn {
    public operator fun invoke(pipeline: Long, powereventtype: UInt): HRESULT
}

public typealias PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FN = PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FNFn?

public fun interface PIBIO_ENGINE_PIPELINE_CLEANUP_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_PIPELINE_CLEANUP_FN = PIBIO_ENGINE_PIPELINE_CLEANUP_FNFn?

public fun interface PIBIO_ENGINE_PIPELINE_INIT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_PIPELINE_INIT_FN = PIBIO_ENGINE_PIPELINE_INIT_FNFn?

public fun interface PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FNFn {
    public operator fun invoke(pipeline: Long, discardandrepeatcapture: Long, calibrationbuffer: Long, calibrationbuffersize: Long, maxbuffersize: ULong): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FN = PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FNFn?

public fun interface PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, enrollmentstatus: Long, enrollmentstatussize: ULong): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FN = PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FNFn?

public fun interface PIBIO_ENGINE_QUERY_EXTENDED_INFO_FNFn {
    public operator fun invoke(pipeline: Long, engineinfo: Long, engineinfosize: ULong): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_EXTENDED_INFO_FN = PIBIO_ENGINE_QUERY_EXTENDED_INFO_FNFn?

public fun interface PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FNFn {
    public operator fun invoke(pipeline: Long, algorithmcount: Long, algorithmbuffersize: Long, algorithmbuffer: Long): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FN = PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FNFn?

public fun interface PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FNFn {
    public operator fun invoke(pipeline: Long, indexelementcount: Long): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FN = PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FNFn?

public fun interface PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FNFn {
    public operator fun invoke(pipeline: Long, standardformat: Long, vendorformat: Long): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FN = PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FNFn?

public fun interface PIBIO_ENGINE_QUERY_SAMPLE_HINT_FNFn {
    public operator fun invoke(pipeline: Long, samplehint: Long): HRESULT
}

public typealias PIBIO_ENGINE_QUERY_SAMPLE_HINT_FN = PIBIO_ENGINE_QUERY_SAMPLE_HINT_FNFn?

public fun interface PIBIO_ENGINE_REFRESH_CACHE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_ENGINE_REFRESH_CACHE_FN = PIBIO_ENGINE_REFRESH_CACHE_FNFn?

public fun interface PIBIO_ENGINE_RESERVED_1_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long): HRESULT
}

public typealias PIBIO_ENGINE_RESERVED_1_FN = PIBIO_ENGINE_RESERVED_1_FNFn?

public fun interface PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FNFn {
    public operator fun invoke(pipeline: Long, formatarray: Long, formatcount: ULong, selectedformat: Long, maxbuffersize: Long): HRESULT
}

public typealias PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FN = PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FNFn?

public fun interface PIBIO_ENGINE_SET_ACCOUNT_POLICY_FNFn {
    public operator fun invoke(pipeline: Long, policyitemarray: Long, policyitemcount: ULong): HRESULT
}

public typealias PIBIO_ENGINE_SET_ACCOUNT_POLICY_FN = PIBIO_ENGINE_SET_ACCOUNT_POLICY_FNFn?

public fun interface PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FNFn {
    public operator fun invoke(pipeline: Long, parameters: Long): HRESULT
}

public typealias PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FN = PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FNFn?

public fun interface PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FNFn {
    public operator fun invoke(pipeline: Long, selectorvalue: ULong): HRESULT
}

public typealias PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FN = PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FNFn?

public fun interface PIBIO_ENGINE_SET_HASH_ALGORITHM_FNFn {
    public operator fun invoke(pipeline: Long, algorithmbuffersize: ULong, algorithmbuffer: Long): HRESULT
}

public typealias PIBIO_ENGINE_SET_HASH_ALGORITHM_FN = PIBIO_ENGINE_SET_HASH_ALGORITHM_FNFn?

public fun interface PIBIO_ENGINE_UPDATE_ENROLLMENT_FNFn {
    public operator fun invoke(pipeline: Long, rejectdetail: Long): HRESULT
}

public typealias PIBIO_ENGINE_UPDATE_ENROLLMENT_FN = PIBIO_ENGINE_UPDATE_ENROLLMENT_FNFn?

public fun interface PIBIO_ENGINE_VERIFY_FEATURE_SET_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: UByte, match: Long, payloadblob: Long, payloadblobsize: Long, hashvalue: Long, hashsize: Long, rejectdetail: Long): HRESULT
}

public typealias PIBIO_ENGINE_VERIFY_FEATURE_SET_FN = PIBIO_ENGINE_VERIFY_FEATURE_SET_FNFn?

public fun interface PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FNFn {
    public operator fun invoke(pipeline: Long, allocationsize: ULong, address: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FN = PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FNFn?

public fun interface PIBIO_FRAMEWORK_FREE_MEMORY_FNFn {
    public operator fun invoke(pipeline: Long, address: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_FREE_MEMORY_FN = PIBIO_FRAMEWORK_FREE_MEMORY_FNFn?

public fun interface PIBIO_FRAMEWORK_GET_PROPERTY_FNFn {
    public operator fun invoke(pipeline: Long, propertytype: UInt, propertyid: UInt, identity: Long, subfactor: UByte, propertybuffer: Long, propertybuffersize: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_GET_PROPERTY_FN = PIBIO_FRAMEWORK_GET_PROPERTY_FNFn?

public fun interface PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FNFn {
    public operator fun invoke(pipeline: Long, securebufferidentifier: GUID, securebufferaddress: Long, securebuffersize: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FN = PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FNFn?

public fun interface PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FNFn {
    public operator fun invoke(pipeline: Long, securebufferidentifier: GUID): HRESULT
}

public typealias PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FN = PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FNFn?

public fun interface PIBIO_FRAMEWORK_SET_UNIT_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, extendedstatus: Long, extendedstatussize: ULong): HRESULT
}

public typealias PIBIO_FRAMEWORK_SET_UNIT_STATUS_FN = PIBIO_FRAMEWORK_SET_UNIT_STATUS_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FN = PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FNFn {
    public operator fun invoke(pipeline: Long, requiredcapacity: Long, maxbuffersize: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FN = PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FN = PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FNFn {
    public operator fun invoke(pipeline: Long, bufferaddress: Long, buffersize: ULong, returneddatasize: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FN = PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FNFn {
    public operator fun invoke(pipeline: Long, requiredcapacity: ULong, maxbuffersize: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FN = PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FN = PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FNFn {
    public operator fun invoke(pipeline: Long, bufferaddress: Long, buffersize: ULong): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FN = PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FNFn {
    public operator fun invoke(pipeline: Long, authentication: Long, authenticationsize: ULong, iv: Long, ivsize: ULong, encrypteddata: Long, encrypteddatasize: ULong): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FN = PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, secureidentitycount: Long, secureidentities: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FN = PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FNFn {
    public operator fun invoke(pipeline: Long, reserved1: ULong, reserved2: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FN = PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FNFn {
    public operator fun invoke(pipeline: Long, reserved1: Long, reserved2: ULong): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FN = PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FNFn?

public fun interface PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FN = PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FNFn?

public fun interface PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FNFn {
    public operator fun invoke(pipeline: Long, calibrationbuffer: Long, calibrationbuffersize: ULong): HRESULT
}

public typealias PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FN = PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FNFn?

public fun interface PIBIO_SENSOR_ACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_ACTIVATE_FN = PIBIO_SENSOR_ACTIVATE_FNFn?

public fun interface PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FNFn {
    public operator fun invoke(pipeline: Long, rawbufferaddress: Long, rawbuffersize: ULong, resultbufferaddress: Long, resultbuffersize: Long): HRESULT
}

public typealias PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN = PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FNFn?

public fun interface PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FNFn {
    public operator fun invoke(pipeline: Long, securebufferidentifier: GUID, metadatabufferaddress: Long, metadatabuffersize: ULong, resultbufferaddress: Long, resultbuffersize: Long): HRESULT
}

public typealias PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN = PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FNFn?

public fun interface PIBIO_SENSOR_ATTACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_ATTACH_FN = PIBIO_SENSOR_ATTACH_FNFn?

public fun interface PIBIO_SENSOR_CANCEL_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_CANCEL_FN = PIBIO_SENSOR_CANCEL_FNFn?

public fun interface PIBIO_SENSOR_CLEAR_CONTEXT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_CLEAR_CONTEXT_FN = PIBIO_SENSOR_CLEAR_CONTEXT_FNFn?

public fun interface PIBIO_SENSOR_CONNECT_SECURE_FNFn {
    public operator fun invoke(pipeline: Long, connectionparams: Long, connectiondata: Long): HRESULT
}

public typealias PIBIO_SENSOR_CONNECT_SECURE_FN = PIBIO_SENSOR_CONNECT_SECURE_FNFn?

public fun interface PIBIO_SENSOR_CONTROL_UNIT_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_SENSOR_CONTROL_UNIT_FN = PIBIO_SENSOR_CONTROL_UNIT_FNFn?

public fun interface PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FN = PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FNFn?

public fun interface PIBIO_SENSOR_DEACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_DEACTIVATE_FN = PIBIO_SENSOR_DEACTIVATE_FNFn?

public fun interface PIBIO_SENSOR_DETACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_DETACH_FN = PIBIO_SENSOR_DETACH_FNFn?

public fun interface PIBIO_SENSOR_EXPORT_SENSOR_DATA_FNFn {
    public operator fun invoke(pipeline: Long, samplebuffer: Long, samplesize: Long): HRESULT
}

public typealias PIBIO_SENSOR_EXPORT_SENSOR_DATA_FN = PIBIO_SENSOR_EXPORT_SENSOR_DATA_FNFn?

public fun interface PIBIO_SENSOR_FINISH_CAPTURE_FNFn {
    public operator fun invoke(pipeline: Long, rejectdetail: Long): HRESULT
}

public typealias PIBIO_SENSOR_FINISH_CAPTURE_FN = PIBIO_SENSOR_FINISH_CAPTURE_FNFn?

public fun interface PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FNFn {
    public operator fun invoke(pipeline: Long, reason: Long): HRESULT
}

public typealias PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FN = PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FNFn?

public fun interface PIBIO_SENSOR_GET_INDICATOR_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, indicatorstatus: Long): HRESULT
}

public typealias PIBIO_SENSOR_GET_INDICATOR_STATUS_FN = PIBIO_SENSOR_GET_INDICATOR_STATUS_FNFn?

public fun interface PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FNFn {
    public operator fun invoke(pipeline: Long, powereventtype: UInt): HRESULT
}

public typealias PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN = PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FNFn?

public fun interface PIBIO_SENSOR_PIPELINE_CLEANUP_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_PIPELINE_CLEANUP_FN = PIBIO_SENSOR_PIPELINE_CLEANUP_FNFn?

public fun interface PIBIO_SENSOR_PIPELINE_INIT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_PIPELINE_INIT_FN = PIBIO_SENSOR_PIPELINE_INIT_FNFn?

public fun interface PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FNFn {
    public operator fun invoke(pipeline: Long, purpose: UByte, flags: UByte, rejectdetail: Long): HRESULT
}

public typealias PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN = PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FNFn?

public fun interface PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FNFn {
    public operator fun invoke(pipeline: Long, formatarray: Long, formatarraysize: ULong, formatcount: Long): HRESULT
}

public typealias PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FN = PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FNFn?

public fun interface PIBIO_SENSOR_QUERY_EXTENDED_INFO_FNFn {
    public operator fun invoke(pipeline: Long, sensorinfo: Long, sensorinfosize: ULong): HRESULT
}

public typealias PIBIO_SENSOR_QUERY_EXTENDED_INFO_FN = PIBIO_SENSOR_QUERY_EXTENDED_INFO_FNFn?

public fun interface PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FNFn {
    public operator fun invoke(pipeline: Long, typeinfobufferaddress: Long, typeinfobuffersize: ULong, typeinfodatasize: Long): HRESULT
}

public typealias PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FN = PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FNFn?

public fun interface PIBIO_SENSOR_QUERY_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, status: Long): HRESULT
}

public typealias PIBIO_SENSOR_QUERY_STATUS_FN = PIBIO_SENSOR_QUERY_STATUS_FNFn?

public fun interface PIBIO_SENSOR_RESET_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_SENSOR_RESET_FN = PIBIO_SENSOR_RESET_FNFn?

public fun interface PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FNFn {
    public operator fun invoke(pipeline: Long, format: Long): HRESULT
}

public typealias PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FN = PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FNFn?

public fun interface PIBIO_SENSOR_SET_INDICATOR_STATUS_FNFn {
    public operator fun invoke(pipeline: Long, indicatorstatus: UInt): HRESULT
}

public typealias PIBIO_SENSOR_SET_INDICATOR_STATUS_FN = PIBIO_SENSOR_SET_INDICATOR_STATUS_FNFn?

public fun interface PIBIO_SENSOR_SET_MODE_FNFn {
    public operator fun invoke(pipeline: Long, mode: UInt): HRESULT
}

public typealias PIBIO_SENSOR_SET_MODE_FN = PIBIO_SENSOR_SET_MODE_FNFn?

public fun interface PIBIO_SENSOR_START_CAPTURE_EX_FNFn {
    public operator fun invoke(pipeline: Long, purpose: UByte, nonce: Long, noncesize: ULong, flags: UByte, overlapped: Long): HRESULT
}

public typealias PIBIO_SENSOR_START_CAPTURE_EX_FN = PIBIO_SENSOR_START_CAPTURE_EX_FNFn?

public fun interface PIBIO_SENSOR_START_CAPTURE_FNFn {
    public operator fun invoke(pipeline: Long, purpose: UByte, overlapped: Long): HRESULT
}

public typealias PIBIO_SENSOR_START_CAPTURE_FN = PIBIO_SENSOR_START_CAPTURE_FNFn?

public fun interface PIBIO_SENSOR_START_NOTIFY_WAKE_FNFn {
    public operator fun invoke(pipeline: Long, overlapped: Long): HRESULT
}

public typealias PIBIO_SENSOR_START_NOTIFY_WAKE_FN = PIBIO_SENSOR_START_NOTIFY_WAKE_FNFn?

public fun interface PIBIO_STORAGE_ACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_ACTIVATE_FN = PIBIO_STORAGE_ACTIVATE_FNFn?

public fun interface PIBIO_STORAGE_ADD_RECORD_FNFn {
    public operator fun invoke(pipeline: Long, recordcontents: Long): HRESULT
}

public typealias PIBIO_STORAGE_ADD_RECORD_FN = PIBIO_STORAGE_ADD_RECORD_FNFn?

public fun interface PIBIO_STORAGE_ATTACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_ATTACH_FN = PIBIO_STORAGE_ATTACH_FNFn?

public fun interface PIBIO_STORAGE_CLEAR_CONTEXT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_CLEAR_CONTEXT_FN = PIBIO_STORAGE_CLEAR_CONTEXT_FNFn?

public fun interface PIBIO_STORAGE_CLOSE_DATABASE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_CLOSE_DATABASE_FN = PIBIO_STORAGE_CLOSE_DATABASE_FNFn?

public fun interface PIBIO_STORAGE_CONTROL_UNIT_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_STORAGE_CONTROL_UNIT_FN = PIBIO_STORAGE_CONTROL_UNIT_FNFn?

public fun interface PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FNFn {
    public operator fun invoke(pipeline: Long, controlcode: UInt, sendbuffer: Long, sendbuffersize: ULong, receivebuffer: Long, receivebuffersize: ULong, receivedatasize: Long, operationstatus: Long): HRESULT
}

public typealias PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FN = PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FNFn?

public fun interface PIBIO_STORAGE_CREATE_DATABASE_FNFn {
    public operator fun invoke(pipeline: Long, databaseid: Long, factor: UInt, format: Long, filepath: PCWSTR, connectstring: PCWSTR, indexelementcount: ULong, initialsize: ULong): HRESULT
}

public typealias PIBIO_STORAGE_CREATE_DATABASE_FN = PIBIO_STORAGE_CREATE_DATABASE_FNFn?

public fun interface PIBIO_STORAGE_DEACTIVATE_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_DEACTIVATE_FN = PIBIO_STORAGE_DEACTIVATE_FNFn?

public fun interface PIBIO_STORAGE_DELETE_RECORD_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: UByte): HRESULT
}

public typealias PIBIO_STORAGE_DELETE_RECORD_FN = PIBIO_STORAGE_DELETE_RECORD_FNFn?

public fun interface PIBIO_STORAGE_DETACH_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_DETACH_FN = PIBIO_STORAGE_DETACH_FNFn?

public fun interface PIBIO_STORAGE_ERASE_DATABASE_FNFn {
    public operator fun invoke(pipeline: Long, databaseid: Long, filepath: PCWSTR, connectstring: PCWSTR): HRESULT
}

public typealias PIBIO_STORAGE_ERASE_DATABASE_FN = PIBIO_STORAGE_ERASE_DATABASE_FNFn?

public fun interface PIBIO_STORAGE_FIRST_RECORD_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_FIRST_RECORD_FN = PIBIO_STORAGE_FIRST_RECORD_FNFn?

public fun interface PIBIO_STORAGE_GET_CURRENT_RECORD_FNFn {
    public operator fun invoke(pipeline: Long, recordcontents: Long): HRESULT
}

public typealias PIBIO_STORAGE_GET_CURRENT_RECORD_FN = PIBIO_STORAGE_GET_CURRENT_RECORD_FNFn?

public fun interface PIBIO_STORAGE_GET_DATABASE_SIZE_FNFn {
    public operator fun invoke(pipeline: Long, availablerecordcount: Long, totalrecordcount: Long): HRESULT
}

public typealias PIBIO_STORAGE_GET_DATABASE_SIZE_FN = PIBIO_STORAGE_GET_DATABASE_SIZE_FNFn?

public fun interface PIBIO_STORAGE_GET_DATA_FORMAT_FNFn {
    public operator fun invoke(pipeline: Long, format: Long, version: Long): HRESULT
}

public typealias PIBIO_STORAGE_GET_DATA_FORMAT_FN = PIBIO_STORAGE_GET_DATA_FORMAT_FNFn?

public fun interface PIBIO_STORAGE_GET_RECORD_COUNT_FNFn {
    public operator fun invoke(pipeline: Long, recordcount: Long): HRESULT
}

public typealias PIBIO_STORAGE_GET_RECORD_COUNT_FN = PIBIO_STORAGE_GET_RECORD_COUNT_FNFn?

public fun interface PIBIO_STORAGE_NEXT_RECORD_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_NEXT_RECORD_FN = PIBIO_STORAGE_NEXT_RECORD_FNFn?

public fun interface PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FNFn {
    public operator fun invoke(pipeline: Long, recordsadded: Boolean): HRESULT
}

public typealias PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FN = PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FNFn?

public fun interface PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FNFn {
    public operator fun invoke(pipeline: Long, powereventtype: UInt): HRESULT
}

public typealias PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN = PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FNFn?

public fun interface PIBIO_STORAGE_OPEN_DATABASE_FNFn {
    public operator fun invoke(pipeline: Long, databaseid: Long, filepath: PCWSTR, connectstring: PCWSTR): HRESULT
}

public typealias PIBIO_STORAGE_OPEN_DATABASE_FN = PIBIO_STORAGE_OPEN_DATABASE_FNFn?

public fun interface PIBIO_STORAGE_PIPELINE_CLEANUP_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_PIPELINE_CLEANUP_FN = PIBIO_STORAGE_PIPELINE_CLEANUP_FNFn?

public fun interface PIBIO_STORAGE_PIPELINE_INIT_FNFn {
    public operator fun invoke(pipeline: Long): HRESULT
}

public typealias PIBIO_STORAGE_PIPELINE_INIT_FN = PIBIO_STORAGE_PIPELINE_INIT_FNFn?

public fun interface PIBIO_STORAGE_QUERY_BY_CONTENT_FNFn {
    public operator fun invoke(pipeline: Long, subfactor: UByte, indexvector: Long, indexelementcount: ULong): HRESULT
}

public typealias PIBIO_STORAGE_QUERY_BY_CONTENT_FN = PIBIO_STORAGE_QUERY_BY_CONTENT_FNFn?

public fun interface PIBIO_STORAGE_QUERY_BY_SUBJECT_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: UByte): HRESULT
}

public typealias PIBIO_STORAGE_QUERY_BY_SUBJECT_FN = PIBIO_STORAGE_QUERY_BY_SUBJECT_FNFn?

public fun interface PIBIO_STORAGE_QUERY_EXTENDED_INFO_FNFn {
    public operator fun invoke(pipeline: Long, storageinfo: Long, storageinfosize: ULong): HRESULT
}

public typealias PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN = PIBIO_STORAGE_QUERY_EXTENDED_INFO_FNFn?

public fun interface PIBIO_STORAGE_RESERVED_1_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, reserved1: Long, reserved2: Long): HRESULT
}

public typealias PIBIO_STORAGE_RESERVED_1_FN = PIBIO_STORAGE_RESERVED_1_FNFn?

public fun interface PIBIO_STORAGE_RESERVED_2_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long): HRESULT
}

public typealias PIBIO_STORAGE_RESERVED_2_FN = PIBIO_STORAGE_RESERVED_2_FNFn?

public fun interface PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FNFn {
    public operator fun invoke(pipeline: Long, identity: Long, subfactor: UByte, recordcontents: Long): HRESULT
}

public typealias PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FN = PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FNFn?

public fun interface PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FNFn {
    public operator fun invoke(pipeline: Long, recordcontents: Long): HRESULT
}

public typealias PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FN = PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FNFn?

public fun interface PWINBIO_ASYNC_COMPLETION_CALLBACKFn {
    public operator fun invoke(asyncresult: Long)
}

public typealias PWINBIO_ASYNC_COMPLETION_CALLBACK = PWINBIO_ASYNC_COMPLETION_CALLBACKFn?

public fun interface PWINBIO_CAPTURE_CALLBACKFn {
    public operator fun invoke(capturecallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, sample: Long, samplesize: ULong, rejectdetail: UInt)
}

public typealias PWINBIO_CAPTURE_CALLBACK = PWINBIO_CAPTURE_CALLBACKFn?

public fun interface PWINBIO_ENROLL_CAPTURE_CALLBACKFn {
    public operator fun invoke(enrollcallbackcontext: Long, operationstatus: HRESULT, rejectdetail: UInt)
}

public typealias PWINBIO_ENROLL_CAPTURE_CALLBACK = PWINBIO_ENROLL_CAPTURE_CALLBACKFn?

public fun interface PWINBIO_EVENT_CALLBACKFn {
    public operator fun invoke(eventcallbackcontext: Long, operationstatus: HRESULT, event: Long)
}

public typealias PWINBIO_EVENT_CALLBACK = PWINBIO_EVENT_CALLBACKFn?

public fun interface PWINBIO_IDENTIFY_CALLBACKFn {
    public operator fun invoke(identifycallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, identity: Long, subfactor: UByte, rejectdetail: UInt)
}

public typealias PWINBIO_IDENTIFY_CALLBACK = PWINBIO_IDENTIFY_CALLBACKFn?

public fun interface PWINBIO_LOCATE_SENSOR_CALLBACKFn {
    public operator fun invoke(locatecallbackcontext: Long, operationstatus: HRESULT, unitid: UInt)
}

public typealias PWINBIO_LOCATE_SENSOR_CALLBACK = PWINBIO_LOCATE_SENSOR_CALLBACKFn?

public fun interface PWINBIO_QUERY_ENGINE_INTERFACE_FNFn {
    public operator fun invoke(engineinterface: Long): HRESULT
}

public typealias PWINBIO_QUERY_ENGINE_INTERFACE_FN = PWINBIO_QUERY_ENGINE_INTERFACE_FNFn?

public fun interface PWINBIO_QUERY_SENSOR_INTERFACE_FNFn {
    public operator fun invoke(sensorinterface: Long): HRESULT
}

public typealias PWINBIO_QUERY_SENSOR_INTERFACE_FN = PWINBIO_QUERY_SENSOR_INTERFACE_FNFn?

public fun interface PWINBIO_QUERY_STORAGE_INTERFACE_FNFn {
    public operator fun invoke(storageinterface: Long): HRESULT
}

public typealias PWINBIO_QUERY_STORAGE_INTERFACE_FN = PWINBIO_QUERY_STORAGE_INTERFACE_FNFn?

public fun interface PWINBIO_VERIFY_CALLBACKFn {
    public operator fun invoke(verifycallbackcontext: Long, operationstatus: HRESULT, unitid: UInt, match: Boolean, rejectdetail: UInt)
}

public typealias PWINBIO_VERIFY_CALLBACK = PWINBIO_VERIFY_CALLBACKFn?

public typealias WINBIO_ANTI_SPOOF_POLICY_ACTION = Int

public typealias WINBIO_ASYNC_NOTIFICATION_METHOD = Int

public typealias WINBIO_COMPONENT = UInt

public typealias WINBIO_CREDENTIAL_FORMAT = Int

public typealias WINBIO_CREDENTIAL_STATE = Int

public typealias WINBIO_CREDENTIAL_TYPE = Int

public typealias WINBIO_POLICY_SOURCE = Int

public typealias WINBIO_POOL = UInt

public typealias WINBIO_SETTING_SOURCE = UInt

public typealias WINIBIO_ENGINE_CONTEXT = Long

public typealias WINIBIO_SENSOR_CONTEXT = Long

public typealias WINIBIO_STORAGE_CONTEXT = Long
