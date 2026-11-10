@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public data class FaxConfigurationa(
    public var sizeOfStruct: UInt = 0u,
    public var retries: UInt = 0u,
    public var retryDelay: UInt = 0u,
    public var dirtyDays: UInt = 0u,
    public var branding: Bool = 0,
    public var useDeviceTsid: Bool = 0,
    public var serverCp: Bool = 0,
    public var pauseServerQueue: Bool = 0,
    public var startCheapTime: FaxTime = FaxTime(),
    public var stopCheapTime: FaxTime = FaxTime(),
    public var archiveOutgoingFaxes: Bool = 0,
    public var archiveDirectory: Pcstr = null,
    public var reserved: Pcstr = null,
)

public data class FaxConfigurationw(
    public var sizeOfStruct: UInt = 0u,
    public var retries: UInt = 0u,
    public var retryDelay: UInt = 0u,
    public var dirtyDays: UInt = 0u,
    public var branding: Bool = 0,
    public var useDeviceTsid: Bool = 0,
    public var serverCp: Bool = 0,
    public var pauseServerQueue: Bool = 0,
    public var startCheapTime: FaxTime = FaxTime(),
    public var stopCheapTime: FaxTime = FaxTime(),
    public var archiveOutgoingFaxes: Bool = 0,
    public var archiveDirectory: Pcwstr = null,
    public var reserved: Pcwstr = null,
)

public data class FaxContextInfoa(
    public var sizeOfStruct: UInt = 0u,
    public var hDC: Hdc = null,
    public var serverName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxContextInfoa) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.serverName.contentEquals(other.serverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.serverName.contentHashCode()
        return result
    }
}

public data class FaxContextInfow(
    public var sizeOfStruct: UInt = 0u,
    public var hDC: Hdc = null,
    public var serverName: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxContextInfow) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.serverName.contentEquals(other.serverName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.serverName.contentHashCode()
        return result
    }
}

public class FaxCoverpageInfoa(
    public var sizeOfStruct: UInt = 0u,
    public var coverPageName: Pcstr = null,
    public var useServerCoverPage: Bool = 0,
    public var recName: Pcstr = null,
    public var recFaxNumber: Pcstr = null,
    public var recCompany: Pcstr = null,
    public var recStreetAddress: Pcstr = null,
    public var recCity: Pcstr = null,
    public var recState: Pcstr = null,
    public var recZip: Pcstr = null,
    public var recCountry: Pcstr = null,
    public var recTitle: Pcstr = null,
    public var recDepartment: Pcstr = null,
    public var recOfficeLocation: Pcstr = null,
    public var recHomePhone: Pcstr = null,
    public var recOfficePhone: Pcstr = null,
    public var sdrName: Pcstr = null,
    public var sdrFaxNumber: Pcstr = null,
    public var sdrCompany: Pcstr = null,
    public var sdrAddress: Pcstr = null,
    public var sdrTitle: Pcstr = null,
    public var sdrDepartment: Pcstr = null,
    public var sdrOfficeLocation: Pcstr = null,
    public var sdrHomePhone: Pcstr = null,
    public var sdrOfficePhone: Pcstr = null,
    public var note: Pcstr = null,
    public var subject: Pcstr = null,
    public var timeSent: Systemtime = Systemtime(),
    public var pageCount: UInt = 0u,
)

public class FaxCoverpageInfow(
    public var sizeOfStruct: UInt = 0u,
    public var coverPageName: Pcwstr = null,
    public var useServerCoverPage: Bool = 0,
    public var recName: Pcwstr = null,
    public var recFaxNumber: Pcwstr = null,
    public var recCompany: Pcwstr = null,
    public var recStreetAddress: Pcwstr = null,
    public var recCity: Pcwstr = null,
    public var recState: Pcwstr = null,
    public var recZip: Pcwstr = null,
    public var recCountry: Pcwstr = null,
    public var recTitle: Pcwstr = null,
    public var recDepartment: Pcwstr = null,
    public var recOfficeLocation: Pcwstr = null,
    public var recHomePhone: Pcwstr = null,
    public var recOfficePhone: Pcwstr = null,
    public var sdrName: Pcwstr = null,
    public var sdrFaxNumber: Pcwstr = null,
    public var sdrCompany: Pcwstr = null,
    public var sdrAddress: Pcwstr = null,
    public var sdrTitle: Pcwstr = null,
    public var sdrDepartment: Pcwstr = null,
    public var sdrOfficeLocation: Pcwstr = null,
    public var sdrHomePhone: Pcwstr = null,
    public var sdrOfficePhone: Pcwstr = null,
    public var note: Pcwstr = null,
    public var subject: Pcwstr = null,
    public var timeSent: Systemtime = Systemtime(),
    public var pageCount: UInt = 0u,
)

