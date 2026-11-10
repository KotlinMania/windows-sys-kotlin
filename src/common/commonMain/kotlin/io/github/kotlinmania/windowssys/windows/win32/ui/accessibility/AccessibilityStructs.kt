package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class Accesstimeout(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iTimeOutMSec: UInt = 0u,
)

public data class ExtendedProperty(
    public var propertyName: Bstr = null,
    public var propertyValue: Bstr = null,
)

public data class Filterkeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iWaitMSec: UInt = 0u,
    public var iDelayMSec: UInt = 0u,
    public var iRepeatMSec: UInt = 0u,
    public var iBounceMSec: UInt = 0u,
)

public data class Highcontrasta(
    public var cbSize: UInt = 0u,
    public var dwFlags: HighcontrastwFlags = 0u,
    public var lpszDefaultScheme: Pstr = null,
)

public data class Highcontrastw(
    public var cbSize: UInt = 0u,
    public var dwFlags: HighcontrastwFlags = 0u,
    public var lpszDefaultScheme: Pwstr = null,
)

public data class Mousekeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iMaxSpeed: UInt = 0u,
    public var iTimeToMaxSpeed: UInt = 0u,
    public var iCtrlSpeed: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class Msaamenuinfo(
    public var dwMSAASignature: UInt = 0u,
    public var cchWText: UInt = 0u,
    public var pszWText: Pwstr = null,
)

public data class Serialkeysa(
    public var cbSize: UInt = 0u,
    public var dwFlags: SerialkeysFlags = 0u,
    public var lpszActivePort: Pstr = null,
    public var lpszPort: Pstr = null,
    public var iBaudRate: UInt = 0u,
    public var iPortState: UInt = 0u,
    public var iActive: UInt = 0u,
)

public data class Serialkeysw(
    public var cbSize: UInt = 0u,
    public var dwFlags: SerialkeysFlags = 0u,
    public var lpszActivePort: Pwstr = null,
    public var lpszPort: Pwstr = null,
    public var iBaudRate: UInt = 0u,
    public var iPortState: UInt = 0u,
    public var iActive: UInt = 0u,
)

public data class Soundsentrya(
    public var cbSize: UInt = 0u,
    public var dwFlags: SoundsentryFlags = 0u,
    public var iFSTextEffect: SoundsentryTextEffect = 0u,
    public var iFSTextEffectMSec: UInt = 0u,
    public var iFSTextEffectColorBits: UInt = 0u,
    public var iFSGrafEffect: SoundSentryGraphicsEffect = 0u,
    public var iFSGrafEffectMSec: UInt = 0u,
    public var iFSGrafEffectColor: UInt = 0u,
    public var iWindowsEffect: SoundsentryWindowsEffect = 0u,
    public var iWindowsEffectMSec: UInt = 0u,
    public var lpszWindowsEffectDLL: Pstr = null,
    public var iWindowsEffectOrdinal: UInt = 0u,
)

public data class Soundsentryw(
    public var cbSize: UInt = 0u,
    public var dwFlags: SoundsentryFlags = 0u,
    public var iFSTextEffect: SoundsentryTextEffect = 0u,
    public var iFSTextEffectMSec: UInt = 0u,
    public var iFSTextEffectColorBits: UInt = 0u,
    public var iFSGrafEffect: SoundSentryGraphicsEffect = 0u,
    public var iFSGrafEffectMSec: UInt = 0u,
    public var iFSGrafEffectColor: UInt = 0u,
    public var iWindowsEffect: SoundsentryWindowsEffect = 0u,
    public var iWindowsEffectMSec: UInt = 0u,
    public var lpszWindowsEffectDLL: Pwstr = null,
    public var iWindowsEffectOrdinal: UInt = 0u,
)

public data class Stickykeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: StickykeysFlags = 0u,
)

public data class Togglekeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class UIAutomationEventInfo(
    public var guid: Guid = Guid(),
    public var pProgrammaticName: Pcwstr = null,
)

