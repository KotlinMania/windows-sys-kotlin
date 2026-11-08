@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.fax

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public data class FAX_CONFIGURATIONA(
    public var SizeOfStruct: UInt = 0u,
    public var Retries: UInt = 0u,
    public var RetryDelay: UInt = 0u,
    public var DirtyDays: UInt = 0u,
    public var Branding: BOOL = 0,
    public var UseDeviceTsid: BOOL = 0,
    public var ServerCp: BOOL = 0,
    public var PauseServerQueue: BOOL = 0,
    public var StartCheapTime: FAX_TIME = FAX_TIME(),
    public var StopCheapTime: FAX_TIME = FAX_TIME(),
    public var ArchiveOutgoingFaxes: BOOL = 0,
    public var ArchiveDirectory: PCSTR = 0L,
    public var Reserved: PCSTR = 0L,
)

public data class FAX_CONFIGURATIONW(
    public var SizeOfStruct: UInt = 0u,
    public var Retries: UInt = 0u,
    public var RetryDelay: UInt = 0u,
    public var DirtyDays: UInt = 0u,
    public var Branding: BOOL = 0,
    public var UseDeviceTsid: BOOL = 0,
    public var ServerCp: BOOL = 0,
    public var PauseServerQueue: BOOL = 0,
    public var StartCheapTime: FAX_TIME = FAX_TIME(),
    public var StopCheapTime: FAX_TIME = FAX_TIME(),
    public var ArchiveOutgoingFaxes: BOOL = 0,
    public var ArchiveDirectory: PCWSTR = 0L,
    public var Reserved: PCWSTR = 0L,
)

public data class FAX_CONTEXT_INFOA(
    public var SizeOfStruct: UInt = 0u,
    public var hDC: HDC = 0L,
    public var ServerName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_CONTEXT_INFOA) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.ServerName.contentEquals(other.ServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.ServerName.contentHashCode()
        return result
    }
}

public data class FAX_CONTEXT_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var hDC: HDC = 0L,
    public var ServerName: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_CONTEXT_INFOW) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.hDC != other.hDC) return false
        if (!this.ServerName.contentEquals(other.ServerName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.hDC.hashCode()
        result = 31 * result + this.ServerName.contentHashCode()
        return result
    }
}

public class FAX_COVERPAGE_INFOA(
    public var SizeOfStruct: UInt = 0u,
    public var CoverPageName: PCSTR = 0L,
    public var UseServerCoverPage: BOOL = 0,
    public var RecName: PCSTR = 0L,
    public var RecFaxNumber: PCSTR = 0L,
    public var RecCompany: PCSTR = 0L,
    public var RecStreetAddress: PCSTR = 0L,
    public var RecCity: PCSTR = 0L,
    public var RecState: PCSTR = 0L,
    public var RecZip: PCSTR = 0L,
    public var RecCountry: PCSTR = 0L,
    public var RecTitle: PCSTR = 0L,
    public var RecDepartment: PCSTR = 0L,
    public var RecOfficeLocation: PCSTR = 0L,
    public var RecHomePhone: PCSTR = 0L,
    public var RecOfficePhone: PCSTR = 0L,
    public var SdrName: PCSTR = 0L,
    public var SdrFaxNumber: PCSTR = 0L,
    public var SdrCompany: PCSTR = 0L,
    public var SdrAddress: PCSTR = 0L,
    public var SdrTitle: PCSTR = 0L,
    public var SdrDepartment: PCSTR = 0L,
    public var SdrOfficeLocation: PCSTR = 0L,
    public var SdrHomePhone: PCSTR = 0L,
    public var SdrOfficePhone: PCSTR = 0L,
    public var Note: PCSTR = 0L,
    public var Subject: PCSTR = 0L,
    public var TimeSent: SYSTEMTIME = SYSTEMTIME(),
    public var PageCount: UInt = 0u,
)

