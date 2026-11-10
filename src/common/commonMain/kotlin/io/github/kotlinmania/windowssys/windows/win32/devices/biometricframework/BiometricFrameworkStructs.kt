@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class WinbioAccountPolicy(public var identity: WinbioIdentity = WinbioIdentity(), public var antiSpoofBehavior: WinbioAntiSpoofPolicyAction = 0)

public data class WinbioAdapterInterfaceVersion(public var majorVersion: UShort = 0u, public var minorVersion: UShort = 0u)

public data class WinbioAntiSpoofPolicy(public var action: WinbioAntiSpoofPolicyAction = 0, public var source: WinbioPolicySource = 0)

public data class WinbioAsyncResult(
    public var sessionHandle: UInt = 0u,
    public var operation: UInt = 0u,
    public var sequenceNumber: ULong = 0uL,
    public var timeStamp: Long = 0L,
    public var apiStatus: Hresult = 0,
    public var unitId: UInt = 0u,
    public var userData: COpaquePointer? = null,
    public var parameters: WinbioAsyncResult0 = WinbioAsyncResult0(),
)

public class WinbioAsyncResult0(
    public var verify: WinbioAsyncResult00 = WinbioAsyncResult00(),
    public var identify: WinbioAsyncResult01 = WinbioAsyncResult01(),
    public var enrollBegin: WinbioAsyncResult02 = WinbioAsyncResult02(),
    public var enrollCapture: WinbioAsyncResult03 = WinbioAsyncResult03(),
    public var enrollCommit: WinbioAsyncResult04 = WinbioAsyncResult04(),
    public var enumEnrollments: WinbioAsyncResult05 = WinbioAsyncResult05(),
    public var captureSample: WinbioAsyncResult06 = WinbioAsyncResult06(),
    public var deleteTemplate: WinbioAsyncResult07 = WinbioAsyncResult07(),
    public var getProperty: WinbioAsyncResult08 = WinbioAsyncResult08(),
    public var setProperty: WinbioAsyncResult09 = WinbioAsyncResult09(),
    public var getEvent: WinbioAsyncResult010 = WinbioAsyncResult010(),
    public var controlUnit: WinbioAsyncResult011 = WinbioAsyncResult011(),
    public var enumServiceProviders: WinbioAsyncResult012 = WinbioAsyncResult012(),
    public var enumBiometricUnits: WinbioAsyncResult013 = WinbioAsyncResult013(),
    public var enumDatabases: WinbioAsyncResult014 = WinbioAsyncResult014(),
    public var verifyAndReleaseTicket: WinbioAsyncResult015 = WinbioAsyncResult015(),
    public var identifyAndReleaseTicket: WinbioAsyncResult016 = WinbioAsyncResult016(),
    public var enrollSelect: WinbioAsyncResult017 = WinbioAsyncResult017(),
    public var monitorPresence: WinbioAsyncResult018 = WinbioAsyncResult018(),
    public var getProtectionPolicy: WinbioAsyncResult019 = WinbioAsyncResult019(),
    public var notifyUnitStatusChange: WinbioAsyncResult020 = WinbioAsyncResult020(),
)

public data class WinbioAsyncResult06(
    public var sample: WinbioBir? = null,
    public var sampleSize: Int = 0,
    public var rejectDetail: UInt = 0u,
)

public data class WinbioAsyncResult011(
    public var component: WinbioComponent = 0u,
    public var controlCode: UInt = 0u,
    public var operationStatus: UInt = 0u,
    public var sendBuffer: COpaquePointer? = null,
    public var sendBufferSize: Int = 0,
    public var receiveBuffer: COpaquePointer? = null,
    public var receiveBufferSize: Int = 0,
    public var receiveDataSize: Int = 0,
)

public data class WinbioAsyncResult07(public var identity: WinbioIdentity = WinbioIdentity(), public var subFactor: UByte = 0u)

public data class WinbioAsyncResult02(public var subFactor: UByte = 0u)

public data class WinbioAsyncResult03(public var rejectDetail: UInt = 0u)

public data class WinbioAsyncResult04(public var identity: WinbioIdentity = WinbioIdentity(), public var isNewTemplate: Boolean = false)

public data class WinbioAsyncResult017(public var selectorValue: ULong = 0uL)

public data class WinbioAsyncResult013(public var unitCount: Int = 0, public var unitSchemaArray: WinbioUnitSchema? = null)

public data class WinbioAsyncResult014(public var storageCount: Int = 0, public var storageSchemaArray: WinbioStorageSchema? = null)

public data class WinbioAsyncResult05(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactorCount: Int = 0,
    public var subFactorArray: COpaquePointer? = null,
)

public data class WinbioAsyncResult012(public var bspCount: Int = 0, public var bspSchemaArray: WinbioBspSchema? = null)

public data class WinbioAsyncResult010(public var event: WinbioEvent = WinbioEvent())

