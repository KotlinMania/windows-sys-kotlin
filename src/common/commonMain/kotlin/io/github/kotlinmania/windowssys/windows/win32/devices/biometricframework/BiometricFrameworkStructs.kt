@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT

public data class WINBIO_ACCOUNT_POLICY(public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(), public var AntiSpoofBehavior: WINBIO_ANTI_SPOOF_POLICY_ACTION = 0)

public data class WINBIO_ADAPTER_INTERFACE_VERSION(public var MajorVersion: UShort = 0u, public var MinorVersion: UShort = 0u)

public data class WINBIO_ANTI_SPOOF_POLICY(public var Action: WINBIO_ANTI_SPOOF_POLICY_ACTION = 0, public var Source: WINBIO_POLICY_SOURCE = 0)

public data class WINBIO_ASYNC_RESULT(
    public var SessionHandle: UInt = 0u,
    public var Operation: UInt = 0u,
    public var SequenceNumber: ULong = 0uL,
    public var TimeStamp: Long = 0L,
    public var ApiStatus: HRESULT = 0,
    public var UnitId: UInt = 0u,
    public var UserData: Long = 0L,
    public var Parameters: WINBIO_ASYNC_RESULT_0 = WINBIO_ASYNC_RESULT_0(),
)

public class WINBIO_ASYNC_RESULT_0(
    public var Verify: WINBIO_ASYNC_RESULT_0_0 = WINBIO_ASYNC_RESULT_0_0(),
    public var Identify: WINBIO_ASYNC_RESULT_0_1 = WINBIO_ASYNC_RESULT_0_1(),
    public var EnrollBegin: WINBIO_ASYNC_RESULT_0_2 = WINBIO_ASYNC_RESULT_0_2(),
    public var EnrollCapture: WINBIO_ASYNC_RESULT_0_3 = WINBIO_ASYNC_RESULT_0_3(),
    public var EnrollCommit: WINBIO_ASYNC_RESULT_0_4 = WINBIO_ASYNC_RESULT_0_4(),
    public var EnumEnrollments: WINBIO_ASYNC_RESULT_0_5 = WINBIO_ASYNC_RESULT_0_5(),
    public var CaptureSample: WINBIO_ASYNC_RESULT_0_6 = WINBIO_ASYNC_RESULT_0_6(),
    public var DeleteTemplate: WINBIO_ASYNC_RESULT_0_7 = WINBIO_ASYNC_RESULT_0_7(),
    public var GetProperty: WINBIO_ASYNC_RESULT_0_8 = WINBIO_ASYNC_RESULT_0_8(),
    public var SetProperty: WINBIO_ASYNC_RESULT_0_9 = WINBIO_ASYNC_RESULT_0_9(),
    public var GetEvent: WINBIO_ASYNC_RESULT_0_10 = WINBIO_ASYNC_RESULT_0_10(),
    public var ControlUnit: WINBIO_ASYNC_RESULT_0_11 = WINBIO_ASYNC_RESULT_0_11(),
    public var EnumServiceProviders: WINBIO_ASYNC_RESULT_0_12 = WINBIO_ASYNC_RESULT_0_12(),
    public var EnumBiometricUnits: WINBIO_ASYNC_RESULT_0_13 = WINBIO_ASYNC_RESULT_0_13(),
    public var EnumDatabases: WINBIO_ASYNC_RESULT_0_14 = WINBIO_ASYNC_RESULT_0_14(),
    public var VerifyAndReleaseTicket: WINBIO_ASYNC_RESULT_0_15 = WINBIO_ASYNC_RESULT_0_15(),
    public var IdentifyAndReleaseTicket: WINBIO_ASYNC_RESULT_0_16 = WINBIO_ASYNC_RESULT_0_16(),
    public var EnrollSelect: WINBIO_ASYNC_RESULT_0_17 = WINBIO_ASYNC_RESULT_0_17(),
    public var MonitorPresence: WINBIO_ASYNC_RESULT_0_18 = WINBIO_ASYNC_RESULT_0_18(),
    public var GetProtectionPolicy: WINBIO_ASYNC_RESULT_0_19 = WINBIO_ASYNC_RESULT_0_19(),
    public var NotifyUnitStatusChange: WINBIO_ASYNC_RESULT_0_20 = WINBIO_ASYNC_RESULT_0_20(),
)

public data class WINBIO_ASYNC_RESULT_0_6(
    public var Sample: Long = 0L,
    public var SampleSize: ULong = 0uL,
    public var RejectDetail: UInt = 0u,
)

public data class WINBIO_ASYNC_RESULT_0_11(
    public var Component: WINBIO_COMPONENT = 0u,
    public var ControlCode: UInt = 0u,
    public var OperationStatus: UInt = 0u,
    public var SendBuffer: Long = 0L,
    public var SendBufferSize: ULong = 0uL,
    public var ReceiveBuffer: Long = 0L,
    public var ReceiveBufferSize: ULong = 0uL,
    public var ReceiveDataSize: ULong = 0uL,
)

public data class WINBIO_ASYNC_RESULT_0_7(public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(), public var SubFactor: UByte = 0u)

public data class WINBIO_ASYNC_RESULT_0_2(public var SubFactor: UByte = 0u)

public data class WINBIO_ASYNC_RESULT_0_3(public var RejectDetail: UInt = 0u)

public data class WINBIO_ASYNC_RESULT_0_4(public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(), public var IsNewTemplate: Boolean = false)

public data class WINBIO_ASYNC_RESULT_0_17(public var SelectorValue: ULong = 0uL)

public data class WINBIO_ASYNC_RESULT_0_13(public var UnitCount: ULong = 0uL, public var UnitSchemaArray: Long = 0L)

public data class WINBIO_ASYNC_RESULT_0_14(public var StorageCount: ULong = 0uL, public var StorageSchemaArray: Long = 0L)

public data class WINBIO_ASYNC_RESULT_0_5(
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactorCount: ULong = 0uL,
    public var SubFactorArray: Long = 0L,
)

public data class WINBIO_ASYNC_RESULT_0_12(public var BspCount: ULong = 0uL, public var BspSchemaArray: Long = 0L)

public data class WINBIO_ASYNC_RESULT_0_10(public var Event: WINBIO_EVENT = WINBIO_EVENT())