public class FAX_COVERPAGE_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var CoverPageName: PCWSTR = 0L,
    public var UseServerCoverPage: BOOL = 0,
    public var RecName: PCWSTR = 0L,
    public var RecFaxNumber: PCWSTR = 0L,
    public var RecCompany: PCWSTR = 0L,
    public var RecStreetAddress: PCWSTR = 0L,
    public var RecCity: PCWSTR = 0L,
    public var RecState: PCWSTR = 0L,
    public var RecZip: PCWSTR = 0L,
    public var RecCountry: PCWSTR = 0L,
    public var RecTitle: PCWSTR = 0L,
    public var RecDepartment: PCWSTR = 0L,
    public var RecOfficeLocation: PCWSTR = 0L,
    public var RecHomePhone: PCWSTR = 0L,
    public var RecOfficePhone: PCWSTR = 0L,
    public var SdrName: PCWSTR = 0L,
    public var SdrFaxNumber: PCWSTR = 0L,
    public var SdrCompany: PCWSTR = 0L,
    public var SdrAddress: PCWSTR = 0L,
    public var SdrTitle: PCWSTR = 0L,
    public var SdrDepartment: PCWSTR = 0L,
    public var SdrOfficeLocation: PCWSTR = 0L,
    public var SdrHomePhone: PCWSTR = 0L,
    public var SdrOfficePhone: PCWSTR = 0L,
    public var Note: PCWSTR = 0L,
    public var Subject: PCWSTR = 0L,
    public var TimeSent: SYSTEMTIME = SYSTEMTIME(),
    public var PageCount: UInt = 0u,
)

public class FAX_DEVICE_STATUSA(
    public var SizeOfStruct: UInt = 0u,
    public var CallerId: PCSTR = 0L,
    public var Csid: PCSTR = 0L,
    public var CurrentPage: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var DeviceName: PCSTR = 0L,
    public var DocumentName: PCSTR = 0L,
    public var JobType: UInt = 0u,
    public var PhoneNumber: PCSTR = 0L,
    public var RoutingString: PCSTR = 0L,
    public var SenderName: PCSTR = 0L,
    public var RecipientName: PCSTR = 0L,
    public var Size: UInt = 0u,
    public var StartTime: FILETIME = FILETIME(),
    public var Status: UInt = 0u,
    public var StatusString: PCSTR = 0L,
    public var SubmittedTime: FILETIME = FILETIME(),
    public var TotalPages: UInt = 0u,
    public var Tsid: PCSTR = 0L,
    public var UserName: PCSTR = 0L,
)

public class FAX_DEVICE_STATUSW(
    public var SizeOfStruct: UInt = 0u,
    public var CallerId: PCWSTR = 0L,
    public var Csid: PCWSTR = 0L,
    public var CurrentPage: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var DeviceName: PCWSTR = 0L,
    public var DocumentName: PCWSTR = 0L,
    public var JobType: UInt = 0u,
    public var PhoneNumber: PCWSTR = 0L,
    public var RoutingString: PCWSTR = 0L,
    public var SenderName: PCWSTR = 0L,
    public var RecipientName: PCWSTR = 0L,
    public var Size: UInt = 0u,
    public var StartTime: FILETIME = FILETIME(),
    public var Status: UInt = 0u,
    public var StatusString: PCWSTR = 0L,
    public var SubmittedTime: FILETIME = FILETIME(),
    public var TotalPages: UInt = 0u,
    public var Tsid: PCWSTR = 0L,
    public var UserName: PCWSTR = 0L,
)