public data class WinbioAsyncResult08(
    public var propertyType: UInt = 0u,
    public var propertyId: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var propertyBufferSize: Int = 0,
    public var propertyBuffer: COpaquePointer? = null,
)

public data class WinbioAsyncResult019(public var identity: WinbioIdentity = WinbioIdentity(), public var policy: WinbioProtectionPolicy = WinbioProtectionPolicy())

public data class WinbioAsyncResult016(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
    public var ticket: ULong = 0uL,
)

public data class WinbioAsyncResult01(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
)

public data class WinbioAsyncResult018(
    public var changeType: UInt = 0u,
    public var presenceCount: Int = 0,
    public var presenceArray: WinbioPresence? = null,
)

public data class WinbioAsyncResult020(public var extendedStatus: WinbioExtendedUnitStatus = WinbioExtendedUnitStatus())

public data class WinbioAsyncResult09(
    public var propertyType: UInt = 0u,
    public var propertyId: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var propertyBufferSize: Int = 0,
    public var propertyBuffer: COpaquePointer? = null,
)

public data class WinbioAsyncResult015(
    public var match: Boolean = false,
    public var rejectDetail: UInt = 0u,
    public var ticket: ULong = 0uL,
)

public data class WinbioAsyncResult00(public var match: Boolean = false, public var rejectDetail: UInt = 0u)

public data class WinbioBdbAnsi381Header(
    public var recordLength: ULong = 0uL,
    public var formatIdentifier: UInt = 0u,
    public var versionNumber: UInt = 0u,
    public var productId: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var captureDeviceId: UShort = 0u,
    public var imageAcquisitionLevel: UShort = 0u,
    public var horizontalScanResolution: UShort = 0u,
    public var verticalScanResolution: UShort = 0u,
    public var horizontalImageResolution: UShort = 0u,
    public var verticalImageResolution: UShort = 0u,
    public var elementCount: UByte = 0u,
    public var scaleUnits: UByte = 0u,
    public var pixelDepth: UByte = 0u,
    public var imageCompressionAlg: UByte = 0u,
    public var reserved: UShort = 0u,
)

public data class WinbioBdbAnsi381Record(
    public var blockLength: UInt = 0u,
    public var horizontalLineLength: UShort = 0u,
    public var verticalLineLength: UShort = 0u,
    public var position: UByte = 0u,
    public var countOfViews: UByte = 0u,
    public var viewNumber: UByte = 0u,
    public var imageQuality: UByte = 0u,
    public var impressionType: UByte = 0u,
    public var reserved: UByte = 0u,
)

public data class WinbioBir(
    public var headerBlock: WinbioBirData = WinbioBirData(),
    public var standardDataBlock: WinbioBirData = WinbioBirData(),
    public var vendorDataBlock: WinbioBirData = WinbioBirData(),
    public var signatureBlock: WinbioBirData = WinbioBirData(),
)

public data class WinbioBirData(public var size: UInt = 0u, public var offset: UInt = 0u)

public data class WinbioBirHeader(
    public var validFields: UShort = 0u,
    public var headerVersion: UByte = 0u,
    public var patronHeaderVersion: UByte = 0u,
    public var dataFlags: UByte = 0u,
    public var type: UInt = 0u,
    public var subtype: UByte = 0u,
    public var purpose: UByte = 0u,
    public var dataQuality: Byte = 0,
    public var creationDate: Long = 0L,
    public var validityPeriod: WinbioBirHeader0 = WinbioBirHeader0(),
    public var biometricDataFormat: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var productId: WinbioRegisteredFormat = WinbioRegisteredFormat(),
)

public data class WinbioBirHeader0(public var beginDate: Long = 0L, public var endDate: Long = 0L)

public data class WinbioBlankPayload(public var payloadSize: UInt = 0u, public var winBioHresult: Hresult = 0)

public data class WinbioBspSchema(
    public var biometricFactor: UInt = 0u,
    public var bspId: Guid = Guid(),
    public var description: UShortArray = UShortArray(256),
    public var vendor: UShortArray = UShortArray(256),
    public var version: WinbioVersion = WinbioVersion(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioBspSchema) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.bspId != other.bspId) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (this.version != other.version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.biometricFactor.hashCode()
        result = 31 * result + this.bspId.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.version.hashCode()
        return result
    }
}

public data class WinbioCalibrationInfo(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var calibrationData: WinbioData = WinbioData(),
)

public data class WinbioCaptureData(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var sensorStatus: UInt = 0u,
    public var rejectDetail: UInt = 0u,
    public var captureData: WinbioData = WinbioData(),
)

public data class WinbioCaptureParameters(
    public var payloadSize: UInt = 0u,
    public var purpose: UByte = 0u,
    public var format: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var vendorFormat: Guid = Guid(),
    public var flags: UByte = 0u,
)

public data class WinbioData(public var size: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioData) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioDiagnostics(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var sensorStatus: UInt = 0u,
    public var vendorDiagnostics: WinbioData = WinbioData(),
)

