import Image from 'next/image'
import { Input } from 'postcss'
import React from 'react'
import { ReactDOM } from 'react'

import Data from './accounts.json';
import accounts from "./accounts.json"
import axios from "axios";

export default function Home() {
  return (
    <>
      <div>
        <input type="text" className="input-search" />
        <input type="button" value="search" className="button-search" />
      </div>
      {
          // accounts.forEach((element)=> console.log(element))
        }

      <div className="table-area">
        <table>
          <tr>
            <th>名前</th>
            <th>年齢</th>
            <th>アカウントid</th>
          </tr>
          {axios.get("http://localhost:8080/accounts/selectAll").then(res=>
          res.data.map(({name,age,id}:{name:string, age:number, id:number},index:number)=>(
            <tr>
              <td>{name}</td>
              <td>{age}</td>
              <td>{id}</td>
            </tr>
          )))}
        </table>
      </div>
    </>
  )
}