public data class FAX_DEV_STATUS(
    public var SizeOfStruct: UInt = 0u,
    public var StatusId: UInt = 0u,
    public var StringId: UInt = 0u,
    public var PageCount: UInt = 0u,
    public var CSI: PWSTR = 0L,
    public var CallerId: PWSTR = 0L,
    public var RoutingInfo: PWSTR = 0L,
    public var ErrorCode: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_DEV_STATUS) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.StatusId != other.StatusId) return false
        if (this.StringId != other.StringId) return false
        if (this.PageCount != other.PageCount) return false
        if (this.CSI != other.CSI) return false
        if (this.CallerId != other.CallerId) return false
        if (this.RoutingInfo != other.RoutingInfo) return false
        if (this.ErrorCode != other.ErrorCode) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.StatusId.hashCode()
        result = 31 * result + this.StringId.hashCode()
        result = 31 * result + this.PageCount.hashCode()
        result = 31 * result + this.CSI.hashCode()
        result = 31 * result + this.CallerId.hashCode()
        result = 31 * result + this.RoutingInfo.hashCode()
        result = 31 * result + this.ErrorCode.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FAX_EVENTA(
    public var SizeOfStruct: UInt = 0u,
    public var TimeStamp: FILETIME = FILETIME(),
    public var DeviceId: UInt = 0u,
    public var EventId: UInt = 0u,
    public var JobId: UInt = 0u,
)

public data class FAX_EVENTW(
    public var SizeOfStruct: UInt = 0u,
    public var TimeStamp: FILETIME = FILETIME(),
    public var DeviceId: UInt = 0u,
    public var EventId: UInt = 0u,
    public var JobId: UInt = 0u,
)

public data class FAX_GLOBAL_ROUTING_INFOA(
    public var SizeOfStruct: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Guid: PCSTR = 0L,
    public var FriendlyName: PCSTR = 0L,
    public var FunctionName: PCSTR = 0L,
    public var ExtensionImageName: PCSTR = 0L,
    public var ExtensionFriendlyName: PCSTR = 0L,
)

public data class FAX_GLOBAL_ROUTING_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var Priority: UInt = 0u,
    public var Guid: PCWSTR = 0L,
    public var FriendlyName: PCWSTR = 0L,
    public var FunctionName: PCWSTR = 0L,
    public var ExtensionImageName: PCWSTR = 0L,
    public var ExtensionFriendlyName: PCWSTR = 0L,
)

public class FAX_JOB_ENTRYA(
    public var SizeOfStruct: UInt = 0u,
    public var JobId: UInt = 0u,
    public var UserName: PCSTR = 0L,
    public var JobType: UInt = 0u,
    public var QueueStatus: UInt = 0u,
    public var Status: UInt = 0u,
    public var Size: UInt = 0u,
    public var PageCount: UInt = 0u,
    public var RecipientNumber: PCSTR = 0L,
    public var RecipientName: PCSTR = 0L,
    public var Tsid: PCSTR = 0L,
    public var SenderName: PCSTR = 0L,
    public var SenderCompany: PCSTR = 0L,
    public var SenderDept: PCSTR = 0L,
    public var BillingCode: PCSTR = 0L,
    public var ScheduleAction: UInt = 0u,
    public var ScheduleTime: SYSTEMTIME = SYSTEMTIME(),
    public var DeliveryReportType: UInt = 0u,
    public var DeliveryReportAddress: PCSTR = 0L,
    public var DocumentName: PCSTR = 0L,
)

public class FAX_JOB_ENTRYW(
    public var SizeOfStruct: UInt = 0u,
    public var JobId: UInt = 0u,
    public var UserName: PCWSTR = 0L,
    public var JobType: UInt = 0u,
    public var QueueStatus: UInt = 0u,
    public var Status: UInt = 0u,
    public var Size: UInt = 0u,
    public var PageCount: UInt = 0u,
    public var RecipientNumber: PCWSTR = 0L,
    public var RecipientName: PCWSTR = 0L,
    public var Tsid: PCWSTR = 0L,
    public var SenderName: PCWSTR = 0L,
    public var SenderCompany: PCWSTR = 0L,
    public var SenderDept: PCWSTR = 0L,
    public var BillingCode: PCWSTR = 0L,
    public var ScheduleAction: UInt = 0u,
    public var ScheduleTime: SYSTEMTIME = SYSTEMTIME(),
    public var DeliveryReportType: UInt = 0u,
    public var DeliveryReportAddress: PCWSTR = 0L,
    public var DocumentName: PCWSTR = 0L,
)