public data class WinbioEncryptedCaptureParams(
    public var payloadSize: UInt = 0u,
    public var purpose: UByte = 0u,
    public var format: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var vendorFormat: Guid = Guid(),
    public var flags: UByte = 0u,
    public var nonceSize: UInt = 0u,
)

public class WinbioEngineInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioEngineAttachFn = null,
    public var detach: PibioEngineDetachFn = null,
    public var clearContext: PibioEngineClearContextFn = null,
    public var queryPreferredFormat: PibioEngineQueryPreferredFormatFn = null,
    public var queryIndexVectorSize: PibioEngineQueryIndexVectorSizeFn = null,
    public var queryHashAlgorithms: PibioEngineQueryHashAlgorithmsFn = null,
    public var setHashAlgorithm: PibioEngineSetHashAlgorithmFn = null,
    public var querySampleHint: PibioEngineQuerySampleHintFn = null,
    public var acceptSampleData: PibioEngineAcceptSampleDataFn = null,
    public var exportEngineData: PibioEngineExportEngineDataFn = null,
    public var verifyFeatureSet: PibioEngineVerifyFeatureSetFn = null,
    public var identifyFeatureSet: PibioEngineIdentifyFeatureSetFn = null,
    public var createEnrollment: PibioEngineCreateEnrollmentFn = null,
    public var updateEnrollment: PibioEngineUpdateEnrollmentFn = null,
    public var getEnrollmentStatus: PibioEngineGetEnrollmentStatusFn = null,
    public var getEnrollmentHash: PibioEngineGetEnrollmentHashFn = null,
    public var checkForDuplicate: PibioEngineCheckForDuplicateFn = null,
    public var commitEnrollment: PibioEngineCommitEnrollmentFn = null,
    public var discardEnrollment: PibioEngineDiscardEnrollmentFn = null,
    public var controlUnit: PibioEngineControlUnitFn = null,
    public var controlUnitPrivileged: PibioEngineControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioEngineNotifyPowerChangeFn = null,
    public var reserved1: PibioEngineReserved1Fn = null,
    public var pipelineInit: PibioEnginePipelineInitFn = null,
    public var pipelineCleanup: PibioEnginePipelineCleanupFn = null,
    public var activate: PibioEngineActivateFn = null,
    public var deactivate: PibioEngineDeactivateFn = null,
    public var queryExtendedInfo: PibioEngineQueryExtendedInfoFn = null,
    public var identifyAll: PibioEngineIdentifyAllFn = null,
    public var setEnrollmentSelector: PibioEngineSetEnrollmentSelectorFn = null,
    public var setEnrollmentParameters: PibioEngineSetEnrollmentParametersFn = null,
    public var queryExtendedEnrollmentStatus: PibioEngineQueryExtendedEnrollmentStatusFn = null,
    public var refreshCache: PibioEngineRefreshCacheFn = null,
    public var selectCalibrationFormat: PibioEngineSelectCalibrationFormatFn = null,
    public var queryCalibrationData: PibioEngineQueryCalibrationDataFn = null,
    public var setAccountPolicy: PibioEngineSetAccountPolicyFn = null,
    public var createKey: PibioEngineCreateKeyFn = null,
    public var identifyFeatureSetSecure: PibioEngineIdentifyFeatureSetSecureFn = null,
    public var acceptPrivateSensorTypeInfo: PibioEngineAcceptPrivateSensorTypeInfoFn = null,
    public var createEnrollmentAuthenticated: PibioEngineCreateEnrollmentAuthenticatedFn = null,
    public var identifyFeatureSetAuthenticated: PibioEngineIdentifyFeatureSetAuthenticatedFn = null,
)

public data class WinbioEvent(public var type: UInt = 0u, public var parameters: WinbioEvent0 = WinbioEvent0())

public data class WinbioEvent0(
    public var unclaimed: WinbioEvent00 = WinbioEvent00(),
    public var unclaimedIdentify: WinbioEvent01 = WinbioEvent01(),
    public var error: WinbioEvent02 = WinbioEvent02(),
)

public data class WinbioEvent02(public var errorCode: Hresult = 0)

public data class WinbioEvent01(
    public var unitId: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
)

public data class WinbioEvent00(public var unitId: UInt = 0u, public var rejectDetail: UInt = 0u)

public data class WinbioExtendedEngineInfo(
    public var genericEngineCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedEngineInfo0 = WinbioExtendedEngineInfo0(),
)

public data class WinbioExtendedEngineInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedEngineInfo00 = WinbioExtendedEngineInfo00(),
    public var fingerprint: WinbioExtendedEngineInfo01 = WinbioExtendedEngineInfo01(),
    public var iris: WinbioExtendedEngineInfo02 = WinbioExtendedEngineInfo02(),
    public var voice: WinbioExtendedEngineInfo03 = WinbioExtendedEngineInfo03(),
)

public data class WinbioExtendedEngineInfo00(public var capabilities: UInt = 0u, public var enrollmentRequirements: WinbioExtendedEngineInfo000 = WinbioExtendedEngineInfo000())