public class FaxDeviceStatusa(
    public var sizeOfStruct: UInt = 0u,
    public var callerId: Pcstr = null,
    public var csid: Pcstr = null,
    public var currentPage: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var deviceName: Pcstr = null,
    public var documentName: Pcstr = null,
    public var jobType: UInt = 0u,
    public var phoneNumber: Pcstr = null,
    public var routingString: Pcstr = null,
    public var senderName: Pcstr = null,
    public var recipientName: Pcstr = null,
    public var size: UInt = 0u,
    public var startTime: Filetime = Filetime(),
    public var status: UInt = 0u,
    public var statusString: Pcstr = null,
    public var submittedTime: Filetime = Filetime(),
    public var totalPages: UInt = 0u,
    public var tsid: Pcstr = null,
    public var userName: Pcstr = null,
)

public class FaxDeviceStatusw(
    public var sizeOfStruct: UInt = 0u,
    public var callerId: Pcwstr = null,
    public var csid: Pcwstr = null,
    public var currentPage: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var deviceName: Pcwstr = null,
    public var documentName: Pcwstr = null,
    public var jobType: UInt = 0u,
    public var phoneNumber: Pcwstr = null,
    public var routingString: Pcwstr = null,
    public var senderName: Pcwstr = null,
    public var recipientName: Pcwstr = null,
    public var size: UInt = 0u,
    public var startTime: Filetime = Filetime(),
    public var status: UInt = 0u,
    public var statusString: Pcwstr = null,
    public var submittedTime: Filetime = Filetime(),
    public var totalPages: UInt = 0u,
    public var tsid: Pcwstr = null,
    public var userName: Pcwstr = null,
)