public data class FAX_JOB_PARAMA(
    public var SizeOfStruct: UInt = 0u,
    public var RecipientNumber: PCSTR = 0L,
    public var RecipientName: PCSTR = 0L,
    public var Tsid: PCSTR = 0L,
    public var SenderName: PCSTR = 0L,
    public var SenderCompany: PCSTR = 0L,
    public var SenderDept: PCSTR = 0L,
    public var BillingCode: PCSTR = 0L,
    public var ScheduleAction: UInt = 0u,
    public var ScheduleTime: SYSTEMTIME = SYSTEMTIME(),
    public var DeliveryReportType: UInt = 0u,
    public var DeliveryReportAddress: PCSTR = 0L,
    public var DocumentName: PCSTR = 0L,
    public var CallHandle: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_JOB_PARAMA) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.RecipientNumber != other.RecipientNumber) return false
        if (this.RecipientName != other.RecipientName) return false
        if (this.Tsid != other.Tsid) return false
        if (this.SenderName != other.SenderName) return false
        if (this.SenderCompany != other.SenderCompany) return false
        if (this.SenderDept != other.SenderDept) return false
        if (this.BillingCode != other.BillingCode) return false
        if (this.ScheduleAction != other.ScheduleAction) return false
        if (this.ScheduleTime != other.ScheduleTime) return false
        if (this.DeliveryReportType != other.DeliveryReportType) return false
        if (this.DeliveryReportAddress != other.DeliveryReportAddress) return false
        if (this.DocumentName != other.DocumentName) return false
        if (this.CallHandle != other.CallHandle) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.RecipientNumber.hashCode()
        result = 31 * result + this.RecipientName.hashCode()
        result = 31 * result + this.Tsid.hashCode()
        result = 31 * result + this.SenderName.hashCode()
        result = 31 * result + this.SenderCompany.hashCode()
        result = 31 * result + this.SenderDept.hashCode()
        result = 31 * result + this.BillingCode.hashCode()
        result = 31 * result + this.ScheduleAction.hashCode()
        result = 31 * result + this.ScheduleTime.hashCode()
        result = 31 * result + this.DeliveryReportType.hashCode()
        result = 31 * result + this.DeliveryReportAddress.hashCode()
        result = 31 * result + this.DocumentName.hashCode()
        result = 31 * result + this.CallHandle.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FAX_JOB_PARAMW(
    public var SizeOfStruct: UInt = 0u,
    public var RecipientNumber: PCWSTR = 0L,
    public var RecipientName: PCWSTR = 0L,
    public var Tsid: PCWSTR = 0L,
    public var SenderName: PCWSTR = 0L,
    public var SenderCompany: PCWSTR = 0L,
    public var SenderDept: PCWSTR = 0L,
    public var BillingCode: PCWSTR = 0L,
    public var ScheduleAction: UInt = 0u,
    public var ScheduleTime: SYSTEMTIME = SYSTEMTIME(),
    public var DeliveryReportType: UInt = 0u,
    public var DeliveryReportAddress: PCWSTR = 0L,
    public var DocumentName: PCWSTR = 0L,
    public var CallHandle: UInt = 0u,
    public var Reserved: ULongArray = ULongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_JOB_PARAMW) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.RecipientNumber != other.RecipientNumber) return false
        if (this.RecipientName != other.RecipientName) return false
        if (this.Tsid != other.Tsid) return false
        if (this.SenderName != other.SenderName) return false
        if (this.SenderCompany != other.SenderCompany) return false
        if (this.SenderDept != other.SenderDept) return false
        if (this.BillingCode != other.BillingCode) return false
        if (this.ScheduleAction != other.ScheduleAction) return false
        if (this.ScheduleTime != other.ScheduleTime) return false
        if (this.DeliveryReportType != other.DeliveryReportType) return false
        if (this.DeliveryReportAddress != other.DeliveryReportAddress) return false
        if (this.DocumentName != other.DocumentName) return false
        if (this.CallHandle != other.CallHandle) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.RecipientNumber.hashCode()
        result = 31 * result + this.RecipientName.hashCode()
        result = 31 * result + this.Tsid.hashCode()
        result = 31 * result + this.SenderName.hashCode()
        result = 31 * result + this.SenderCompany.hashCode()
        result = 31 * result + this.SenderDept.hashCode()
        result = 31 * result + this.BillingCode.hashCode()
        result = 31 * result + this.ScheduleAction.hashCode()
        result = 31 * result + this.ScheduleTime.hashCode()
        result = 31 * result + this.DeliveryReportType.hashCode()
        result = 31 * result + this.DeliveryReportAddress.hashCode()
        result = 31 * result + this.DocumentName.hashCode()
        result = 31 * result + this.CallHandle.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FAX_LOG_CATEGORYA(
    public var Name: PCSTR = 0L,
    public var Category: UInt = 0u,
    public var Level: UInt = 0u,
)