public data class WinbioExtendedEngineInfo000(public var nullVal: UInt = 0u)

public data class WinbioExtendedEngineInfo01(public var capabilities: UInt = 0u, public var enrollmentRequirements: WinbioExtendedEngineInfo010 = WinbioExtendedEngineInfo010())

public data class WinbioExtendedEngineInfo010(
    public var generalSamples: UInt = 0u,
    public var center: UInt = 0u,
    public var topEdge: UInt = 0u,
    public var bottomEdge: UInt = 0u,
    public var leftEdge: UInt = 0u,
    public var rightEdge: UInt = 0u,
)

public data class WinbioExtendedEngineInfo02(public var capabilities: UInt = 0u, public var enrollmentRequirements: WinbioExtendedEngineInfo020 = WinbioExtendedEngineInfo020())

public data class WinbioExtendedEngineInfo020(public var nullVal: UInt = 0u)

public data class WinbioExtendedEngineInfo03(public var capabilities: UInt = 0u, public var enrollmentRequirements: WinbioExtendedEngineInfo030 = WinbioExtendedEngineInfo030())

public data class WinbioExtendedEngineInfo030(public var nullVal: UInt = 0u)

public data class WinbioExtendedEnrollmentParameters(public var size: Int = 0, public var subFactor: UByte = 0u)

public data class WinbioExtendedEnrollmentStatus(
    public var templateStatus: Hresult = 0,
    public var rejectDetail: UInt = 0u,
    public var percentComplete: UInt = 0u,
    public var factor: UInt = 0u,
    public var subFactor: UByte = 0u,
    public var specific: WinbioExtendedEnrollmentStatus0 = WinbioExtendedEnrollmentStatus0(),
)

public data class WinbioExtendedEnrollmentStatus0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedEnrollmentStatus00 = WinbioExtendedEnrollmentStatus00(),
    public var fingerprint: WinbioExtendedEnrollmentStatus01 = WinbioExtendedEnrollmentStatus01(),
    public var iris: WinbioExtendedEnrollmentStatus02 = WinbioExtendedEnrollmentStatus02(),
    public var voice: WinbioExtendedEnrollmentStatus03 = WinbioExtendedEnrollmentStatus03(),
)

public data class WinbioExtendedEnrollmentStatus00(
    public var boundingBox: Rect = Rect(),
    public var distance: Int = 0,
    public var opaqueEngineData: WinbioExtendedEnrollmentStatus000 = WinbioExtendedEnrollmentStatus000(),
)

public data class WinbioExtendedEnrollmentStatus000(public var adapterId: Guid = Guid(), public var data: UIntArray = UIntArray(78)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioExtendedEnrollmentStatus000) return false
        if (this.adapterId != other.adapterId) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioExtendedEnrollmentStatus01(
    public var generalSamples: UInt = 0u,
    public var center: UInt = 0u,
    public var topEdge: UInt = 0u,
    public var bottomEdge: UInt = 0u,
    public var leftEdge: UInt = 0u,
    public var rightEdge: UInt = 0u,
)

public data class WinbioExtendedEnrollmentStatus02(
    public var eyeBoundingBox1: Rect = Rect(),
    public var eyeBoundingBox2: Rect = Rect(),
    public var pupilCenter1: Point = Point(),
    public var pupilCenter2: Point = Point(),
    public var distance: Int = 0,
    public var gridPointCompletionPercent: UInt = 0u,
    public var gridPointIndex: UShort = 0u,
    public var point3D: WinbioExtendedEnrollmentStatus020 = WinbioExtendedEnrollmentStatus020(),
    public var stopCaptureAndShowCriticalFeedback: Bool = 0,
)

public data class WinbioExtendedEnrollmentStatus020(
    public var x: Double = 0.0,
    public var y: Double = 0.0,
    public var z: Double = 0.0,
)

public data class WinbioExtendedEnrollmentStatus03(public var reserved: UInt = 0u)

public data class WinbioExtendedSensorInfo(
    public var genericSensorCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedSensorInfo0 = WinbioExtendedSensorInfo0(),
)

public data class WinbioExtendedSensorInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedSensorInfo00 = WinbioExtendedSensorInfo00(),
    public var fingerprint: WinbioExtendedSensorInfo01 = WinbioExtendedSensorInfo01(),
    public var iris: WinbioExtendedSensorInfo02 = WinbioExtendedSensorInfo02(),
    public var voice: WinbioExtendedSensorInfo03 = WinbioExtendedSensorInfo03(),
)

public data class WinbioExtendedSensorInfo00(
    public var frameSize: Rect = Rect(),
    public var frameOffset: Point = Point(),
    public var mandatoryOrientation: UInt = 0u,
    public var hardwareInfo: WinbioExtendedSensorInfo000 = WinbioExtendedSensorInfo000(),
)