public data class UIAutomationMethodInfo(
    public var pProgrammaticName: Pcwstr = null,
    public var doSetFocus: Bool = 0,
    public var cInParameters: UInt = 0u,
    public var cOutParameters: UInt = 0u,
    public var pParameterTypes: Int? = null,
    public var pParameterNames: Pcwstr? = null,
)

public data class UIAutomationParameter(
    public var type: UIAutomationType = 0,
    public var pData: COpaquePointer? = null,
)

public data class UIAutomationPatternInfo(
    public var guid: Guid = Guid(),
    public var pProgrammaticName: Pcwstr = null,
    public var providerInterfaceId: Guid = Guid(),
    public var clientInterfaceId: Guid = Guid(),
    public var cProperties: UInt = 0u,
    public var pProperties: UIAutomationPropertyInfo? = null,
    public var cMethods: UInt = 0u,
    public var pMethods: UIAutomationMethodInfo? = null,
    public var cEvents: UInt = 0u,
    public var pEvents: UIAutomationEventInfo? = null,
    public var pPatternHandler: COpaquePointer? = null,
)

public data class UIAutomationPropertyInfo(
    public var guid: Guid = Guid(),
    public var pProgrammaticName: Pcwstr = null,
    public var type: UIAutomationType = 0,
)

public data class UiaAndOrCondition(
    public var conditionType: ConditionType = 0,
    public var ppConditions: COpaquePointer? = null,
    public var cConditions: Int = 0,
)

public data class UiaAsyncContentLoadedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var asyncContentLoadedState: AsyncContentLoadedState = 0,
    public var percentComplete: Double = 0.0,
)

public data class UiaCacheRequest(
    public var pViewCondition: UiaCondition? = null,
    public var scope: TreeScope = 0,
    public var pProperties: Int? = null,
    public var cProperties: Int = 0,
    public var pPatterns: Int? = null,
    public var cPatterns: Int = 0,
    public var automationElementMode: AutomationElementMode = 0,
)

public data class UiaChangeInfo(
    public var uiaId: Int = 0,
    public var payload: Variant = Variant(),
    public var extraInfo: Variant = Variant(),
)

public data class UiaChangesEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var eventIdCount: Int = 0,
    public var pUiaChanges: UiaChangeInfo? = null,
)

public data class UiaCondition(
    public var conditionType: ConditionType = 0,
)

public data class UiaEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
)

public data class UiaFindParams(
    public var maxDepth: Int = 0,
    public var findFirst: Bool = 0,
    public var excludeRoot: Bool = 0,
    public var pFindCondition: UiaCondition? = null,
)

public data class UiaNotCondition(
    public var conditionType: ConditionType = 0,
    public var pCondition: UiaCondition? = null,
)

public data class UiaPoint(
    public var x: Double = 0.0,
    public var y: Double = 0.0,
)

public data class UiaPropertyChangedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: UiaEventId = 0,
    public var propertyId: Int = 0,
    public var oldValue: Variant = Variant(),
    public var newValue: Variant = Variant(),
)

public data class UiaPropertyCondition(
    public var conditionType: ConditionType = 0,
    public var propertyId: UiaPropertyId = 0,
    public var value: Variant = Variant(),
    public var flags: PropertyConditionFlags = 0,
)

public data class UiaRect(
    public var left: Double = 0.0,
    public var top: Double = 0.0,
    public var width: Double = 0.0,
    public var height: Double = 0.0,
)

public data class UiaStructureChangedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var structureChangeType: StructureChangeType = 0,
    public var pRuntimeId: Int? = null,
    public var cRuntimeIdLen: Int = 0,
)

public data class UiaTextEditTextChangedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var textEditChangeType: TextEditChangeType = 0,
    public var pTextChange: Safearray? = null,
)

public data class UiaWindowClosedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var pRuntimeId: Int? = null,
    public var cRuntimeIdLen: Int = 0,
)