public data class FAX_LOG_CATEGORYW(
    public var Name: PCWSTR = 0L,
    public var Category: UInt = 0u,
    public var Level: UInt = 0u,
)

public data class FAX_PORT_INFOA(
    public var SizeOfStruct: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var State: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Rings: UInt = 0u,
    public var Priority: UInt = 0u,
    public var DeviceName: PCSTR = 0L,
    public var Tsid: PCSTR = 0L,
    public var Csid: PCSTR = 0L,
)

public data class FAX_PORT_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var State: UInt = 0u,
    public var Flags: UInt = 0u,
    public var Rings: UInt = 0u,
    public var Priority: UInt = 0u,
    public var DeviceName: PCWSTR = 0L,
    public var Tsid: PCWSTR = 0L,
    public var Csid: PCWSTR = 0L,
)

public data class FAX_PRINT_INFOA(
    public var SizeOfStruct: UInt = 0u,
    public var DocName: PCSTR = 0L,
    public var RecipientName: PCSTR = 0L,
    public var RecipientNumber: PCSTR = 0L,
    public var SenderName: PCSTR = 0L,
    public var SenderCompany: PCSTR = 0L,
    public var SenderDept: PCSTR = 0L,
    public var SenderBillingCode: PCSTR = 0L,
    public var Reserved: PCSTR = 0L,
    public var DrEmailAddress: PCSTR = 0L,
    public var OutputFileName: PCSTR = 0L,
)

public data class FAX_PRINT_INFOW(
    public var SizeOfStruct: UInt = 0u,
    public var DocName: PCWSTR = 0L,
    public var RecipientName: PCWSTR = 0L,
    public var RecipientNumber: PCWSTR = 0L,
    public var SenderName: PCWSTR = 0L,
    public var SenderCompany: PCWSTR = 0L,
    public var SenderDept: PCWSTR = 0L,
    public var SenderBillingCode: PCWSTR = 0L,
    public var Reserved: PCWSTR = 0L,
    public var DrEmailAddress: PCWSTR = 0L,
    public var OutputFileName: PCWSTR = 0L,
)

public data class FAX_RECEIVE(
    public var SizeOfStruct: UInt = 0u,
    public var FileName: PWSTR = 0L,
    public var ReceiverName: PWSTR = 0L,
    public var ReceiverNumber: PWSTR = 0L,
    public var Reserved: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_RECEIVE) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.FileName != other.FileName) return false
        if (this.ReceiverName != other.ReceiverName) return false
        if (this.ReceiverNumber != other.ReceiverNumber) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.FileName.hashCode()
        result = 31 * result + this.ReceiverName.hashCode()
        result = 31 * result + this.ReceiverNumber.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FAX_ROUTE(
    public var SizeOfStruct: UInt = 0u,
    public var JobId: UInt = 0u,
    public var ElapsedTime: ULong = 0uL,
    public var ReceiveTime: ULong = 0uL,
    public var PageCount: UInt = 0u,
    public var Csid: PCWSTR = 0L,
    public var Tsid: PCWSTR = 0L,
    public var CallerId: PCWSTR = 0L,
    public var RoutingInfo: PCWSTR = 0L,
    public var ReceiverName: PCWSTR = 0L,
    public var ReceiverNumber: PCWSTR = 0L,
    public var DeviceName: PCWSTR = 0L,
    public var DeviceId: UInt = 0u,
    public var RoutingInfoData: Long = 0L,
    public var RoutingInfoDataSize: UInt = 0u,
)