public data class WinbioExtendedSensorInfo000(
    public var colorSensorId: UShortArray = UShortArray(260),
    public var infraredSensorId: UShortArray = UShortArray(260),
    public var infraredSensorRotationAngle: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioExtendedSensorInfo000) return false
        if (!this.colorSensorId.contentEquals(other.colorSensorId)) return false
        if (!this.infraredSensorId.contentEquals(other.infraredSensorId)) return false
        if (this.infraredSensorRotationAngle != other.infraredSensorRotationAngle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.colorSensorId.contentHashCode()
        result = 31 * result + this.infraredSensorId.contentHashCode()
        result = 31 * result + this.infraredSensorRotationAngle.hashCode()
        return result
    }
}

public data class WinbioExtendedSensorInfo01(public var reserved: UInt = 0u)

public data class WinbioExtendedSensorInfo02(
    public var frameSize: Rect = Rect(),
    public var frameOffset: Point = Point(),
    public var mandatoryOrientation: UInt = 0u,
)

public data class WinbioExtendedSensorInfo03(public var reserved: UInt = 0u)

public data class WinbioExtendedStorageInfo(
    public var genericStorageCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedStorageInfo0 = WinbioExtendedStorageInfo0(),
)

public data class WinbioExtendedStorageInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedStorageInfo00 = WinbioExtendedStorageInfo00(),
    public var fingerprint: WinbioExtendedStorageInfo01 = WinbioExtendedStorageInfo01(),
    public var iris: WinbioExtendedStorageInfo02 = WinbioExtendedStorageInfo02(),
    public var voice: WinbioExtendedStorageInfo03 = WinbioExtendedStorageInfo03(),
)

public data class WinbioExtendedStorageInfo00(public var capabilities: UInt = 0u)

public data class WinbioExtendedStorageInfo01(public var capabilities: UInt = 0u)

public data class WinbioExtendedStorageInfo02(public var capabilities: UInt = 0u)

public data class WinbioExtendedStorageInfo03(public var capabilities: UInt = 0u)

public data class WinbioExtendedUnitStatus(public var availability: UInt = 0u, public var reasonCode: UInt = 0u)

public data class WinbioFpBuState(public var sensorAttached: Bool = 0, public var creationResult: Hresult = 0)

public class WinbioFrameworkInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var setUnitStatus: PibioFrameworkSetUnitStatusFn = null,
    public var vsmStorageAttach: PibioStorageAttachFn = null,
    public var vsmStorageDetach: PibioStorageDetachFn = null,
    public var vsmStorageClearContext: PibioStorageClearContextFn = null,
    public var vsmStorageCreateDatabase: PibioStorageCreateDatabaseFn = null,
    public var vsmStorageOpenDatabase: PibioStorageOpenDatabaseFn = null,
    public var vsmStorageCloseDatabase: PibioStorageCloseDatabaseFn = null,
    public var vsmStorageDeleteRecord: PibioStorageDeleteRecordFn = null,
    public var vsmStorageNotifyPowerChange: PibioStorageNotifyPowerChangeFn = null,
    public var vsmStoragePipelineInit: PibioStoragePipelineInitFn = null,
    public var vsmStoragePipelineCleanup: PibioStoragePipelineCleanupFn = null,
    public var vsmStorageActivate: PibioStorageActivateFn = null,
    public var vsmStorageDeactivate: PibioStorageDeactivateFn = null,
    public var vsmStorageQueryExtendedInfo: PibioStorageQueryExtendedInfoFn = null,
    public var vsmStorageCacheClear: PibioFrameworkVsmCacheClearFn = null,
    public var vsmStorageCacheImportBegin: PibioFrameworkVsmCacheImportBeginFn = null,
    public var vsmStorageCacheImportNext: PibioFrameworkVsmCacheImportNextFn = null,
    public var vsmStorageCacheImportEnd: PibioFrameworkVsmCacheImportEndFn = null,
    public var vsmStorageCacheExportBegin: PibioFrameworkVsmCacheExportBeginFn = null,
    public var vsmStorageCacheExportNext: PibioFrameworkVsmCacheExportNextFn = null,
    public var vsmStorageCacheExportEnd: PibioFrameworkVsmCacheExportEndFn = null,
    public var vsmSensorAttach: PibioSensorAttachFn = null,
    public var vsmSensorDetach: PibioSensorDetachFn = null,
    public var vsmSensorClearContext: PibioSensorClearContextFn = null,
    public var vsmSensorPushDataToEngine: PibioSensorPushDataToEngineFn = null,
    public var vsmSensorNotifyPowerChange: PibioSensorNotifyPowerChangeFn = null,
    public var vsmSensorPipelineInit: PibioSensorPipelineInitFn = null,
    public var vsmSensorPipelineCleanup: PibioSensorPipelineCleanupFn = null,
    public var vsmSensorActivate: PibioSensorActivateFn = null,
    public var vsmSensorDeactivate: PibioSensorDeactivateFn = null,
    public var vsmSensorAsyncImportRawBuffer: PibioSensorAsyncImportRawBufferFn = null,
    public var vsmSensorAsyncImportSecureBuffer: PibioSensorAsyncImportSecureBufferFn = null,
    public var reserved1: PibioFrameworkVsmStorageReserved1Fn = null,
    public var reserved2: PibioFrameworkVsmStorageReserved2Fn = null,
    public var reserved3: PibioFrameworkVsmStorageReserved3Fn = null,
    public var reserved4: PibioStorageReserved1Fn = null,
    public var reserved5: PibioStorageReserved2Fn = null,
    public var allocateMemory: PibioFrameworkAllocateMemoryFn = null,
    public var freeMemory: PibioFrameworkFreeMemoryFn = null,
    public var getProperty: PibioFrameworkGetPropertyFn = null,
    public var lockAndValidateSecureBuffer: PibioFrameworkLockAndValidateSecureBufferFn = null,
    public var releaseSecureBuffer: PibioFrameworkReleaseSecureBufferFn = null,
    public var queryAuthorizedEnrollments: PibioFrameworkVsmQueryAuthorizedEnrollmentsFn = null,
    public var decryptSample: PibioFrameworkVsmDecryptSampleFn = null,
)