public data class WINBIO_ASYNC_RESULT_0_8(
    public var PropertyType: UInt = 0u,
    public var PropertyId: UInt = 0u,
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactor: UByte = 0u,
    public var PropertyBufferSize: ULong = 0uL,
    public var PropertyBuffer: Long = 0L,
)

public data class WINBIO_ASYNC_RESULT_0_19(public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(), public var Policy: WINBIO_PROTECTION_POLICY = WINBIO_PROTECTION_POLICY())

public data class WINBIO_ASYNC_RESULT_0_16(
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactor: UByte = 0u,
    public var RejectDetail: UInt = 0u,
    public var Ticket: ULong = 0uL,
)

public data class WINBIO_ASYNC_RESULT_0_1(
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactor: UByte = 0u,
    public var RejectDetail: UInt = 0u,
)

public data class WINBIO_ASYNC_RESULT_0_18(
    public var ChangeType: UInt = 0u,
    public var PresenceCount: ULong = 0uL,
    public var PresenceArray: Long = 0L,
)

public data class WINBIO_ASYNC_RESULT_0_20(public var ExtendedStatus: WINBIO_EXTENDED_UNIT_STATUS = WINBIO_EXTENDED_UNIT_STATUS())

public data class WINBIO_ASYNC_RESULT_0_9(
    public var PropertyType: UInt = 0u,
    public var PropertyId: UInt = 0u,
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactor: UByte = 0u,
    public var PropertyBufferSize: ULong = 0uL,
    public var PropertyBuffer: Long = 0L,
)

public data class WINBIO_ASYNC_RESULT_0_15(
    public var Match: Boolean = false,
    public var RejectDetail: UInt = 0u,
    public var Ticket: ULong = 0uL,
)

public data class WINBIO_ASYNC_RESULT_0_0(public var Match: Boolean = false, public var RejectDetail: UInt = 0u)

public data class WINBIO_BDB_ANSI_381_HEADER(
    public var RecordLength: ULong = 0uL,
    public var FormatIdentifier: UInt = 0u,
    public var VersionNumber: UInt = 0u,
    public var ProductId: WINBIO_REGISTERED_FORMAT = WINBIO_REGISTERED_FORMAT(),
    public var CaptureDeviceId: UShort = 0u,
    public var ImageAcquisitionLevel: UShort = 0u,
    public var HorizontalScanResolution: UShort = 0u,
    public var VerticalScanResolution: UShort = 0u,
    public var HorizontalImageResolution: UShort = 0u,
    public var VerticalImageResolution: UShort = 0u,
    public var ElementCount: UByte = 0u,
    public var ScaleUnits: UByte = 0u,
    public var PixelDepth: UByte = 0u,
    public var ImageCompressionAlg: UByte = 0u,
    public var Reserved: UShort = 0u,
)

public data class WINBIO_BDB_ANSI_381_RECORD(
    public var BlockLength: UInt = 0u,
    public var HorizontalLineLength: UShort = 0u,
    public var VerticalLineLength: UShort = 0u,
    public var Position: UByte = 0u,
    public var CountOfViews: UByte = 0u,
    public var ViewNumber: UByte = 0u,
    public var ImageQuality: UByte = 0u,
    public var ImpressionType: UByte = 0u,
    public var Reserved: UByte = 0u,
)

public data class WINBIO_BIR(
    public var HeaderBlock: WINBIO_BIR_DATA = WINBIO_BIR_DATA(),
    public var StandardDataBlock: WINBIO_BIR_DATA = WINBIO_BIR_DATA(),
    public var VendorDataBlock: WINBIO_BIR_DATA = WINBIO_BIR_DATA(),
    public var SignatureBlock: WINBIO_BIR_DATA = WINBIO_BIR_DATA(),
)

public data class WINBIO_BIR_DATA(public var Size: UInt = 0u, public var Offset: UInt = 0u)

public data class WINBIO_BIR_HEADER(
    public var ValidFields: UShort = 0u,
    public var HeaderVersion: UByte = 0u,
    public var PatronHeaderVersion: UByte = 0u,
    public var DataFlags: UByte = 0u,
    public var Type: UInt = 0u,
    public var Subtype: UByte = 0u,
    public var Purpose: UByte = 0u,
    public var DataQuality: Byte = 0,
    public var CreationDate: Long = 0L,
    public var ValidityPeriod: WINBIO_BIR_HEADER_0 = WINBIO_BIR_HEADER_0(),
    public var BiometricDataFormat: WINBIO_REGISTERED_FORMAT = WINBIO_REGISTERED_FORMAT(),
    public var ProductId: WINBIO_REGISTERED_FORMAT = WINBIO_REGISTERED_FORMAT(),
)

public data class WINBIO_BIR_HEADER_0(public var BeginDate: Long = 0L, public var EndDate: Long = 0L)

public data class WINBIO_BLANK_PAYLOAD(public var PayloadSize: UInt = 0u, public var WinBioHresult: HRESULT = 0)

public data class WINBIO_BSP_SCHEMA(
    public var BiometricFactor: UInt = 0u,
    public var BspId: GUID = GUID(),
    public var Description: UShortArray = UShortArray(256),
    public var Vendor: UShortArray = UShortArray(256),
    public var Version: WINBIO_VERSION = WINBIO_VERSION(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_BSP_SCHEMA) return false
        if (this.BiometricFactor != other.BiometricFactor) return false
        if (this.BspId != other.BspId) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.Vendor.contentEquals(other.Vendor)) return false
        if (this.Version != other.Version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BiometricFactor.hashCode()
        result = 31 * result + this.BspId.hashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.Vendor.contentHashCode()
        result = 31 * result + this.Version.hashCode()
        return result
    }
}

public data class WINBIO_CALIBRATION_INFO(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var CalibrationData: WINBIO_DATA = WINBIO_DATA(),
)

public data class WINBIO_CAPTURE_DATA(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var SensorStatus: UInt = 0u,
    public var RejectDetail: UInt = 0u,
    public var CaptureData: WINBIO_DATA = WINBIO_DATA(),
)

public data class WINBIO_CAPTURE_PARAMETERS(
    public var PayloadSize: UInt = 0u,
    public var Purpose: UByte = 0u,
    public var Format: WINBIO_REGISTERED_FORMAT = WINBIO_REGISTERED_FORMAT(),
    public var VendorFormat: GUID = GUID(),
    public var Flags: UByte = 0u,
)