public data class FaxDevStatus(
    public var sizeOfStruct: UInt = 0u,
    public var statusId: UInt = 0u,
    public var stringId: UInt = 0u,
    public var pageCount: UInt = 0u,
    public var csi: Pwstr = null,
    public var callerId: Pwstr = null,
    public var routingInfo: Pwstr = null,
    public var errorCode: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxDevStatus) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.statusId != other.statusId) return false
        if (this.stringId != other.stringId) return false
        if (this.pageCount != other.pageCount) return false
        if (this.csi != other.csi) return false
        if (this.callerId != other.callerId) return false
        if (this.routingInfo != other.routingInfo) return false
        if (this.errorCode != other.errorCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.statusId.hashCode()
        result = 31 * result + this.stringId.hashCode()
        result = 31 * result + this.pageCount.hashCode()
        result = 31 * result + this.csi.hashCode()
        result = 31 * result + this.callerId.hashCode()
        result = 31 * result + this.routingInfo.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FaxEventa(
    public var sizeOfStruct: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var deviceId: UInt = 0u,
    public var eventId: UInt = 0u,
    public var jobId: UInt = 0u,
)

public data class FaxEventw(
    public var sizeOfStruct: UInt = 0u,
    public var timeStamp: Filetime = Filetime(),
    public var deviceId: UInt = 0u,
    public var eventId: UInt = 0u,
    public var jobId: UInt = 0u,
)

public data class FaxGlobalRoutingInfoa(
    public var sizeOfStruct: UInt = 0u,
    public var priority: UInt = 0u,
    public var guid: Pcstr = null,
    public var friendlyName: Pcstr = null,
    public var functionName: Pcstr = null,
    public var extensionImageName: Pcstr = null,
    public var extensionFriendlyName: Pcstr = null,
)

public data class FaxGlobalRoutingInfow(
    public var sizeOfStruct: UInt = 0u,
    public var priority: UInt = 0u,
    public var guid: Pcwstr = null,
    public var friendlyName: Pcwstr = null,
    public var functionName: Pcwstr = null,
    public var extensionImageName: Pcwstr = null,
    public var extensionFriendlyName: Pcwstr = null,
)

public class FaxJobEntrya(
    public var sizeOfStruct: UInt = 0u,
    public var jobId: UInt = 0u,
    public var userName: Pcstr = null,
    public var jobType: UInt = 0u,
    public var queueStatus: UInt = 0u,
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pageCount: UInt = 0u,
    public var recipientNumber: Pcstr = null,
    public var recipientName: Pcstr = null,
    public var tsid: Pcstr = null,
    public var senderName: Pcstr = null,
    public var senderCompany: Pcstr = null,
    public var senderDept: Pcstr = null,
    public var billingCode: Pcstr = null,
    public var scheduleAction: UInt = 0u,
    public var scheduleTime: Systemtime = Systemtime(),
    public var deliveryReportType: UInt = 0u,
    public var deliveryReportAddress: Pcstr = null,
    public var documentName: Pcstr = null,
)

public class FaxJobEntryw(
    public var sizeOfStruct: UInt = 0u,
    public var jobId: UInt = 0u,
    public var userName: Pcwstr = null,
    public var jobType: UInt = 0u,
    public var queueStatus: UInt = 0u,
    public var status: UInt = 0u,
    public var size: UInt = 0u,
    public var pageCount: UInt = 0u,
    public var recipientNumber: Pcwstr = null,
    public var recipientName: Pcwstr = null,
    public var tsid: Pcwstr = null,
    public var senderName: Pcwstr = null,
    public var senderCompany: Pcwstr = null,
    public var senderDept: Pcwstr = null,
    public var billingCode: Pcwstr = null,
    public var scheduleAction: UInt = 0u,
    public var scheduleTime: Systemtime = Systemtime(),
    public var deliveryReportType: UInt = 0u,
    public var deliveryReportAddress: Pcwstr = null,
    public var documentName: Pcwstr = null,
)

public data class FaxJobParama(
    public var sizeOfStruct: UInt = 0u,
    public var recipientNumber: Pcstr = null,
    public var recipientName: Pcstr = null,
    public var tsid: Pcstr = null,
    public var senderName: Pcstr = null,
    public var senderCompany: Pcstr = null,
    public var senderDept: Pcstr = null,
    public var billingCode: Pcstr = null,
    public var scheduleAction: UInt = 0u,
    public var scheduleTime: Systemtime = Systemtime(),
    public var deliveryReportType: UInt = 0u,
    public var deliveryReportAddress: Pcstr = null,
    public var documentName: Pcstr = null,
    public var callHandle: UInt = 0u,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxJobParama) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.recipientName != other.recipientName) return false
        if (this.tsid != other.tsid) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.billingCode != other.billingCode) return false
        if (this.scheduleAction != other.scheduleAction) return false
        if (this.scheduleTime != other.scheduleTime) return false
        if (this.deliveryReportType != other.deliveryReportType) return false
        if (this.deliveryReportAddress != other.deliveryReportAddress) return false
        if (this.documentName != other.documentName) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.billingCode.hashCode()
        result = 31 * result + this.scheduleAction.hashCode()
        result = 31 * result + this.scheduleTime.hashCode()
        result = 31 * result + this.deliveryReportType.hashCode()
        result = 31 * result + this.deliveryReportAddress.hashCode()
        result = 31 * result + this.documentName.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FaxJobParamw(
    public var sizeOfStruct: UInt = 0u,
    public var recipientNumber: Pcwstr = null,
    public var recipientName: Pcwstr = null,
    public var tsid: Pcwstr = null,
    public var senderName: Pcwstr = null,
    public var senderCompany: Pcwstr = null,
    public var senderDept: Pcwstr = null,
    public var billingCode: Pcwstr = null,
    public var scheduleAction: UInt = 0u,
    public var scheduleTime: Systemtime = Systemtime(),
    public var deliveryReportType: UInt = 0u,
    public var deliveryReportAddress: Pcwstr = null,
    public var documentName: Pcwstr = null,
    public var callHandle: UInt = 0u,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxJobParamw) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.recipientNumber != other.recipientNumber) return false
        if (this.recipientName != other.recipientName) return false
        if (this.tsid != other.tsid) return false
        if (this.senderName != other.senderName) return false
        if (this.senderCompany != other.senderCompany) return false
        if (this.senderDept != other.senderDept) return false
        if (this.billingCode != other.billingCode) return false
        if (this.scheduleAction != other.scheduleAction) return false
        if (this.scheduleTime != other.scheduleTime) return false
        if (this.deliveryReportType != other.deliveryReportType) return false
        if (this.deliveryReportAddress != other.deliveryReportAddress) return false
        if (this.documentName != other.documentName) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.recipientNumber.hashCode()
        result = 31 * result + this.recipientName.hashCode()
        result = 31 * result + this.tsid.hashCode()
        result = 31 * result + this.senderName.hashCode()
        result = 31 * result + this.senderCompany.hashCode()
        result = 31 * result + this.senderDept.hashCode()
        result = 31 * result + this.billingCode.hashCode()
        result = 31 * result + this.scheduleAction.hashCode()
        result = 31 * result + this.scheduleTime.hashCode()
        result = 31 * result + this.deliveryReportType.hashCode()
        result = 31 * result + this.deliveryReportAddress.hashCode()
        result = 31 * result + this.documentName.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FaxLogCategorya(
    public var name: Pcstr = null,
    public var category: UInt = 0u,
    public var level: UInt = 0u,
)