public data class WinbioGestureMetadata(
    public var size: Int = 0,
    public var biometricType: UInt = 0u,
    public var matchType: UInt = 0u,
    public var protectionType: UInt = 0u,
)

public data class WinbioGetIndicator(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var indicatorStatus: UInt = 0u,
)

public data class WinbioIdentity(public var type: UInt = 0u, public var value: WinbioIdentity0 = WinbioIdentity0())

public data class WinbioIdentity0(
    public var nullVal: UInt = 0u,
    public var wildcard: UInt = 0u,
    public var templateGuid: Guid = Guid(),
    public var accountSid: WinbioIdentity00 = WinbioIdentity00(),
    public var secureId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioIdentity0) return false
        if (this.nullVal != other.nullVal) return false
        if (this.wildcard != other.wildcard) return false
        if (this.templateGuid != other.templateGuid) return false
        if (this.accountSid != other.accountSid) return false
        if (!this.secureId.contentEquals(other.secureId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nullVal.hashCode()
        result = 31 * result + this.wildcard.hashCode()
        result = 31 * result + this.templateGuid.hashCode()
        result = 31 * result + this.accountSid.hashCode()
        result = 31 * result + this.secureId.contentHashCode()
        return result
    }
}

public data class WinbioIdentity00(public var size: UInt = 0u, public var data: UByteArray = UByteArray(68)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioIdentity00) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioNotifyWake(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var reason: UInt = 0u,
)

public data class WinbioPipeline(
    public var sensorHandle: Handle = null,
    public var engineHandle: Handle = null,
    public var storageHandle: Handle = null,
    public var sensorInterface: WinbioSensorInterface? = null,
    public var engineInterface: WinbioEngineInterface? = null,
    public var storageInterface: WinbioStorageInterface? = null,
    public var sensorContext: Int? = null,
    public var engineContext: Int? = null,
    public var storageContext: Int? = null,
    public var frameworkInterface: WinbioFrameworkInterface? = null,
)

public data class WinbioPresence(
    public var factor: UInt = 0u,
    public var subFactor: UByte = 0u,
    public var status: Hresult = 0,
    public var rejectDetail: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var trackingId: ULong = 0uL,
    public var ticket: ULong = 0uL,
    public var properties: WinbioPresenceProperties = WinbioPresenceProperties(),
    public var authorization: WinbioPresence0 = WinbioPresence0(),
)

public data class WinbioPresence0(public var size: UInt = 0u, public var data: UByteArray = UByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioPresence0) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioPresenceProperties(public var facialFeatures: WinbioPresenceProperties0 = WinbioPresenceProperties0(), public var iris: WinbioPresenceProperties1 = WinbioPresenceProperties1())

public data class WinbioPresenceProperties0(
    public var boundingBox: Rect = Rect(),
    public var distance: Int = 0,
    public var opaqueEngineData: WinbioPresenceProperties00 = WinbioPresenceProperties00(),
)

public data class WinbioPresenceProperties00(public var adapterId: Guid = Guid(), public var data: UIntArray = UIntArray(78)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioPresenceProperties00) return false
        if (this.adapterId != other.adapterId) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioPresenceProperties1(
    public var eyeBoundingBox1: Rect = Rect(),
    public var eyeBoundingBox2: Rect = Rect(),
    public var pupilCenter1: Point = Point(),
    public var pupilCenter2: Point = Point(),
    public var distance: Int = 0,
)

public data class WinbioPrivateSensorTypeInfo(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var privateSensorTypeInfo: WinbioData = WinbioData(),
)