public data class WINBIO_DATA(public var Size: UInt = 0u, public var Data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_DATA) return false
        if (this.Size != other.Size) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WINBIO_DIAGNOSTICS(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var SensorStatus: UInt = 0u,
    public var VendorDiagnostics: WINBIO_DATA = WINBIO_DATA(),
)

public data class WINBIO_ENCRYPTED_CAPTURE_PARAMS(
    public var PayloadSize: UInt = 0u,
    public var Purpose: UByte = 0u,
    public var Format: WINBIO_REGISTERED_FORMAT = WINBIO_REGISTERED_FORMAT(),
    public var VendorFormat: GUID = GUID(),
    public var Flags: UByte = 0u,
    public var NonceSize: UInt = 0u,
)

public class WINBIO_ENGINE_INTERFACE(
    public var Version: WINBIO_ADAPTER_INTERFACE_VERSION = WINBIO_ADAPTER_INTERFACE_VERSION(),
    public var Type: UInt = 0u,
    public var Size: ULong = 0uL,
    public var AdapterId: GUID = GUID(),
    public var Attach: PIBIO_ENGINE_ATTACH_FN = null,
    public var Detach: PIBIO_ENGINE_DETACH_FN = null,
    public var ClearContext: PIBIO_ENGINE_CLEAR_CONTEXT_FN = null,
    public var QueryPreferredFormat: PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FN = null,
    public var QueryIndexVectorSize: PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FN = null,
    public var QueryHashAlgorithms: PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FN = null,
    public var SetHashAlgorithm: PIBIO_ENGINE_SET_HASH_ALGORITHM_FN = null,
    public var QuerySampleHint: PIBIO_ENGINE_QUERY_SAMPLE_HINT_FN = null,
    public var AcceptSampleData: PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FN = null,
    public var ExportEngineData: PIBIO_ENGINE_EXPORT_ENGINE_DATA_FN = null,
    public var VerifyFeatureSet: PIBIO_ENGINE_VERIFY_FEATURE_SET_FN = null,
    public var IdentifyFeatureSet: PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FN = null,
    public var CreateEnrollment: PIBIO_ENGINE_CREATE_ENROLLMENT_FN = null,
    public var UpdateEnrollment: PIBIO_ENGINE_UPDATE_ENROLLMENT_FN = null,
    public var GetEnrollmentStatus: PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FN = null,
    public var GetEnrollmentHash: PIBIO_ENGINE_GET_ENROLLMENT_HASH_FN = null,
    public var CheckForDuplicate: PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FN = null,
    public var CommitEnrollment: PIBIO_ENGINE_COMMIT_ENROLLMENT_FN = null,
    public var DiscardEnrollment: PIBIO_ENGINE_DISCARD_ENROLLMENT_FN = null,
    public var ControlUnit: PIBIO_ENGINE_CONTROL_UNIT_FN = null,
    public var ControlUnitPrivileged: PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FN = null,
    public var NotifyPowerChange: PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FN = null,
    public var Reserved_1: PIBIO_ENGINE_RESERVED_1_FN = null,
    public var PipelineInit: PIBIO_ENGINE_PIPELINE_INIT_FN = null,
    public var PipelineCleanup: PIBIO_ENGINE_PIPELINE_CLEANUP_FN = null,
    public var Activate: PIBIO_ENGINE_ACTIVATE_FN = null,
    public var Deactivate: PIBIO_ENGINE_DEACTIVATE_FN = null,
    public var QueryExtendedInfo: PIBIO_ENGINE_QUERY_EXTENDED_INFO_FN = null,
    public var IdentifyAll: PIBIO_ENGINE_IDENTIFY_ALL_FN = null,
    public var SetEnrollmentSelector: PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FN = null,
    public var SetEnrollmentParameters: PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FN = null,
    public var QueryExtendedEnrollmentStatus: PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FN = null,
    public var RefreshCache: PIBIO_ENGINE_REFRESH_CACHE_FN = null,
    public var SelectCalibrationFormat: PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FN = null,
    public var QueryCalibrationData: PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FN = null,
    public var SetAccountPolicy: PIBIO_ENGINE_SET_ACCOUNT_POLICY_FN = null,
    public var CreateKey: PIBIO_ENGINE_CREATE_KEY_FN = null,
    public var IdentifyFeatureSetSecure: PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FN = null,
    public var AcceptPrivateSensorTypeInfo: PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FN = null,
    public var CreateEnrollmentAuthenticated: PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FN = null,
    public var IdentifyFeatureSetAuthenticated: PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FN = null,
)

public data class WINBIO_EVENT(public var Type: UInt = 0u, public var Parameters: WINBIO_EVENT_0 = WINBIO_EVENT_0())

public data class WINBIO_EVENT_0(
    public var Unclaimed: WINBIO_EVENT_0_0 = WINBIO_EVENT_0_0(),
    public var UnclaimedIdentify: WINBIO_EVENT_0_1 = WINBIO_EVENT_0_1(),
    public var Error: WINBIO_EVENT_0_2 = WINBIO_EVENT_0_2(),
)

public data class WINBIO_EVENT_0_2(public var ErrorCode: HRESULT = 0)

public data class WINBIO_EVENT_0_1(
    public var UnitId: UInt = 0u,
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var SubFactor: UByte = 0u,
    public var RejectDetail: UInt = 0u,
)

public data class WINBIO_EVENT_0_0(public var UnitId: UInt = 0u, public var RejectDetail: UInt = 0u)

public data class WINBIO_EXTENDED_ENGINE_INFO(
    public var GenericEngineCapabilities: UInt = 0u,
    public var Factor: UInt = 0u,
    public var Specific: WINBIO_EXTENDED_ENGINE_INFO_0 = WINBIO_EXTENDED_ENGINE_INFO_0(),
)

public data class WINBIO_EXTENDED_ENGINE_INFO_0(
    public var Null: UInt = 0u,
    public var FacialFeatures: WINBIO_EXTENDED_ENGINE_INFO_0_0 = WINBIO_EXTENDED_ENGINE_INFO_0_0(),
    public var Fingerprint: WINBIO_EXTENDED_ENGINE_INFO_0_1 = WINBIO_EXTENDED_ENGINE_INFO_0_1(),
    public var Iris: WINBIO_EXTENDED_ENGINE_INFO_0_2 = WINBIO_EXTENDED_ENGINE_INFO_0_2(),
    public var Voice: WINBIO_EXTENDED_ENGINE_INFO_0_3 = WINBIO_EXTENDED_ENGINE_INFO_0_3(),
)