public data class FAX_ROUTE_CALLBACKROUTINES(
    public var SizeOfStruct: UInt = 0u,
    public var FaxRouteAddFile: PFAXROUTEADDFILE = null,
    public var FaxRouteDeleteFile: PFAXROUTEDELETEFILE = null,
    public var FaxRouteGetFile: PFAXROUTEGETFILE = null,
    public var FaxRouteEnumFiles: PFAXROUTEENUMFILES = null,
    public var FaxRouteModifyRoutingData: PFAXROUTEMODIFYROUTINGDATA = null,
)

public data class FAX_ROUTING_METHODA(
    public var SizeOfStruct: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var Enabled: BOOL = 0,
    public var DeviceName: PCSTR = 0L,
    public var Guid: PCSTR = 0L,
    public var FriendlyName: PCSTR = 0L,
    public var FunctionName: PCSTR = 0L,
    public var ExtensionImageName: PCSTR = 0L,
    public var ExtensionFriendlyName: PCSTR = 0L,
)

public data class FAX_ROUTING_METHODW(
    public var SizeOfStruct: UInt = 0u,
    public var DeviceId: UInt = 0u,
    public var Enabled: BOOL = 0,
    public var DeviceName: PCWSTR = 0L,
    public var Guid: PCWSTR = 0L,
    public var FriendlyName: PCWSTR = 0L,
    public var FunctionName: PCWSTR = 0L,
    public var ExtensionImageName: PCWSTR = 0L,
    public var ExtensionFriendlyName: PCWSTR = 0L,
)

public data class FAX_SEND(
    public var SizeOfStruct: UInt = 0u,
    public var FileName: PWSTR = 0L,
    public var CallerName: PWSTR = 0L,
    public var CallerNumber: PWSTR = 0L,
    public var ReceiverName: PWSTR = 0L,
    public var ReceiverNumber: PWSTR = 0L,
    public var Branding: BOOL = 0,
    public var CallHandle: UInt = 0u,
    public var Reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FAX_SEND) return false
        if (this.SizeOfStruct != other.SizeOfStruct) return false
        if (this.FileName != other.FileName) return false
        if (this.CallerName != other.CallerName) return false
        if (this.CallerNumber != other.CallerNumber) return false
        if (this.ReceiverName != other.ReceiverName) return false
        if (this.ReceiverNumber != other.ReceiverNumber) return false
        if (this.Branding != other.Branding) return false
        if (this.CallHandle != other.CallHandle) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.SizeOfStruct.hashCode()
        result = 31 * result + this.FileName.hashCode()
        result = 31 * result + this.CallerName.hashCode()
        result = 31 * result + this.CallerNumber.hashCode()
        result = 31 * result + this.ReceiverName.hashCode()
        result = 31 * result + this.ReceiverNumber.hashCode()
        result = 31 * result + this.Branding.hashCode()
        result = 31 * result + this.CallHandle.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class FAX_TIME(public var Hour: UShort = 0u, public var Minute: UShort = 0u)

public data class STINOTIFY(
    public var dwSize: UInt = 0u,
    public var guidNotificationCode: GUID = GUID(),
    public var abNotificationData: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STINOTIFY) return false
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