public data class WinbioProtectionPolicy(
    public var version: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var databaseId: Guid = Guid(),
    public var userState: ULong = 0uL,
    public var policySize: Int = 0,
    public var policy: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioProtectionPolicy) return false
        if (this.version != other.version) return false
        if (this.identity != other.identity) return false
        if (this.databaseId != other.databaseId) return false
        if (this.userState != other.userState) return false
        if (this.policySize != other.policySize) return false
        if (!this.policy.contentEquals(other.policy)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.identity.hashCode()
        result = 31 * result + this.databaseId.hashCode()
        result = 31 * result + this.userState.hashCode()
        result = 31 * result + this.policySize.hashCode()
        result = 31 * result + this.policy.contentHashCode()
        return result
    }
}

public data class WinbioRegisteredFormat(public var owner: UShort = 0u, public var type: UShort = 0u)

public data class WinbioSecureBufferHeaderV1(
    public var type: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var validationTag: ULong = 0uL,
)

public data class WinbioSecureConnectionData(
    public var size: UInt = 0u,
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
    public var modelCertificateSize: UInt = 0u,
    public var intermediateCA1Size: UInt = 0u,
    public var intermediateCA2Size: UInt = 0u,
)

public data class WinbioSecureConnectionParams(
    public var payloadSize: UInt = 0u,
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
)

public data class WinbioSensorAttributes(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var winBioVersion: WinbioVersion = WinbioVersion(),
    public var sensorType: UInt = 0u,
    public var sensorSubType: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var manufacturerName: UShortArray = UShortArray(256),
    public var modelName: UShortArray = UShortArray(256),
    public var serialNumber: UShortArray = UShortArray(256),
    public var firmwareVersion: WinbioVersion = WinbioVersion(),
    public var supportedFormatEntries: UInt = 0u,
    public var supportedFormat: List<WinbioRegisteredFormat> = List(1) { WinbioRegisteredFormat() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioSensorAttributes) return false
        if (this.payloadSize != other.payloadSize) return false
        if (this.winBioHresult != other.winBioHresult) return false
        if (this.winBioVersion != other.winBioVersion) return false
        if (this.sensorType != other.sensorType) return false
        if (this.sensorSubType != other.sensorSubType) return false
        if (this.capabilities != other.capabilities) return false
        if (!this.manufacturerName.contentEquals(other.manufacturerName)) return false
        if (!this.modelName.contentEquals(other.modelName)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        if (this.supportedFormatEntries != other.supportedFormatEntries) return false
        if (this.supportedFormat != other.supportedFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.winBioHresult.hashCode()
        result = 31 * result + this.winBioVersion.hashCode()
        result = 31 * result + this.sensorType.hashCode()
        result = 31 * result + this.sensorSubType.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.manufacturerName.contentHashCode()
        result = 31 * result + this.modelName.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        result = 31 * result + this.supportedFormatEntries.hashCode()
        result = 31 * result + this.supportedFormat.hashCode()
        return result
    }
}

public class WinbioSensorInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioSensorAttachFn = null,
    public var detach: PibioSensorDetachFn = null,
    public var clearContext: PibioSensorClearContextFn = null,
    public var queryStatus: PibioSensorQueryStatusFn = null,
    public var reset: PibioSensorResetFn = null,
    public var setMode: PibioSensorSetModeFn = null,
    public var setIndicatorStatus: PibioSensorSetIndicatorStatusFn = null,
    public var getIndicatorStatus: PibioSensorGetIndicatorStatusFn = null,
    public var startCapture: PibioSensorStartCaptureFn = null,
    public var finishCapture: PibioSensorFinishCaptureFn = null,
    public var exportSensorData: PibioSensorExportSensorDataFn = null,
    public var cancel: PibioSensorCancelFn = null,
    public var pushDataToEngine: PibioSensorPushDataToEngineFn = null,
    public var controlUnit: PibioSensorControlUnitFn = null,
    public var controlUnitPrivileged: PibioSensorControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioSensorNotifyPowerChangeFn = null,
    public var pipelineInit: PibioSensorPipelineInitFn = null,
    public var pipelineCleanup: PibioSensorPipelineCleanupFn = null,
    public var activate: PibioSensorActivateFn = null,
    public var deactivate: PibioSensorDeactivateFn = null,
    public var queryExtendedInfo: PibioSensorQueryExtendedInfoFn = null,
    public var queryCalibrationFormats: PibioSensorQueryCalibrationFormatsFn = null,
    public var setCalibrationFormat: PibioSensorSetCalibrationFormatFn = null,
    public var acceptCalibrationData: PibioSensorAcceptCalibrationDataFn = null,
    public var asyncImportRawBuffer: PibioSensorAsyncImportRawBufferFn = null,
    public var asyncImportSecureBuffer: PibioSensorAsyncImportSecureBufferFn = null,
    public var queryPrivateSensorType: PibioSensorQueryPrivateSensorTypeFn = null,
    public var connectSecure: PibioSensorConnectSecureFn = null,
    public var startCaptureEx: PibioSensorStartCaptureExFn = null,
    public var startNotifyWake: PibioSensorStartNotifyWakeFn = null,
    public var finishNotifyWake: PibioSensorFinishNotifyWakeFn = null,
)

