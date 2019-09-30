import { Guid } from 'guid-typescript';

export interface Track
{
    id: number;
    name : string,
    artist : string,
    url : string,
    streamable: string,
    listeners : number,
    image : string
}