public data class FaxLogCategoryw(
    public var name: Pcwstr = null,
    public var category: UInt = 0u,
    public var level: UInt = 0u,
)

public data class FaxPortInfoa(
    public var sizeOfStruct: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var state: UInt = 0u,
    public var flags: UInt = 0u,
    public var rings: UInt = 0u,
    public var priority: UInt = 0u,
    public var deviceName: Pcstr = null,
    public var tsid: Pcstr = null,
    public var csid: Pcstr = null,
)

public data class FaxPortInfow(
    public var sizeOfStruct: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var state: UInt = 0u,
    public var flags: UInt = 0u,
    public var rings: UInt = 0u,
    public var priority: UInt = 0u,
    public var deviceName: Pcwstr = null,
    public var tsid: Pcwstr = null,
    public var csid: Pcwstr = null,
)

public data class FaxPrintInfoa(
    public var sizeOfStruct: UInt = 0u,
    public var docName: Pcstr = null,
    public var recipientName: Pcstr = null,
    public var recipientNumber: Pcstr = null,
    public var senderName: Pcstr = null,
    public var senderCompany: Pcstr = null,
    public var senderDept: Pcstr = null,
    public var senderBillingCode: Pcstr = null,
    public var reserved: Pcstr = null,
    public var drEmailAddress: Pcstr = null,
    public var outputFileName: Pcstr = null,
)

public data class FaxPrintInfow(
    public var sizeOfStruct: UInt = 0u,
    public var docName: Pcwstr = null,
    public var recipientName: Pcwstr = null,
    public var recipientNumber: Pcwstr = null,
    public var senderName: Pcwstr = null,
    public var senderCompany: Pcwstr = null,
    public var senderDept: Pcwstr = null,
    public var senderBillingCode: Pcwstr = null,
    public var reserved: Pcwstr = null,
    public var drEmailAddress: Pcwstr = null,
    public var outputFileName: Pcwstr = null,
)

public data class FaxReceive(
    public var sizeOfStruct: UInt = 0u,
    public var fileName: Pwstr = null,
    public var receiverName: Pwstr = null,
    public var receiverNumber: Pwstr = null,
    public var reserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxReceive) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.fileName != other.fileName) return false
        if (this.receiverName != other.receiverName) return false
        if (this.receiverNumber != other.receiverNumber) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.receiverName.hashCode()
        result = 31 * result + this.receiverNumber.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FaxRoute(
    public var sizeOfStruct: UInt = 0u,
    public var jobId: UInt = 0u,
    public var elapsedTime: ULong = 0uL,
    public var receiveTime: ULong = 0uL,
    public var pageCount: UInt = 0u,
    public var csid: Pcwstr = null,
    public var tsid: Pcwstr = null,
    public var callerId: Pcwstr = null,
    public var routingInfo: Pcwstr = null,
    public var receiverName: Pcwstr = null,
    public var receiverNumber: Pcwstr = null,
    public var deviceName: Pcwstr = null,
    public var deviceId: UInt = 0u,
    public var routingInfoData: COpaquePointer? = null,
    public var routingInfoDataSize: UInt = 0u,
)