public data class WinbioSetIndicator(public var payloadSize: UInt = 0u, public var indicatorStatus: UInt = 0u)

public class WinbioStorageInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioStorageAttachFn = null,
    public var detach: PibioStorageDetachFn = null,
    public var clearContext: PibioStorageClearContextFn = null,
    public var createDatabase: PibioStorageCreateDatabaseFn = null,
    public var eraseDatabase: PibioStorageEraseDatabaseFn = null,
    public var openDatabase: PibioStorageOpenDatabaseFn = null,
    public var closeDatabase: PibioStorageCloseDatabaseFn = null,
    public var getDataFormat: PibioStorageGetDataFormatFn = null,
    public var getDatabaseSize: PibioStorageGetDatabaseSizeFn = null,
    public var addRecord: PibioStorageAddRecordFn = null,
    public var deleteRecord: PibioStorageDeleteRecordFn = null,
    public var queryBySubject: PibioStorageQueryBySubjectFn = null,
    public var queryByContent: PibioStorageQueryByContentFn = null,
    public var getRecordCount: PibioStorageGetRecordCountFn = null,
    public var firstRecord: PibioStorageFirstRecordFn = null,
    public var nextRecord: PibioStorageNextRecordFn = null,
    public var getCurrentRecord: PibioStorageGetCurrentRecordFn = null,
    public var controlUnit: PibioStorageControlUnitFn = null,
    public var controlUnitPrivileged: PibioStorageControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioStorageNotifyPowerChangeFn = null,
    public var pipelineInit: PibioStoragePipelineInitFn = null,
    public var pipelineCleanup: PibioStoragePipelineCleanupFn = null,
    public var activate: PibioStorageActivateFn = null,
    public var deactivate: PibioStorageDeactivateFn = null,
    public var queryExtendedInfo: PibioStorageQueryExtendedInfoFn = null,
    public var notifyDatabaseChange: PibioStorageNotifyDatabaseChangeFn = null,
    public var reserved1: PibioStorageReserved1Fn = null,
    public var reserved2: PibioStorageReserved2Fn = null,
    public var updateRecordBegin: PibioStorageUpdateRecordBeginFn = null,
    public var updateRecordCommit: PibioStorageUpdateRecordCommitFn = null,
)

public data class WinbioStorageRecord(
    public var identity: WinbioIdentity? = null,
    public var subFactor: UByte = 0u,
    public var indexVector: UInt? = null,
    public var indexElementCount: Int = 0,
    public var templateBlob: COpaquePointer? = null,
    public var templateBlobSize: Int = 0,
    public var payloadBlob: COpaquePointer? = null,
    public var payloadBlobSize: Int = 0,
)

public data class WinbioStorageSchema(
    public var biometricFactor: UInt = 0u,
    public var databaseId: Guid = Guid(),
    public var dataFormat: Guid = Guid(),
    public var attributes: UInt = 0u,
    public var filePath: UShortArray = UShortArray(256),
    public var connectionString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioStorageSchema) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.databaseId != other.databaseId) return false
        if (this.dataFormat != other.dataFormat) return false
        if (this.attributes != other.attributes) return false
        if (!this.filePath.contentEquals(other.filePath)) return false
        if (!this.connectionString.contentEquals(other.connectionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.biometricFactor.hashCode()
        result = 31 * result + this.databaseId.hashCode()
        result = 31 * result + this.dataFormat.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.filePath.contentHashCode()
        result = 31 * result + this.connectionString.contentHashCode()
        return result
    }
}

public data class WinbioSupportedAlgorithms(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var numberOfAlgorithms: UInt = 0u,
    public var algorithmData: WinbioData = WinbioData(),
)

public data class WinbioUnitSchema(
    public var unitId: UInt = 0u,
    public var poolType: UInt = 0u,
    public var biometricFactor: UInt = 0u,
    public var sensorSubType: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var deviceInstanceId: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var manufacturer: UShortArray = UShortArray(256),
    public var model: UShortArray = UShortArray(256),
    public var serialNumber: UShortArray = UShortArray(256),
    public var firmwareVersion: WinbioVersion = WinbioVersion(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioUnitSchema) return false
        if (this.unitId != other.unitId) return false
        if (this.poolType != other.poolType) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.sensorSubType != other.sensorSubType) return false
        if (this.capabilities != other.capabilities) return false
        if (!this.deviceInstanceId.contentEquals(other.deviceInstanceId)) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unitId.hashCode()
        result = 31 * result + this.poolType.hashCode()
        result = 31 * result + this.biometricFactor.hashCode()
        result = 31 * result + this.sensorSubType.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.deviceInstanceId.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        return result
    }
}

public data class WinbioUpdateFirmware(public var payloadSize: UInt = 0u, public var firmwareData: WinbioData = WinbioData())

public data class WinbioVersion(public var majorVersion: UInt = 0u, public var minorVersion: UInt = 0u)