public data class WINBIO_EXTENDED_ENGINE_INFO_0_0(public var Capabilities: UInt = 0u, public var EnrollmentRequirements: WINBIO_EXTENDED_ENGINE_INFO_0_0_0 = WINBIO_EXTENDED_ENGINE_INFO_0_0_0())

public data class WINBIO_EXTENDED_ENGINE_INFO_0_0_0(public var Null: UInt = 0u)

public data class WINBIO_EXTENDED_ENGINE_INFO_0_1(public var Capabilities: UInt = 0u, public var EnrollmentRequirements: WINBIO_EXTENDED_ENGINE_INFO_0_1_0 = WINBIO_EXTENDED_ENGINE_INFO_0_1_0())

public data class WINBIO_EXTENDED_ENGINE_INFO_0_1_0(
    public var GeneralSamples: UInt = 0u,
    public var Center: UInt = 0u,
    public var TopEdge: UInt = 0u,
    public var BottomEdge: UInt = 0u,
    public var LeftEdge: UInt = 0u,
    public var RightEdge: UInt = 0u,
)

public data class WINBIO_EXTENDED_ENGINE_INFO_0_2(public var Capabilities: UInt = 0u, public var EnrollmentRequirements: WINBIO_EXTENDED_ENGINE_INFO_0_2_0 = WINBIO_EXTENDED_ENGINE_INFO_0_2_0())

public data class WINBIO_EXTENDED_ENGINE_INFO_0_2_0(public var Null: UInt = 0u)

public data class WINBIO_EXTENDED_ENGINE_INFO_0_3(public var Capabilities: UInt = 0u, public var EnrollmentRequirements: WINBIO_EXTENDED_ENGINE_INFO_0_3_0 = WINBIO_EXTENDED_ENGINE_INFO_0_3_0())

public data class WINBIO_EXTENDED_ENGINE_INFO_0_3_0(public var Null: UInt = 0u)

