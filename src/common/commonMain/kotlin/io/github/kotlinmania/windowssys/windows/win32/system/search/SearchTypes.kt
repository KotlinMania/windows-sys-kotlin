package io.github.kotlinmania.windowssys.windows.win32.system.search

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

public typealias AccessMaskenum = Int

public typealias AuthType = Int

public typealias CaseRequirement = Int

public typealias ChannelAgentFlags = Int

public typealias ClusionReason = Int

public typealias ConditionCreationOptions = Int

public typealias Createsubscriptionflags = Int

public typealias CatalogPausedReason = Int

public typealias CatalogStatus = Int

public typealias Dbaccessorflagsenum = Int

public typealias Dbasynchopenum = Int

public typealias Dbasynchphaseenum = Int

public typealias Dbbindflagenum = Int

public typealias Dbbindstatusenum = Int

public typealias Dbbindurlflagenum = Int

public typealias Dbbindurlstatusenum = Int

public typealias Dbbookmark = Int

public typealias Dbcolumndescflagsenum = Int

public typealias Dbcolumnflags15enum = Int

public typealias Dbcolumnflagsdeprecated = Int

public typealias Dbcolumnflagsenum = Int

public typealias Dbcolumnflagsenum20 = Int

public typealias Dbcolumnflagsenum21 = Int

public typealias Dbcolumnflagsenum26 = Int

public typealias Dbcommandpersistflagenum = Int

public typealias Dbcommandpersistflagenum21 = Int

public typealias Dbcompareenum = Int

public typealias Dbcompareopsenum = Int

public typealias Dbcompareopsenum20 = Int

public typealias Dbconstrainttypeenum = Int

public typealias Dbconvertflagsenum = Int

public typealias Dbconvertflagsenum20 = Int

public typealias Dbcopyflagsenum = Int

public typealias Dbcostunitenum = Int

public typealias Dbdataconvertenum = Int

public typealias Dbdeferrabilityenum = Int

public typealias Dbdeleteflagsenum = Int

public typealias Dbeventphaseenum = Int

public typealias Dbexeclimitsenum = Int

public typealias DbindexColOrderenum = Int

public typealias Dbliteralenum = Int

public typealias Dbliteralenum20 = Int

public typealias Dbliteralenum21 = Int

public typealias Dbmatchtypeenum = Int

public typealias Dbmemownerenum = Int

public typealias Dbmoveflagsenum = Int

public typealias Dbparamflagsenum = Int

public typealias Dbparamflagsenum20 = Int

public typealias Dbparamioenum = Int

public typealias Dbpartenum = Int

public typealias Dbpendingstatusenum = Int

public typealias Dbpositionflagsenum = Int

public typealias Dbpromptoptionsenum = Int

public typealias Dbpropenum = Int

public typealias Dbpropenum15 = Int

public typealias Dbpropenum20 = Int

public typealias Dbpropenum21 = Int

public typealias Dbpropenum25 = Int

public typealias Dbpropenum25Deprecated = Int

public typealias Dbpropenum26 = Int

public typealias Dbpropenumdeprecated = Int

public typealias Dbpropflagsenum = Int

public typealias Dbpropflagsenum21 = Int

public typealias Dbpropflagsenum25 = Int

public typealias Dbpropflagsenum26 = Int

public typealias Dbpropoptionsenum = Int

public typealias Dbpropstatusenum = Int

public typealias Dbpropstatusenum21 = Int

public typealias Dbrangeenum = Int

public typealias Dbrangeenum20 = Int

public typealias Dbreasonenum = Int

public typealias Dbreasonenum15 = Int

public typealias Dbreasonenum25 = Int

public typealias Dbresourcekindenum = Int

public typealias Dbresultflagenum = Int

public typealias Dbrowchangekindenum = Int

public typealias Dbrowstatusenum = Int

public typealias Dbrowstatusenum20 = Int

public typealias Dbseekenum = Int

public typealias Dbsortenum = Int

public typealias Dbsourcetypeenum = Int

public typealias Dbsourcetypeenum20 = Int

public typealias Dbsourcetypeenum25 = Int

public typealias Dbstatusenum = Int

public typealias Dbstatusenum20 = Int

public typealias Dbstatusenum21 = Int

public typealias Dbstatusenum25 = Int

public typealias Dbstatusenum26 = Int

public typealias Dbtablestatisticstype26 = Int

public typealias Dbtypeenum = Int

public typealias Dbtypeenum15 = Int

public typealias Dbtypeenum20 = Int

public typealias Dbupdelruleenum = Int

public typealias Dbwatchmodeenum = Int

public typealias Dbwatchnotifyenum = Int

public typealias Dcinfotypeenum = Int

public typealias DeliveryAgentFlags = Int

public typealias EBindInfoOptions = Int

public typealias FollowFlags = Int

public typealias Haccessor = Int

public typealias IntervalLimitKind = Int

public typealias Kagreqdiagflagsenum = Int

public typealias Lockmodeenum = Int

public typealias Msdsdbinitpropenum = Int

public typealias Msdssessionpropenum = Int

public typealias NamedEntityCertainty = Int

public typealias Ospcomp = Int

public typealias Ospfind = Int

public typealias Ospformat = Int

public typealias Osprw = Int

public typealias Ospxfer = Int

public fun interface PfnfilltextbufferFn {
    public operator fun invoke(ptextsource: MutPtr): Hresult
}

public typealias Pfnfilltextbuffer = PfnfilltextbufferFn?

public typealias PrioritizeFlags = Int

public typealias PriorityLevel = Int

public typealias ProxyAccess = Int

public typealias QueryParserManagerOption = Int

public typealias RowseteventItemstate = Int

public typealias RowseteventType = Int

public typealias SearchIndexingPhase = Int

public typealias SearchKindOfChange = Int

public typealias SearchNotificationPriority = Int

public typealias SearchQuerySyntax = Int

public typealias SearchTermExpansion = Int

public typealias Sqlinterval = Int

public typealias Sqlvarenum = Int

public fun interface SqlAsyncNotificationCallbackFn {
    public operator fun invoke(pcontext: ConstPtr, flast: Bool): Short
}

public typealias SqlAsyncNotificationCallback = SqlAsyncNotificationCallbackFn?

public typealias StructuredQueryMultioption = Int

public typealias StructuredQueryParseError = Int

public typealias StructuredQueryResolveOption = Int

public typealias StructuredQuerySingleOption = Int

public typealias StructuredQuerySyntax = Int

public typealias Subscriptioninfoflags = Int

public typealias Subscriptionschedule = Int

public typealias Subscriptiontype = Int

public typealias WebcrawlRecurseflags = Int