public data class FaxRouteCallbackroutines(
    public var sizeOfStruct: UInt = 0u,
    public var faxRouteAddFile: Pfaxrouteaddfile = null,
    public var faxRouteDeleteFile: Pfaxroutedeletefile = null,
    public var faxRouteGetFile: Pfaxroutegetfile = null,
    public var faxRouteEnumFiles: Pfaxrouteenumfiles = null,
    public var faxRouteModifyRoutingData: Pfaxroutemodifyroutingdata = null,
)

public data class FaxRoutingMethoda(
    public var sizeOfStruct: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var enabled: Bool = 0,
    public var deviceName: Pcstr = null,
    public var guid: Pcstr = null,
    public var friendlyName: Pcstr = null,
    public var functionName: Pcstr = null,
    public var extensionImageName: Pcstr = null,
    public var extensionFriendlyName: Pcstr = null,
)

public data class FaxRoutingMethodw(
    public var sizeOfStruct: UInt = 0u,
    public var deviceId: UInt = 0u,
    public var enabled: Bool = 0,
    public var deviceName: Pcwstr = null,
    public var guid: Pcwstr = null,
    public var friendlyName: Pcwstr = null,
    public var functionName: Pcwstr = null,
    public var extensionImageName: Pcwstr = null,
    public var extensionFriendlyName: Pcwstr = null,
)

public data class FaxSend(
    public var sizeOfStruct: UInt = 0u,
    public var fileName: Pwstr = null,
    public var callerName: Pwstr = null,
    public var callerNumber: Pwstr = null,
    public var receiverName: Pwstr = null,
    public var receiverNumber: Pwstr = null,
    public var branding: Bool = 0,
    public var callHandle: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FaxSend) return false
        if (this.sizeOfStruct != other.sizeOfStruct) return false
        if (this.fileName != other.fileName) return false
        if (this.callerName != other.callerName) return false
        if (this.callerNumber != other.callerNumber) return false
        if (this.receiverName != other.receiverName) return false
        if (this.receiverNumber != other.receiverNumber) return false
        if (this.branding != other.branding) return false
        if (this.callHandle != other.callHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sizeOfStruct.hashCode()
        result = 31 * result + this.fileName.hashCode()
        result = 31 * result + this.callerName.hashCode()
        result = 31 * result + this.callerNumber.hashCode()
        result = 31 * result + this.receiverName.hashCode()
        result = 31 * result + this.receiverNumber.hashCode()
        result = 31 * result + this.branding.hashCode()
        result = 31 * result + this.callHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class FaxTime(
    public var hour: UShort = 0u,
    public var minute: UShort = 0u,
)

public data class Stinotify(
    public var dwSize: UInt = 0u,
    public var guidNotificationCode: Guid = Guid(),
    public var abNotificationData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stinotify) return false
        if (this.dwSize != other.dwSize) return false
        if (this.guidNotificationCode != other.guidNotificationCode) return false
        if (!this.abNotificationData.contentEquals(other.abNotificationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.guidNotificationCode.hashCode()
        result = 31 * result + this.abNotificationData.contentHashCode()
        return result
    }
}

public data class Stisubscribe(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwFilter: UInt = 0u,
    public var hWndNotify: Hwnd = null,
    public var hEvent: Handle = null,
    public var uiNotificationMessage: UInt = 0u,
)

public data class StiDeviceInformationw(
    public var dwSize: UInt = 0u,
    public var deviceType: UInt = 0u,
    public var szDeviceInternalName: UShortArray = UShortArray(128),
    public var deviceCapabilitiesA: StiDevCaps = StiDevCaps(),
    public var dwHardwareConfiguration: UInt = 0u,
    public var pszVendorDescription: Pwstr = null,
    public var pszDeviceDescription: Pwstr = null,
    public var pszPortName: Pwstr = null,
    public var pszPropProvider: Pwstr = null,
    public var pszLocalName: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StiDeviceInformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.deviceType != other.deviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.dwHardwareConfiguration != other.dwHardwareConfiguration) return false
        if (this.pszVendorDescription != other.pszVendorDescription) return false
        if (this.pszDeviceDescription != other.pszDeviceDescription) return false
        if (this.pszPortName != other.pszPortName) return false
        if (this.pszPropProvider != other.pszPropProvider) return false
        if (this.pszLocalName != other.pszLocalName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.dwHardwareConfiguration.hashCode()
        result = 31 * result + this.pszVendorDescription.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszPortName.hashCode()
        result = 31 * result + this.pszPropProvider.hashCode()
        result = 31 * result + this.pszLocalName.hashCode()
        return result
    }
}