public data class WINBIO_EXTENDED_ENROLLMENT_PARAMETERS(public var Size: ULong = 0uL, public var SubFactor: UByte = 0u)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS(
    public var TemplateStatus: HRESULT = 0,
    public var RejectDetail: UInt = 0u,
    public var PercentComplete: UInt = 0u,
    public var Factor: UInt = 0u,
    public var SubFactor: UByte = 0u,
    public var Specific: WINBIO_EXTENDED_ENROLLMENT_STATUS_0 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0(),
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0(
    public var Null: UInt = 0u,
    public var FacialFeatures: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0(),
    public var Fingerprint: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_1 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_1(),
    public var Iris: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2(),
    public var Voice: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_3 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_3(),
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0(
    public var BoundingBox: RECT = RECT(),
    public var Distance: Int = 0,
    public var OpaqueEngineData: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0(),
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0(public var AdapterId: GUID = GUID(), public var Data: UIntArray = UIntArray(78)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0) return false
        if (this.AdapterId != other.AdapterId) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterId.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_1(
    public var GeneralSamples: UInt = 0u,
    public var Center: UInt = 0u,
    public var TopEdge: UInt = 0u,
    public var BottomEdge: UInt = 0u,
    public var LeftEdge: UInt = 0u,
    public var RightEdge: UInt = 0u,
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2(
    public var EyeBoundingBox_1: RECT = RECT(),
    public var EyeBoundingBox_2: RECT = RECT(),
    public var PupilCenter_1: POINT = POINT(),
    public var PupilCenter_2: POINT = POINT(),
    public var Distance: Int = 0,
    public var GridPointCompletionPercent: UInt = 0u,
    public var GridPointIndex: UShort = 0u,
    public var Point3D: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2_0 = WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2_0(),
    public var StopCaptureAndShowCriticalFeedback: BOOL = 0,
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2_0(
    public var X: Double = 0.0,
    public var Y: Double = 0.0,
    public var Z: Double = 0.0,
)

public data class WINBIO_EXTENDED_ENROLLMENT_STATUS_0_3(public var Reserved: UInt = 0u)

public data class WINBIO_EXTENDED_SENSOR_INFO(
    public var GenericSensorCapabilities: UInt = 0u,
    public var Factor: UInt = 0u,
    public var Specific: WINBIO_EXTENDED_SENSOR_INFO_0 = WINBIO_EXTENDED_SENSOR_INFO_0(),
)

public data class WINBIO_EXTENDED_SENSOR_INFO_0(
    public var Null: UInt = 0u,
    public var FacialFeatures: WINBIO_EXTENDED_SENSOR_INFO_0_0 = WINBIO_EXTENDED_SENSOR_INFO_0_0(),
    public var Fingerprint: WINBIO_EXTENDED_SENSOR_INFO_0_1 = WINBIO_EXTENDED_SENSOR_INFO_0_1(),
    public var Iris: WINBIO_EXTENDED_SENSOR_INFO_0_2 = WINBIO_EXTENDED_SENSOR_INFO_0_2(),
    public var Voice: WINBIO_EXTENDED_SENSOR_INFO_0_3 = WINBIO_EXTENDED_SENSOR_INFO_0_3(),
)

public data class WINBIO_EXTENDED_SENSOR_INFO_0_0(
    public var FrameSize: RECT = RECT(),
    public var FrameOffset: POINT = POINT(),
    public var MandatoryOrientation: UInt = 0u,
    public var HardwareInfo: WINBIO_EXTENDED_SENSOR_INFO_0_0_0 = WINBIO_EXTENDED_SENSOR_INFO_0_0_0(),
)

public data class WINBIO_EXTENDED_SENSOR_INFO_0_0_0(
    public var ColorSensorId: UShortArray = UShortArray(260),
    public var InfraredSensorId: UShortArray = UShortArray(260),
    public var InfraredSensorRotationAngle: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_EXTENDED_SENSOR_INFO_0_0_0) return false
        if (!this.ColorSensorId.contentEquals(other.ColorSensorId)) return false
        if (!this.InfraredSensorId.contentEquals(other.InfraredSensorId)) return false
        if (this.InfraredSensorRotationAngle != other.InfraredSensorRotationAngle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ColorSensorId.contentHashCode()
        result = 31 * result + this.InfraredSensorId.contentHashCode()
        result = 31 * result + this.InfraredSensorRotationAngle.hashCode()
        return result
    }
}

public data class WINBIO_EXTENDED_SENSOR_INFO_0_1(public var Reserved: UInt = 0u)

public data class WINBIO_EXTENDED_SENSOR_INFO_0_2(
    public var FrameSize: RECT = RECT(),
    public var FrameOffset: POINT = POINT(),
    public var MandatoryOrientation: UInt = 0u,
)

public data class WINBIO_EXTENDED_SENSOR_INFO_0_3(public var Reserved: UInt = 0u)

public data class WINBIO_EXTENDED_STORAGE_INFO(
    public var GenericStorageCapabilities: UInt = 0u,
    public var Factor: UInt = 0u,
    public var Specific: WINBIO_EXTENDED_STORAGE_INFO_0 = WINBIO_EXTENDED_STORAGE_INFO_0(),
)

public data class WINBIO_EXTENDED_STORAGE_INFO_0(
    public var Null: UInt = 0u,
    public var FacialFeatures: WINBIO_EXTENDED_STORAGE_INFO_0_0 = WINBIO_EXTENDED_STORAGE_INFO_0_0(),
    public var Fingerprint: WINBIO_EXTENDED_STORAGE_INFO_0_1 = WINBIO_EXTENDED_STORAGE_INFO_0_1(),
    public var Iris: WINBIO_EXTENDED_STORAGE_INFO_0_2 = WINBIO_EXTENDED_STORAGE_INFO_0_2(),
    public var Voice: WINBIO_EXTENDED_STORAGE_INFO_0_3 = WINBIO_EXTENDED_STORAGE_INFO_0_3(),
)

public data class WINBIO_EXTENDED_STORAGE_INFO_0_0(public var Capabilities: UInt = 0u)

public data class WINBIO_EXTENDED_STORAGE_INFO_0_1(public var Capabilities: UInt = 0u)

public data class WINBIO_EXTENDED_STORAGE_INFO_0_2(public var Capabilities: UInt = 0u)

public data class WINBIO_EXTENDED_STORAGE_INFO_0_3(public var Capabilities: UInt = 0u)

public data class WINBIO_EXTENDED_UNIT_STATUS(public var Availability: UInt = 0u, public var ReasonCode: UInt = 0u)

public data class WINBIO_FP_BU_STATE(public var SensorAttached: BOOL = 0, public var CreationResult: HRESULT = 0)

public class WINBIO_FRAMEWORK_INTERFACE(
    public var Version: WINBIO_ADAPTER_INTERFACE_VERSION = WINBIO_ADAPTER_INTERFACE_VERSION(),
    public var Type: UInt = 0u,
    public var Size: ULong = 0uL,
    public var AdapterId: GUID = GUID(),
    public var SetUnitStatus: PIBIO_FRAMEWORK_SET_UNIT_STATUS_FN = null,
    public var VsmStorageAttach: PIBIO_STORAGE_ATTACH_FN = null,
    public var VsmStorageDetach: PIBIO_STORAGE_DETACH_FN = null,
    public var VsmStorageClearContext: PIBIO_STORAGE_CLEAR_CONTEXT_FN = null,
    public var VsmStorageCreateDatabase: PIBIO_STORAGE_CREATE_DATABASE_FN = null,
    public var VsmStorageOpenDatabase: PIBIO_STORAGE_OPEN_DATABASE_FN = null,
    public var VsmStorageCloseDatabase: PIBIO_STORAGE_CLOSE_DATABASE_FN = null,
    public var VsmStorageDeleteRecord: PIBIO_STORAGE_DELETE_RECORD_FN = null,
    public var VsmStorageNotifyPowerChange: PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN = null,
    public var VsmStoragePipelineInit: PIBIO_STORAGE_PIPELINE_INIT_FN = null,
    public var VsmStoragePipelineCleanup: PIBIO_STORAGE_PIPELINE_CLEANUP_FN = null,
    public var VsmStorageActivate: PIBIO_STORAGE_ACTIVATE_FN = null,
    public var VsmStorageDeactivate: PIBIO_STORAGE_DEACTIVATE_FN = null,
    public var VsmStorageQueryExtendedInfo: PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN = null,
    public var VsmStorageCacheClear: PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FN = null,
    public var VsmStorageCacheImportBegin: PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FN = null,
    public var VsmStorageCacheImportNext: PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FN = null,
    public var VsmStorageCacheImportEnd: PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FN = null,
    public var VsmStorageCacheExportBegin: PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FN = null,
    public var VsmStorageCacheExportNext: PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FN = null,
    public var VsmStorageCacheExportEnd: PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FN = null,
    public var VsmSensorAttach: PIBIO_SENSOR_ATTACH_FN = null,
    public var VsmSensorDetach: PIBIO_SENSOR_DETACH_FN = null,
    public var VsmSensorClearContext: PIBIO_SENSOR_CLEAR_CONTEXT_FN = null,
    public var VsmSensorPushDataToEngine: PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN = null,
    public var VsmSensorNotifyPowerChange: PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN = null,
    public var VsmSensorPipelineInit: PIBIO_SENSOR_PIPELINE_INIT_FN = null,
    public var VsmSensorPipelineCleanup: PIBIO_SENSOR_PIPELINE_CLEANUP_FN = null,
    public var VsmSensorActivate: PIBIO_SENSOR_ACTIVATE_FN = null,
    public var VsmSensorDeactivate: PIBIO_SENSOR_DEACTIVATE_FN = null,
    public var VsmSensorAsyncImportRawBuffer: PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN = null,
    public var VsmSensorAsyncImportSecureBuffer: PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN = null,
    public var Reserved1: PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FN = null,
    public var Reserved2: PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FN = null,
    public var Reserved3: PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FN = null,
    public var Reserved4: PIBIO_STORAGE_RESERVED_1_FN = null,
    public var Reserved5: PIBIO_STORAGE_RESERVED_2_FN = null,
    public var AllocateMemory: PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FN = null,
    public var FreeMemory: PIBIO_FRAMEWORK_FREE_MEMORY_FN = null,
    public var GetProperty: PIBIO_FRAMEWORK_GET_PROPERTY_FN = null,
    public var LockAndValidateSecureBuffer: PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FN = null,
    public var ReleaseSecureBuffer: PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FN = null,
    public var QueryAuthorizedEnrollments: PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FN = null,
    public var DecryptSample: PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FN = null,
)

public data class WINBIO_GESTURE_METADATA(
    public var Size: ULong = 0uL,
    public var BiometricType: UInt = 0u,
    public var MatchType: UInt = 0u,
    public var ProtectionType: UInt = 0u,
)

public data class WINBIO_GET_INDICATOR(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var IndicatorStatus: UInt = 0u,
)

public data class WINBIO_IDENTITY(public var Type: UInt = 0u, public var Value: WINBIO_IDENTITY_0 = WINBIO_IDENTITY_0())

public data class WINBIO_IDENTITY_0(
    public var Null: UInt = 0u,
    public var Wildcard: UInt = 0u,
    public var TemplateGuid: GUID = GUID(),
    public var AccountSid: WINBIO_IDENTITY_0_0 = WINBIO_IDENTITY_0_0(),
    public var SecureId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_IDENTITY_0) return false
        if (this.Null != other.Null) return false
        if (this.Wildcard != other.Wildcard) return false
        if (this.TemplateGuid != other.TemplateGuid) return false
        if (this.AccountSid != other.AccountSid) return false
        if (!this.SecureId.contentEquals(other.SecureId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Null.hashCode()
        result = 31 * result + this.Wildcard.hashCode()
        result = 31 * result + this.TemplateGuid.hashCode()
        result = 31 * result + this.AccountSid.hashCode()
        result = 31 * result + this.SecureId.contentHashCode()
        return result
    }
}

public data class WINBIO_IDENTITY_0_0(public var Size: UInt = 0u, public var Data: UByteArray = UByteArray(68)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_IDENTITY_0_0) return false
        if (this.Size != other.Size) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WINBIO_NOTIFY_WAKE(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var Reason: UInt = 0u,
)

public data class WINBIO_PIPELINE(
    public var SensorHandle: HANDLE = 0L,
    public var EngineHandle: HANDLE = 0L,
    public var StorageHandle: HANDLE = 0L,
    public var SensorInterface: Long = 0L,
    public var EngineInterface: Long = 0L,
    public var StorageInterface: Long = 0L,
    public var SensorContext: Long = 0L,
    public var EngineContext: Long = 0L,
    public var StorageContext: Long = 0L,
    public var FrameworkInterface: Long = 0L,
)

public data class WINBIO_PRESENCE(
    public var Factor: UInt = 0u,
    public var SubFactor: UByte = 0u,
    public var Status: HRESULT = 0,
    public var RejectDetail: UInt = 0u,
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var TrackingId: ULong = 0uL,
    public var Ticket: ULong = 0uL,
    public var Properties: WINBIO_PRESENCE_PROPERTIES = WINBIO_PRESENCE_PROPERTIES(),
    public var Authorization: WINBIO_PRESENCE_0 = WINBIO_PRESENCE_0(),
)

public data class WINBIO_PRESENCE_0(public var Size: UInt = 0u, public var Data: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_PRESENCE_0) return false
        if (this.Size != other.Size) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Size.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WINBIO_PRESENCE_PROPERTIES(public var FacialFeatures: WINBIO_PRESENCE_PROPERTIES_0 = WINBIO_PRESENCE_PROPERTIES_0(), public var Iris: WINBIO_PRESENCE_PROPERTIES_1 = WINBIO_PRESENCE_PROPERTIES_1())

public data class WINBIO_PRESENCE_PROPERTIES_0(
    public var BoundingBox: RECT = RECT(),
    public var Distance: Int = 0,
    public var OpaqueEngineData: WINBIO_PRESENCE_PROPERTIES_0_0 = WINBIO_PRESENCE_PROPERTIES_0_0(),
)

public data class WINBIO_PRESENCE_PROPERTIES_0_0(public var AdapterId: GUID = GUID(), public var Data: UIntArray = UIntArray(78)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_PRESENCE_PROPERTIES_0_0) return false
        if (this.AdapterId != other.AdapterId) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterId.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class WINBIO_PRESENCE_PROPERTIES_1(
    public var EyeBoundingBox_1: RECT = RECT(),
    public var EyeBoundingBox_2: RECT = RECT(),
    public var PupilCenter_1: POINT = POINT(),
    public var PupilCenter_2: POINT = POINT(),
    public var Distance: Int = 0,
)

public data class WINBIO_PRIVATE_SENSOR_TYPE_INFO(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var PrivateSensorTypeInfo: WINBIO_DATA = WINBIO_DATA(),
)

public data class WINBIO_PROTECTION_POLICY(
    public var Version: UInt = 0u,
    public var Identity: WINBIO_IDENTITY = WINBIO_IDENTITY(),
    public var DatabaseId: GUID = GUID(),
    public var UserState: ULong = 0uL,
    public var PolicySize: ULong = 0uL,
    public var Policy: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_PROTECTION_POLICY) return false
        if (this.Version != other.Version) return false
        if (this.Identity != other.Identity) return false
        if (this.DatabaseId != other.DatabaseId) return false
        if (this.UserState != other.UserState) return false
        if (this.PolicySize != other.PolicySize) return false
        if (!this.Policy.contentEquals(other.Policy)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Version.hashCode()
        result = 31 * result + this.Identity.hashCode()
        result = 31 * result + this.DatabaseId.hashCode()
        result = 31 * result + this.UserState.hashCode()
        result = 31 * result + this.PolicySize.hashCode()
        result = 31 * result + this.Policy.contentHashCode()
        return result
    }
}

public data class WINBIO_REGISTERED_FORMAT(public var Owner: UShort = 0u, public var Type: UShort = 0u)

public data class WINBIO_SECURE_BUFFER_HEADER_V1(
    public var Type: UInt = 0u,
    public var Size: UInt = 0u,
    public var Flags: UInt = 0u,
    public var ValidationTag: ULong = 0uL,
)

public data class WINBIO_SECURE_CONNECTION_DATA(
    public var Size: UInt = 0u,
    public var Version: UShort = 0u,
    public var Flags: UShort = 0u,
    public var ModelCertificateSize: UInt = 0u,
    public var IntermediateCA1Size: UInt = 0u,
    public var IntermediateCA2Size: UInt = 0u,
)

public data class WINBIO_SECURE_CONNECTION_PARAMS(
    public var PayloadSize: UInt = 0u,
    public var Version: UShort = 0u,
    public var Flags: UShort = 0u,
)

public data class WINBIO_SENSOR_ATTRIBUTES(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var WinBioVersion: WINBIO_VERSION = WINBIO_VERSION(),
    public var SensorType: UInt = 0u,
    public var SensorSubType: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var ManufacturerName: UShortArray = UShortArray(256),
    public var ModelName: UShortArray = UShortArray(256),
    public var SerialNumber: UShortArray = UShortArray(256),
    public var FirmwareVersion: WINBIO_VERSION = WINBIO_VERSION(),
    public var SupportedFormatEntries: UInt = 0u,
    public var SupportedFormat: List<WINBIO_REGISTERED_FORMAT> = List(1) { WINBIO_REGISTERED_FORMAT() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_SENSOR_ATTRIBUTES) return false
        if (this.PayloadSize != other.PayloadSize) return false
        if (this.WinBioHresult != other.WinBioHresult) return false
        if (this.WinBioVersion != other.WinBioVersion) return false
        if (this.SensorType != other.SensorType) return false
        if (this.SensorSubType != other.SensorSubType) return false
        if (this.Capabilities != other.Capabilities) return false
        if (!this.ManufacturerName.contentEquals(other.ManufacturerName)) return false
        if (!this.ModelName.contentEquals(other.ModelName)) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        if (this.FirmwareVersion != other.FirmwareVersion) return false
        if (this.SupportedFormatEntries != other.SupportedFormatEntries) return false
        if (this.SupportedFormat != other.SupportedFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.PayloadSize.hashCode()
        result = 31 * result + this.WinBioHresult.hashCode()
        result = 31 * result + this.WinBioVersion.hashCode()
        result = 31 * result + this.SensorType.hashCode()
        result = 31 * result + this.SensorSubType.hashCode()
        result = 31 * result + this.Capabilities.hashCode()
        result = 31 * result + this.ManufacturerName.contentHashCode()
        result = 31 * result + this.ModelName.contentHashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        result = 31 * result + this.FirmwareVersion.hashCode()
        result = 31 * result + this.SupportedFormatEntries.hashCode()
        result = 31 * result + this.SupportedFormat.hashCode()
        return result
    }
}

public class WINBIO_SENSOR_INTERFACE(
    public var Version: WINBIO_ADAPTER_INTERFACE_VERSION = WINBIO_ADAPTER_INTERFACE_VERSION(),
    public var Type: UInt = 0u,
    public var Size: ULong = 0uL,
    public var AdapterId: GUID = GUID(),
    public var Attach: PIBIO_SENSOR_ATTACH_FN = null,
    public var Detach: PIBIO_SENSOR_DETACH_FN = null,
    public var ClearContext: PIBIO_SENSOR_CLEAR_CONTEXT_FN = null,
    public var QueryStatus: PIBIO_SENSOR_QUERY_STATUS_FN = null,
    public var Reset: PIBIO_SENSOR_RESET_FN = null,
    public var SetMode: PIBIO_SENSOR_SET_MODE_FN = null,
    public var SetIndicatorStatus: PIBIO_SENSOR_SET_INDICATOR_STATUS_FN = null,
    public var GetIndicatorStatus: PIBIO_SENSOR_GET_INDICATOR_STATUS_FN = null,
    public var StartCapture: PIBIO_SENSOR_START_CAPTURE_FN = null,
    public var FinishCapture: PIBIO_SENSOR_FINISH_CAPTURE_FN = null,
    public var ExportSensorData: PIBIO_SENSOR_EXPORT_SENSOR_DATA_FN = null,
    public var Cancel: PIBIO_SENSOR_CANCEL_FN = null,
    public var PushDataToEngine: PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN = null,
    public var ControlUnit: PIBIO_SENSOR_CONTROL_UNIT_FN = null,
    public var ControlUnitPrivileged: PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FN = null,
    public var NotifyPowerChange: PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN = null,
    public var PipelineInit: PIBIO_SENSOR_PIPELINE_INIT_FN = null,
    public var PipelineCleanup: PIBIO_SENSOR_PIPELINE_CLEANUP_FN = null,
    public var Activate: PIBIO_SENSOR_ACTIVATE_FN = null,
    public var Deactivate: PIBIO_SENSOR_DEACTIVATE_FN = null,
    public var QueryExtendedInfo: PIBIO_SENSOR_QUERY_EXTENDED_INFO_FN = null,
    public var QueryCalibrationFormats: PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FN = null,
    public var SetCalibrationFormat: PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FN = null,
    public var AcceptCalibrationData: PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FN = null,
    public var AsyncImportRawBuffer: PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN = null,
    public var AsyncImportSecureBuffer: PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN = null,
    public var QueryPrivateSensorType: PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FN = null,
    public var ConnectSecure: PIBIO_SENSOR_CONNECT_SECURE_FN = null,
    public var StartCaptureEx: PIBIO_SENSOR_START_CAPTURE_EX_FN = null,
    public var StartNotifyWake: PIBIO_SENSOR_START_NOTIFY_WAKE_FN = null,
    public var FinishNotifyWake: PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FN = null,
)

public data class WINBIO_SET_INDICATOR(public var PayloadSize: UInt = 0u, public var IndicatorStatus: UInt = 0u)

public class WINBIO_STORAGE_INTERFACE(
    public var Version: WINBIO_ADAPTER_INTERFACE_VERSION = WINBIO_ADAPTER_INTERFACE_VERSION(),
    public var Type: UInt = 0u,
    public var Size: ULong = 0uL,
    public var AdapterId: GUID = GUID(),
    public var Attach: PIBIO_STORAGE_ATTACH_FN = null,
    public var Detach: PIBIO_STORAGE_DETACH_FN = null,
    public var ClearContext: PIBIO_STORAGE_CLEAR_CONTEXT_FN = null,
    public var CreateDatabase: PIBIO_STORAGE_CREATE_DATABASE_FN = null,
    public var EraseDatabase: PIBIO_STORAGE_ERASE_DATABASE_FN = null,
    public var OpenDatabase: PIBIO_STORAGE_OPEN_DATABASE_FN = null,
    public var CloseDatabase: PIBIO_STORAGE_CLOSE_DATABASE_FN = null,
    public var GetDataFormat: PIBIO_STORAGE_GET_DATA_FORMAT_FN = null,
    public var GetDatabaseSize: PIBIO_STORAGE_GET_DATABASE_SIZE_FN = null,
    public var AddRecord: PIBIO_STORAGE_ADD_RECORD_FN = null,
    public var DeleteRecord: PIBIO_STORAGE_DELETE_RECORD_FN = null,
    public var QueryBySubject: PIBIO_STORAGE_QUERY_BY_SUBJECT_FN = null,
    public var QueryByContent: PIBIO_STORAGE_QUERY_BY_CONTENT_FN = null,
    public var GetRecordCount: PIBIO_STORAGE_GET_RECORD_COUNT_FN = null,
    public var FirstRecord: PIBIO_STORAGE_FIRST_RECORD_FN = null,
    public var NextRecord: PIBIO_STORAGE_NEXT_RECORD_FN = null,
    public var GetCurrentRecord: PIBIO_STORAGE_GET_CURRENT_RECORD_FN = null,
    public var ControlUnit: PIBIO_STORAGE_CONTROL_UNIT_FN = null,
    public var ControlUnitPrivileged: PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FN = null,
    public var NotifyPowerChange: PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN = null,
    public var PipelineInit: PIBIO_STORAGE_PIPELINE_INIT_FN = null,
    public var PipelineCleanup: PIBIO_STORAGE_PIPELINE_CLEANUP_FN = null,
    public var Activate: PIBIO_STORAGE_ACTIVATE_FN = null,
    public var Deactivate: PIBIO_STORAGE_DEACTIVATE_FN = null,
    public var QueryExtendedInfo: PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN = null,
    public var NotifyDatabaseChange: PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FN = null,
    public var Reserved1: PIBIO_STORAGE_RESERVED_1_FN = null,
    public var Reserved2: PIBIO_STORAGE_RESERVED_2_FN = null,
    public var UpdateRecordBegin: PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FN = null,
    public var UpdateRecordCommit: PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FN = null,
)

public data class WINBIO_STORAGE_RECORD(
    public var Identity: Long = 0L,
    public var SubFactor: UByte = 0u,
    public var IndexVector: Long = 0L,
    public var IndexElementCount: ULong = 0uL,
    public var TemplateBlob: Long = 0L,
    public var TemplateBlobSize: ULong = 0uL,
    public var PayloadBlob: Long = 0L,
    public var PayloadBlobSize: ULong = 0uL,
)

public data class WINBIO_STORAGE_SCHEMA(
    public var BiometricFactor: UInt = 0u,
    public var DatabaseId: GUID = GUID(),
    public var DataFormat: GUID = GUID(),
    public var Attributes: UInt = 0u,
    public var FilePath: UShortArray = UShortArray(256),
    public var ConnectionString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_STORAGE_SCHEMA) return false
        if (this.BiometricFactor != other.BiometricFactor) return false
        if (this.DatabaseId != other.DatabaseId) return false
        if (this.DataFormat != other.DataFormat) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.FilePath.contentEquals(other.FilePath)) return false
        if (!this.ConnectionString.contentEquals(other.ConnectionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BiometricFactor.hashCode()
        result = 31 * result + this.DatabaseId.hashCode()
        result = 31 * result + this.DataFormat.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.FilePath.contentHashCode()
        result = 31 * result + this.ConnectionString.contentHashCode()
        return result
    }
}

public data class WINBIO_SUPPORTED_ALGORITHMS(
    public var PayloadSize: UInt = 0u,
    public var WinBioHresult: HRESULT = 0,
    public var NumberOfAlgorithms: UInt = 0u,
    public var AlgorithmData: WINBIO_DATA = WINBIO_DATA(),
)

public data class WINBIO_UNIT_SCHEMA(
    public var UnitId: UInt = 0u,
    public var PoolType: UInt = 0u,
    public var BiometricFactor: UInt = 0u,
    public var SensorSubType: UInt = 0u,
    public var Capabilities: UInt = 0u,
    public var DeviceInstanceId: UShortArray = UShortArray(256),
    public var Description: UShortArray = UShortArray(256),
    public var Manufacturer: UShortArray = UShortArray(256),
    public var Model: UShortArray = UShortArray(256),
    public var SerialNumber: UShortArray = UShortArray(256),
    public var FirmwareVersion: WINBIO_VERSION = WINBIO_VERSION(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WINBIO_UNIT_SCHEMA) return false
        if (this.UnitId != other.UnitId) return false
        if (this.PoolType != other.PoolType) return false
        if (this.BiometricFactor != other.BiometricFactor) return false
        if (this.SensorSubType != other.SensorSubType) return false
        if (this.Capabilities != other.Capabilities) return false
        if (!this.DeviceInstanceId.contentEquals(other.DeviceInstanceId)) return false
        if (!this.Description.contentEquals(other.Description)) return false
        if (!this.Manufacturer.contentEquals(other.Manufacturer)) return false
        if (!this.Model.contentEquals(other.Model)) return false
        if (!this.SerialNumber.contentEquals(other.SerialNumber)) return false
        if (this.FirmwareVersion != other.FirmwareVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.UnitId.hashCode()
        result = 31 * result + this.PoolType.hashCode()
        result = 31 * result + this.BiometricFactor.hashCode()
        result = 31 * result + this.SensorSubType.hashCode()
        result = 31 * result + this.Capabilities.hashCode()
        result = 31 * result + this.DeviceInstanceId.contentHashCode()
        result = 31 * result + this.Description.contentHashCode()
        result = 31 * result + this.Manufacturer.contentHashCode()
        result = 31 * result + this.Model.contentHashCode()
        result = 31 * result + this.SerialNumber.contentHashCode()
        result = 31 * result + this.FirmwareVersion.hashCode()
        return result
    }
}

public data class WINBIO_UPDATE_FIRMWARE(public var PayloadSize: UInt = 0u, public var FirmwareData: WINBIO_DATA = WINBIO_DATA())

public data class WINBIO_VERSION(public var MajorVersion: UInt = 0u, public var MinorVersion: UInt = 0u)