public data class STISUBSCRIBE(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwFilter: UInt = 0u,
    public var hWndNotify: HWND = 0L,
    public var hEvent: HANDLE = 0L,
    public var uiNotificationMessage: UInt = 0u,
)

public data class STI_DEVICE_INFORMATIONW(
    public var dwSize: UInt = 0u,
    public var DeviceType: UInt = 0u,
    public var szDeviceInternalName: UShortArray = UShortArray(128),
    public var DeviceCapabilitiesA: STI_DEV_CAPS = STI_DEV_CAPS(),
    public var dwHardwareConfiguration: UInt = 0u,
    public var pszVendorDescription: PWSTR = 0L,
    public var pszDeviceDescription: PWSTR = 0L,
    public var pszPortName: PWSTR = 0L,
    public var pszPropProvider: PWSTR = 0L,
    public var pszLocalName: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STI_DEVICE_INFORMATIONW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.DeviceType != other.DeviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.DeviceCapabilitiesA != other.DeviceCapabilitiesA) return false
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
        result = 31 * result + this.DeviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.DeviceCapabilitiesA.hashCode()
        result = 31 * result + this.dwHardwareConfiguration.hashCode()
        result = 31 * result + this.pszVendorDescription.hashCode()
        result = 31 * result + this.pszDeviceDescription.hashCode()
        result = 31 * result + this.pszPortName.hashCode()
        result = 31 * result + this.pszPropProvider.hashCode()
        result = 31 * result + this.pszLocalName.hashCode()
        return result
    }
}

public data class STI_DEVICE_STATUS(
    public var dwSize: UInt = 0u,
    public var StatusMask: UInt = 0u,
    public var dwOnlineState: UInt = 0u,
    public var dwHardwareStatusCode: UInt = 0u,
    public var dwEventHandlingState: UInt = 0u,
    public var dwPollingInterval: UInt = 0u,
)

public data class STI_DEV_CAPS(public var dwGeneric: UInt = 0u)

public data class STI_DIAG(
    public var dwSize: UInt = 0u,
    public var dwBasicDiagCode: UInt = 0u,
    public var dwVendorDiagCode: UInt = 0u,
    public var dwStatusMask: UInt = 0u,
    public var sErrorInfo: _ERROR_INFOW = _ERROR_INFOW(),
)

public data class STI_USD_CAPS(public var dwVersion: UInt = 0u, public var dwGenericCaps: UInt = 0u)

public data class STI_WIA_DEVICE_INFORMATIONW(
    public var dwSize: UInt = 0u,
    public var DeviceType: UInt = 0u,
    public var szDeviceInternalName: UShortArray = UShortArray(128),
    public var DeviceCapabilitiesA: STI_DEV_CAPS = STI_DEV_CAPS(),
    public var dwHardwareConfiguration: UInt = 0u,
    public var pszVendorDescription: PWSTR = 0L,
    public var pszDeviceDescription: PWSTR = 0L,
    public var pszPortName: PWSTR = 0L,
    public var pszPropProvider: PWSTR = 0L,
    public var pszLocalName: PWSTR = 0L,
    public var pszUiDll: PWSTR = 0L,
    public var pszServer: PWSTR = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STI_WIA_DEVICE_INFORMATIONW) return false
        if (this.dwSize != other.dwSize) return false
        if (this.DeviceType != other.DeviceType) return false
        if (!this.szDeviceInternalName.contentEquals(other.szDeviceInternalName)) return false
        if (this.DeviceCapabilitiesA != other.DeviceCapabilitiesA) return false
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
        result = 31 * result + this.DeviceType.hashCode()
        result = 31 * result + this.szDeviceInternalName.contentHashCode()
        result = 31 * result + this.DeviceCapabilitiesA.hashCode()
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

public data class _ERROR_INFOW(
    public var dwSize: UInt = 0u,
    public var dwGenericError: UInt = 0u,
    public var dwVendorError: UInt = 0u,
    public var szExtendedErrorText: UShortArray = UShortArray(255),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is _ERROR_INFOW) return false
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