public data class StiDeviceStatus(
    public var dwSize: UInt = 0u,
    public var statusMask: UInt = 0u,
    public var dwOnlineState: UInt = 0u,
    public var dwHardwareStatusCode: UInt = 0u,
    public var dwEventHandlingState: UInt = 0u,
    public var dwPollingInterval: UInt = 0u,
)

public data class StiDevCaps(
    public var dwGeneric: UInt = 0u,
)

public data class StiDiag(
    public var dwSize: UInt = 0u,
    public var dwBasicDiagCode: UInt = 0u,
    public var dwVendorDiagCode: UInt = 0u,
    public var dwStatusMask: UInt = 0u,
    public var sErrorInfo: ErrorInfow = ErrorInfow(),
)

public data class StiUsdCaps(
    public var dwVersion: UInt = 0u,
    public var dwGenericCaps: UInt = 0u,
)

public data class StiWiaDeviceInformationw(
    public var dwSize: UInt = 0u,
    public var deviceType: UInt = 0u,
    public var szDeviceInternalName: UShortArray = UShortArray(128),
    public var deviceCapabilitiesA: StiDevCaps = StiDevCaps(),
    public var dwHardwareConfiguration: UInt = 0u,
    public var pszVendorDescription: Pwstr = null,
    public var pszDeviceDescription: Pwstr = null,
    public var pszPortName: Pwstr = null,
    public var pszPropProvider: Pwstr = null,
    public var pszLocalName: Pwstr = null,
    public var pszUiDll: Pwstr = null,
    public var pszServer: Pwstr = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StiWiaDeviceInformationw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.deviceType != other.deviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.deviceCapabilitiesA != other.deviceCapabilitiesA) return false
        if (this.dwHardwareConfiguration != other.dwHardwareConfiguration) return false
        if (this.pszVendorDescription != other.pszVendorDescription) return false
        if (this.pszDeviceDescription != other.pszDeviceDescription) return false
        if (this.pszPortName != other.pszPortName) return false
        if (this.pszPropProvider != other.pszPropProvider) return false
        if (this.pszLocalName != other.pszLocalName) return false
        if (this.pszUiDll != other.pszUiDll) return false
        if (this.pszServer != other.pszServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.deviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.deviceCapabilitiesA.hashCode()
        result = 31 * result + this.dwHardwareConfiguration.hashCode()
        result = 31 * result + this.pszVendorDescription.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszPortName.hashCode()
        result = 31 * result + this.pszPropProvider.hashCode()
        result = 31 * result + this.pszLocalName.hashCode()
        result = 31 * result + this.pszUiDll.hashCode()
        result = 31 * result + this.pszServer.hashCode()
        return result
    }
}

public data class ErrorInfow(
    public var dwSize: UInt = 0u,
    public var dwGenericError: UInt = 0u,
    public var dwVendorError: UInt = 0u,
    public var szExtendedErrorText: UShortArray = UShortArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ErrorInfow) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwGenericError != other.dwGenericError) return false
        if (this.dwVendorError != other.dwVendorError) return false
        if (!this.szExtendedErrorText.contentEquals(other.szExtendedErrorText)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwGenericError.hashCode()
        result = 31 * result + this.dwVendorError.hashCode()
        result = 31 * result + this.szExtendedErrorText.contentHashCode()
        return result
    }
}
